package ObjectOriented.Concept;
/*
*
생성자의 구성
-반환형을 기술하지 않으며 이름은 반드시 클래스 이름
-생성자의 인자는 필요하면 기술
-생성자는 주로 접근 지정자 public을 사용
    :만일 필요하다면 생성자의 접근 지정자도 private 또는 protected도 가능 > 보통 singleton 패턴에서 사용, 생성자 생성 불가
-생성자의 반대인 소멸자도 존재 finalize
    :포인터를 가지고 있는 언어들은 소멸자를 처리함 But 자바 vm의 판단으로 소멸시킴 (가비지 컬렉터)
* */
public class 학생테스트 {
    public static void main(String[] args) {
        /*학생 공부하는학생 = new 학생(); //기본 생성자, 만들지 않아도 제공함
        공부하는학생.이름 = "박하은";
        System.out.println(공부하는학생.이름);*/

        학생 공부안하는학생 = new 학생("송원선");
        System.out.println(공부안하는학생.이름);

        //기본 생성자는 만들지 않아도 제공하는데 왜 추가가 안될까? : 임의 정의한 생성자가 추가되는 순간 기본 생성자는 추가 안됨
        학생 조는학생 = new 학생();
        조는학생.이름 = "박하영";

        System.out.println(조는학생.이름);
    }
}
