package ObjectOriented.Usage;
/*
상속
-this는 객체 자신을 의미하는 키워드
-super는 상위 객체를 의미하는 키워드

기본 생성자 구현 첫 줄에서의 super()
-super()는 상위 클래스의 기본 생성자를 호출하는 문장
-생성자의 첫 줄에서 상위 생성자를 호출하는 super() 또는 super(...)을 명시적으로 호출하지 않는다면 첫 줄에서 무조건 자동으로 super()을 호출
-자동으로 사용되는 기본 생성자의 첫 줄은 무조건 super()을 호출

사용자가 직접 구현하는 생성자에서의 첫 줄
-상위 생성자의 호출인 super() 또는 super(...)가 아니면 자동으로 기본 생성자 super() 호출
-이때 상위 클래스에서 기본 생성자를 사용할 수 없다면 문법 오류 발생

+모든 클래스는 생성자가 호출된다
* */
public class 자동차 extends 차량{
    public String 이름="자동차";
    public String 배기량;


    //부모의 기본 생성자 없을 시 에러남 커스텀 생성자 추가시 JAVA가 기본 생성자 만들어주지 않아서
    //자동차의 기본 생성자가 부모 클래스의 기본 생성자를 호출해야 하기 때문에 생성 불가
    public 자동차(){
        super(); //Call to 'super()' must be first statement in constructor body
        //차량의 생성자도 호출 super()을 하지 않아도 자동으로 호출된가
        System.out.println("자동차의 생성자 호출");
    }

    public 자동차(double 최대속도, int 정원, String 배기량){
        super(최대속도, 정원);
        //최대속도와 정원은 내 부모값을 가지고 초기화 필요
        //super.최대속도 = 최대속도;
        //super.정원 = 정원;
        this.배기량 = 배기량;
        System.out.println("차량의 생성자(매개변수 : 최대속도, 정원, 배기량) 호출");
    }

    //부모의 함수와 동일한 함수(리턴 타입, 파라미터, 메서드 명이 동일) 함수를 생성해 호출하면, 나 자신의 메서드를 호출한다
    public void 정보출력() {
        System.out.println("(차량)이름: "+super.이름); //내 부모에 있는 어떤 거에 접근하고 싶을 때
        System.out.println("최대속도: "+최대속도);
        System.out.println("정원: "+정원);

        System.out.println("(자동차)이름: "+this.이름); //나 자신
        System.out.println("배기량: "+배기량);
    }
}
