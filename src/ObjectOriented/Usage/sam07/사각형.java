package ObjectOriented.Usage.sam07;

public class 사각형 extends 도형{ //상속받자마자 error 1.생성자 2.추상메서드 구현

    int 길이;
    int 높이;

    //1.생성자 구현
    public 사각형(int x좌표값, int y좌표값, int 길이, int 높이){
        super(x좌표값, y좌표값);
        this.길이 = 길이;
        this.높이 = 높이;
    }

    @Override
    public void 그리기() {
        System.out.println("----------사각형 그리기-----------");
        System.out.println("좌표값: ("+x좌표값+", "+y좌표값+")");
        System.out.println("길이: "+길이+"내 높이: "+높이);
    }
}
