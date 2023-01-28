package ObjectOriented.Usage;

public class 자동차 extends 차량{
    public String 이름="자동차";
    public String 배기량;

    //부모의 함수와 동일한 함수(리턴 타입, 파라미터, 메서드 명이 동일)한 함수를 생성해 호출하면, 나 자신의 메서드를 호출한다
    public void 정보출력() {
        System.out.println("(차량)이름: "+super.이름); //내 부모에 있는 어떤 거에 접근하고 싶을 때
        System.out.println("최대속도: "+최대속도);
        System.out.println("정원: "+정원);

        System.out.println("(자동차)이름: "+this.이름); //나 자신
        System.out.println("배기량: "+배기량);
    }
}
