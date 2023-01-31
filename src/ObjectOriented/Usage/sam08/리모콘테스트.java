package ObjectOriented.Usage.sam08;

public class 리모콘테스트 {
    public static void main(String[] args) {
        //일반적인 리모콘에 대한 클래스
        /*
        System.out.println("--------------");
        리모콘 리모콘1 = new 리모콘(); error 인터페이스는 인스턴스를 생성할 수 없다
        리모콘1.전원켜기();
        리모콘1.전원끄기();
         */

        System.out.println("--------------");
        삼성리모콘 삼성리모콘1 = new 삼성리모콘();
        삼성리모콘1.전원켜기();
        삼성리모콘1.음악듣기();
        삼성리모콘1.전원끄기();
        System.out.println("--------------");
        엘지리모콘 엘지리모콘1 = new 엘지리모콘();
        엘지리모콘1.전원켜기();
        엘지리모콘1.전화받기();
        엘지리모콘1.전원끄기();
    }
}
