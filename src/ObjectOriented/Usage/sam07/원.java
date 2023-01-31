package ObjectOriented.Usage.sam07;

public class 원 extends 도형{ //상속받자마자 error 1.생성자 2.추상메서드 구현

    int 반지름;

    //1.생성자 구현
    public 원(int x좌표값, int y좌표값, int 반지름){
        super(x좌표값, y좌표값);
        this.반지름 = 반지름;
    }

    @Override
    public void 그리기() {
        System.out.println("----------원 그리기-----------");
        System.out.println("좌표값: ("+x좌표값+", "+y좌표값+")");
        System.out.println("반지름: "+반지름);
    }

    //부모의 일반함수 오버라이드
    @Override
    public void 초기화() {
        super.초기화();
        반지름 = 0;
    }
}
