package ObjectOriented;

public class 달력테스트 {
    public static void main(String[] args) {
        //달력의 마지막 달은 바뀌지 않는 값임
        //달력 내달력 = new 달력();
        //내달력.LAST_MONTH = 13; final을 붙여주는 순간 error 발생

        //System.out.println(내달력.LAST_MONTH); //13: 이러면 안됨
        //final은 객체를 만들어 주어야 하지만 static을 붙여주는 순간 객체를 생성하지 않고 바로 클래스의 값을 사용 가능
        System.out.println(달력.LAST_MONTH);

        //객체가 만들어질 때 딱 한번 값이 설정되고 그 이후에는 값이 변경되지 않는다 : final만 사용
        달력 내달력 = new 달력(8); //생성될 때 한번 초기화하고 출력하나 그 이후에는 바꿀 수 없음
        System.out.println(내달력.MY_MONTH);
        //내달력.MY_MONTH = 13; error
    }
}
