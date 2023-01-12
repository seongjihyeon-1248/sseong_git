lecture
============

# Jetpack
Jetpack이란?
2018년 5월 8일에 구글이 발표한(TMI) 라이브러리와 도구 모음집
Jetpack의 라이브러들을 묶은 패키지 명 = AndroidX
기존 support library의 문제점들을 보완
* support library의 문제점은?
  * 패키지명과 버전 규칙의 모호성
  * 단일 라이브러리 ... 하나만 추가하면 많은 기능을 사용할 수 있지만, 필요없는 기능도 추가된다는 뜻
    * 앱의 규모를 커지도록 유도 ... '64K reference limit'(dex파일이 64K를 넘어가면서 뜨는 에러)를 맞이할 수 있음
      * java - class - dex 구조 
      * dex를 쪼개는 multidex기술도 있으나 여전히 별로...
      * 바이너리 호환성 제약
    * 한꺼번에 업데이트 한꺼번에 다운그레이드 해야 함

결론 
    * 여러분이 androidx가 아니라 android를 사용하게 됐을 때 문제가 생기는 이유는 이것 때문입니다... 

## room
room - 앱 내부에 데이터를 관리하는 기능을 도와주는 라이브러리

### Java
##### 준비
build.gradle 모듈
```
dependencies{
    ...
    implementation 'androidx.room:room-runtime:2.1.0'
    annotationProcessor 'androidx.room:room-compiler:2.1.0'
}
```
#### 예시
##### 데이터 항목
```java
@Entity
public class Todo {
    @PrimaryKey(autoGenerate = true)  //기본키, 자동 생성
    private int id; 
    private String title;

    //생성자, 설정자, 접근자...
}
```
##### 데이터 엑세스 (등록, 수정, 조회, 삭제 기능 제공) (인터페이스)
```java
@Dao
public interface TodoDao {
    @Query("SELECT * FROM Todo")
    List<Todo> getAll();

    @Insert
    void insert(Todo todo);

    @Update
    void update(Todo todo);

    @Delete
    void delete(Todo todo);
}
```
#####  데이터 베이스
```java
@Database(entities = {Todo.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TodoDao todoDao();
}
```
#####  데이터 사용
```java
AppDatabase db = Room.databaseBuilder(this, AppDatabase.class, "todo-db")
                .allowMainThreadQueries()
                .build();

db.todoDao().getAll().toString()
db.todoDao().insert(new Todo((mTodoEditText).getText().toString()));
```

### Kotlin
##### 준비
plugins {
    ...
    id 'kotlin-android-extensions'
    id 'kotlin-kapt'
}
```
dependencies{
    implementation 'androidx.core:core-ktx:1.3.2'
    ...
    implementation 'androidx.room:room-runtime:2.1.0'
    kapt 'androidx.room:room-compiler:2.1.0'
}
```
#### 예시
##### 데이터 항목
```kotlin
@Entity
data class Todo(var title: String) {  //생성자에 title
    @PrimaryKey(autoGenerate = true) var id: Int = 0 //기본키, 자동 생성 : var id: Int = 0
}
```
##### 데이터 엑세스 (등록, 수정, 조회, 삭제 기능 제공) (인터페이스)
```kotlin
@Dao
interface TodoDao {
    @Query("SELECT * FROM Todo")
    fun getAll(): List<Todo>

    @Insert
    fun insert(todo: Todo)

    @Update
    fun update(todo: Todo)

    @Delete
    fun delete(todo: Todo)
}
```
##### 데이터 베이스
```kotlin
@Database(entities = [Todo::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun todoDao(): TodoDao
}
```
##### 데이터 사용
```kotlin
val db = Room.databaseBuilder(this, AppDatabase::class.java, "todo-db") //this말고 applicationContext도 가능
            .allowMainThreadQueries()
            .build()

db.todoDao().getAll().toString()
db.todoDao().insert(Todo(todo_edit.text.toString()))
```

### Livadata
실시간 데이터 업데이트
#### Java 예시
LiveData이용
```java
db.todoDao().getAll().observe(this, todos -> { ... }); 
//getAll을 하여 결과가 변동 될 때 마다 todos에 저장
```
#### Kotlin 예시
```kotlin
db.todoDao().getAll().observe(this, Observer { ... }); todos ->     // todos ->를 안 쓰면 기본 적으로 it으로 사용됨
//getAll을 하여 결과가 변동 될 때 마다 todos에 저장
```

## viewmodel
* UI와 로직 분리 -  View상에서 보여주는 데이터를 캡슐화하여 Lifecycle이 변화하여도 데이터를 유지하는 것이다. 
* View의 Lifecycle에 맞춰 model(데이터)를 유지시킴 (액티비티의 lifecycle)
* 액티비티가 onDestroy 되던지 onStop 되던지(정상적으로 종료되지 못하더라도) 데이터는 유지
    * cf) Lifecycle의 범위를 scope라고 함
* 데이터의 저장과 처리를 분리하는 독립적인 개발이 가능하다는 점에서 유지보수에 용이
* viewmodel providers - viewmodle을 사용할 수 있도록 해주는 라이브러리 -> 사용
### Java
##### 준비
```
dependencies{
    ...
implementation 'androidx.lifecycle:lifecycle-extensions:2.0.0'
implementation 'androidx.lifecycle:lifecycle-viewmodel:2.2.0'
 }
 ```
#### 예시

##### viewmoodel
db 가지고 있음
inset getall 메소드를 가지고 있음
기존 메인 액티비티의 변수와 기능을 클래스 변수 혹은 메소드로 정의
```java
     public MainViewModel(@NonNull Application application){
        super(application);
        db = Room.databaseBuilder(application, AppDatabase.class, "todo-db")
                .build();
    }
    public LiveData<List<Todo>> getAll(){
        return db.todoDao().getAll();
    }

    public void insert(Todo todo) {
        new InsertAsyncTask(db.todoDao())
                .execute(todo);
    }
 ```

##### 데이터 사용
```java
MainViewModel viewModel = new ViewModelProvider(this, new ViewModelProvider.AndroidViewModelFactory(getApplication()))
                .get(MainViewModel.class); //db를 가지고 있는 MainViewModel객체 생성

viewModel.getAll().observe(this, todos -> {
            mResultTextView.setText(todos.toString());
        });

viewModel.insert(new Todo((mTodoEditText).getText().toString()));              
```
### Kotlin
##### 준비
```
dependencies{
    ...
    implementation 'androidx.lifecycle:lifecycle-extensions:2.0.0'
    implementation 'androidx.lifecycle:lifecycle-viewmodel-ktx:2.5.0'
    implementation 'androidx.lifecycle:lifecycle-runtime-ktx:2.4.0'
 }
 ```
 맨 마지막은 lifecycleScope를 사용하기 위한 종속성 추가임
#### 예시

##### viewmoodel
```kotlin
     public MainViewModel(@NonNull Application application){
        super(application);
        db = Room.databaseBuilder(application, AppDatabase.class, "todo-db")
                .build();
    }
    public LiveData<List<Todo>> getAll(){
        return db.todoDao().getAll();
    }

    public void insert(Todo todo) {
        new InsertAsyncTask(db.todoDao())
                .execute(todo);
    }
 ```

##### 데이터 사용
```kotlin
val viewModel = ViewModelProviders.of(this)[MainViewModel::class.java] //db를 가지고 있는 MainViewModel객체 생성

viewModel.getAll().observe(this, Observer {todos ->
            result_text.text = todos.toString()
        })

viewModel.insert(Todo(todo_edit.text.toString()))             
```