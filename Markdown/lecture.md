자바_lecture
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

### room
room - 앱 내부에 데이터를 관리하는 기능을 도와주는 라이브러리
### 준비
build.gradle 모듈
```
dependencies{
    ...
    implementation 'androidx.room:room-runtime:2.1.0'
    annotationProcessor 'androidx.room:room-compiler:2.1.0'
}
```
### 데이터 항목
예시
```java
@Entity
public class Todo {
    @PrimaryKey(autoGenerate = true)  //기본키, 자동 생성
    private int id; 
    private String title;

    //생성자, 설정자, 접근자...
}
```
### 데이터 엑세스 (등록, 수정, 조회, 삭제 기능 제공) (인터페이스)
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
###  데이터 베이스
```java
@Database(entities = {Todo.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract TodoDao todoDao();
}
```
###  데이터 사용
```java
AppDatabase db = Room.databaseBuilder(this, AppDatabase.class, "todo-db")
                .allowMainThreadQueries()
                .build();

db.todoDao().getAll().toString()
db.todoDao().insert(new Todo((mTodoEditText).getText().toString()));
```