package ObjectOriented.Concept;

import java.util.Calendar;

public class CircleTest {
    public static void main(String[] args) {
        //static인 pi는 클래스가 가지고 있기 때문에 객체들이 공유한다
        Circle c1 = new Circle(10);
        System.out.println("원의 넓이: "+c1.getArea());
        System.out.println("원의 둘레: "+c1.getPerimeter());

        Circle c2 = new Circle(100);
        System.out.println("원의 넓이: "+c2.getArea());
        System.out.println("원의 둘레: "+c2.getPerimeter());

        //생성자도 private으로 노출될 수 있다
        //Calendar calendar = new Calendar(); 생성자가 protected 되어 있음

        //Singleton 객체를 하나만 생성하겠다, 어차피 프로젝트가 메모리에 올라가면 클래스도 다 올라간다
        Calendar calendar = Calendar.getInstance(); // public static Calendar getInstance(){}

    }
}
