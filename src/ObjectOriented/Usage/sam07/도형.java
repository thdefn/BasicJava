package ObjectOriented.Usage.sam07;

public abstract class 도형 { //추상 메소드를 가진 클래스는 반드시 추상 클래스
    protected int x좌표값;
    protected int y좌표값;

    public 도형(int x좌표값, int y좌표값){
        this.x좌표값 = x좌표값;
        this.y좌표값 = y좌표값;
    }

    //추상클래스도 완전한 함수를 가지고 있을 수 있다
    public void 초기화(){
        x좌표값 = 0;
        y좌표값 = 0;
    }

    //이건 나를 상속받은 너희들이 구현해줬으면 좋겠어
    public abstract void 그리기();
}
