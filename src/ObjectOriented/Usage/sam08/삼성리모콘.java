package ObjectOriented.Usage.sam08;

public class 삼성리모콘 implements 리모콘{
    public void 음악듣기(){
        System.out.println("음악을 들려줍니다");
    }

    //리모콘 인터페이스를 상속받았으면 전원켜기와 전원끄기는 반드시 구현
    @Override
    public void 전원켜기() {
        System.out.println("삼성 TV의 전원을 켭니다");
    }

    @Override
    public void 전원끄기() {
        System.out.println("삼성 TV의 전원을 끕니다");
    }
}
