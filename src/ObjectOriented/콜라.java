package ObjectOriented;
/*
멤버 변수의 초기화 방법
-명시적 초기화
    :멤버 변수가 선언할 때 같이 초기화
-초기화 블럭
    :클래스 초기화 블럭
    :인스턴스 초기화 블럭
-생성자
* */
public class 콜라 {
    //명시적 초기화: 변수를 선언할 때 값을 할당하는 것
    private static int 용량 = 20;
    //private final static int 용량 = 20;
    private int 제조일자 = 10;

    //초기화 블럭
    static{
        System.out.println("클래스 초기화 블럭");
        용량 = 40;
        //제조일자 = 50; error 제조일자는 인스턴스 변수
        System.out.println(용량);
        //System.out.println(제조일자);
    }

    {
        System.out.println("인스턴스 초기화 블럭");
        용량 = 40;
        제조일자 = 50;
        System.out.println(용량);
        System.out.println(제조일자);
    }

    public 콜라(){
        System.out.println("생성자 호출");
        용량 = 60;
        제조일자 = 60;
        System.out.println(용량);
        System.out.println(제조일자);
    }
}
