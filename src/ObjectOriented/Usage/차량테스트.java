package ObjectOriented.Usage;

public class 차량테스트 {
    //무조건 이 클래스에서 실행이 되는 함수가 있다
    public static void main(String[] args) {
        System.out.println("차량테스트");
        차량 차량1 = new 차량();
        차량1.이름 = "차량";
        차량1.최대속도 = 100;
        차량1.정원 = 2;

        차량1.정보출력();
    }
}
