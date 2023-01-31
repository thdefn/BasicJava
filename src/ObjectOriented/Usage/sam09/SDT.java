package ObjectOriented.Usage.sam09;
/*
군인이라는 클래스를 상속받았으나,
IBS, 대테러진압, 산악행군이라는 인터페이스 역시 상속받음
* */
public class SDT extends 군인 implements IBS, 대테러진압, 데스매치{
    @Override
    public void 구보() {
        System.out.println("SDT가 구보를 한다");
    }

    @Override
    public void 헤드캐리어() {
        System.out.println("약간 엉성하게");
    }

    @Override
    public void 보트진수() {

    }

    @Override
    public void 사격하기() {

    }

    @Override
    public void 인질구조() {

    }

    @Override
    public void 완전군장하기() {

    }

    @Override
    public void 행군하기() {
        System.out.println("행군하기");
    }
}
