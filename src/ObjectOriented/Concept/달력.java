package ObjectOriented.Concept;
/*
지역 변수의 상수
-키워드 final을 명시
-저장된 값을 더 이상 수정할 수 없도록

소속 변수인 필드를 상수로 선언하기 위해
-키위드 final을 명시
-static을 사용하여 정적으로 하는 것을 권유

+static은 정적인 값을 만들고
final은 한 번 정해져서 더 이상 바뀌지 않은 값을 만듦

static은 클래스 자체가 가지고 있는 = 정적인 값을 만들때 사용
final은 상수를 만들때
* */
public class 달력 {
    //public final int LAST_MONTH = 12;
    public static final int LAST_MONTH = 12; //final 앞에 static을 이용해 정적으로 선언하는 경우 많음
    public final int MY_MONTH;

    public 달력(int month){
        MY_MONTH = month;
    }
}
