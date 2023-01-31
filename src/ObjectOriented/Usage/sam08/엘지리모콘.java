package ObjectOriented.Usage.sam08;
/*
java에서 상속은 기본적으로 단일 상속이나
인터페이스를 통한 상속은 다중 상속이 가능하다
* */
public class 엘지리모콘 implements 리모콘, 전화기능{

    @Override
    public void 전원켜기() {
        System.out.println("엘지 TV의 전원을 켭니다");
    }

    @Override
    public void 전원끄기() {
        System.out.println("엘지 TV의 전원을 끕니다");
    }

    @Override
    public void 전화받기() {
        System.out.println("전화를 받습니다");
    }
}
