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

결론 - 여러분이 androidx가 아니라 android를 사용하게 됐을 때 문제가 생기는 이유는 이것 때문입니다...

## room

room - 앱 내부에 데이터를 관리하는 기능을 도와주는 라이브러리

### Java

#### 준비

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

##### 데이터 베이스

```java
@Database(entities = {Todo.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TodoDao todoDao();
}
```

##### 데이터 사용

```java
AppDatabase db = Room.databaseBuilder(this, AppDatabase.class, "todo-db")
                .allowMainThreadQueries()
                .build();

db.todoDao().getAll().toString()
db.todoDao().insert(new Todo((mTodoEditText).getText().toString()));
```

### Kotlin

#### 준비

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

db 가지고 있음
insert getall 메소드를 가지고 있음
기존 메인 액티비티의 변수와 기능을 클래스 변수 혹은 메소드로 정의

### Java

#### 준비

```
dependencies{
    ...
implementation 'androidx.lifecycle:lifecycle-extensions:2.0.0'
implementation 'androidx.lifecycle:lifecycle-viewmodel:2.2.0'
 }
 ```

#### 예시

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

## DataBinding

xml파일에 data를 연결(binding)해서 사용할 수 있게 도와주는 라이브러리
즉, UI 요소와 데이터를 프로그램적 방식으로 연결하지 않고, 선언적 형식으로 결합할 수 있도록 도와주는 라이브러리
-> UI요소에 연결하기 위해 필요한 코드 최소화 가능
findViewbyId를 사용하지 않아도 됨
MVVM패턴을 구현할 때, LiveData와 함께 거의 필수적으로 사용합니다.

##### 디자인 패턴

* MVC
  * Model + View + Controller
  1. Action -> Controller
  2. Controller -> (업데이트) -> Model
  3. controller는 model이 적용될 view 선택
  4. model -> (적용) -> view
  * 단순하지만 view와 model 사이의 의존성이 높아져 어플리케이션이 커질 수록 복잡해지고 유지보수가 어려움.
* MVP
  * Model + View + Presenter
  1. Action -> View
  2. view -> (ask 데이터 줘) -> presenter -> (ask 데이터 줘) -> model
  3. model -> (데이터) -> presenter -> (데이터) -> View
  4. 데이터 -> (적용) -> view
  * view와 model의 의존성이 없지만 view와 presenter 사이의 의존성이 높아짐.
* MVVM
  * Model + View + View Model
  1. Action -> View
  2. View -> Action(command 패턴) -> View Model
  3. View Model -> (ask 데이터 줘) -> model
  4. model -> (데이터) -> View model
  5. view model 데이터 가공
  6. View model -> Data Binding -> view
  * view와 model의 의존성이 없고, view와 model의 의존성이 없지만 view model의 설계가 어려움.

### Java

```
android {
    ...
    dataBinding{
        enabled = true
    }
}
```

xml을 레이아웃 안에 작성해야 함
xml태그를 layout루트에 적용해야 함

```java
ActivityMainBinding binding =  DataBindingUtil.setContentView(this, R.layout.activity_main);

binding.위젯명 //형태로 사용 가능
```

-> findViewbyId를 사용하지 않아도 됨.

xml에서 data를 사용할 수 있게 하는 방법

```java
<layout ...>
    <data>
        <variable
            name= "뷰모델변수명"
            type= 사용할 뷰모델 위치... />
    </data>
</layout>
```

```java
//binding 객체가 livedata를 사용 가능
binding.setLifecycleOwner(this);

//xml에 viewmodel 객체를 넣어줌 (xml의 data 부분에서 정의 해줌)
binding.setViewModel(viewModel);
```

xml에서 아래처럼 사용 가능

```
android:text ="@={viewModel.newTodo}"
android:onClick="@{() -> viewModel.insert(viewModel.newTodo)}"
android:text="@{viewModel.todos.toString()}"
```

위부터 차례로 newTodo에 gettext, newTodo insert, newTodo에 todos 내용들 set

### Kotlin

자바와 거의 비슷하기에 설명은 생략

## Navigation

navigation 뜻은 탐색. 앱 내의 여러 콘텐츠를 탐색하고, 페이지를 왔다 갔다, 들어갔다 되돌아오는 식의 상호작용을 가능하게 함
추가로 앱바, 탐색 창 등, 여러가지 탐색으로 구현하도록 하는 기능 제공

fragment 이용
fragment란 앱 UI의 재사용 가능한 부분을 의미
navigation이 fragment 포함, main이 navigation 추가
app bar 생성(메인 fragment가 아니면 뒤로가기 버튼 표시, label이 앱 바 이름에 적용) (tool bar가 더 나음)
main fragment에서 second fragment로 넘어갈 때 값을 넘겨주며 넘어감

### Java

```
//navigation
implementation 'androidx.navigation:navigation-fragment:2.5.3'
implementation 'androidx.navigation:navigation-ui:2.5.3'
```

```
//값 넘겨주기 (top-level gradle)
dependencies {
    ...
    classpath "androidx.navigation:navigation-safe-args-gradle-plugin:2.5.3"
}
```

```
//값 넘겨주기 
plugins {
    ...
    id 'androidx.navigation.safeargs'
}
```

##### Main

```java
public class MainActivity extends AppCompatActivity {
    AppBarConfiguration appBarConfiguration;

    //버튼 클릭 시 이동
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        앱 바를 구성해 lable을 app 이름으로 적용
        사용자가 다른 대상에 있을 때, 좌측 상단에는 <- 버튼이 표기됨
        아래 두 줄을 한 줄에 생성 시(onCreate에서 NavController를 검색하고자 하면) 오류
        NavHostFragment에서 검색해야 함
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
         */
        NavHostFragment navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        NavController navController = navHostFragment.getNavController();
        appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
    }

    //좌측 상단 <- 버튼 클릭 시, 본래의 화면으로 돌아오는 코트
    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, appBarConfiguration) || super.onSupportNavigateUp();
    }
}
```

##### MainFragment

```java
public class MainFragment extends Fragment {
...
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        MainFragmentDirections.ActionMainFragmentToSecondFragment action = MainFragmentDirections.actionMainFragmentToSecondFragment("Hello!!!");

        view.findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            //버튼 클릭하면 Hello! 라는 메시지가 전달된 second fragment으로 findNacvController를 이용해 목적지로 이동
            @Override
            public void onClick(View view) {
                Navigation.findNavController(view).navigate(action);
            }
        });
    }
}
```

##### SecondFragment

```java
public class SecondFragment extends Fragment {
...
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        //매개변수로 String타입 값을 받아 textview로 출력
        String text = SecondFragmentArgs.fromBundle(getArguments()).getVar();
        TextView textView = view.findViewById((R.id.textView));
        textView.setText(text);
    }
}
```
