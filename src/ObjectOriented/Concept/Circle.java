package ObjectOriented.Concept;
/*
키워드 static
-필드나 메소드의 소속을 클래스로 제한하는 키워드
-static을 사용한 정적 변수나 정적 메소드는 클래스 변수와 클래스 메소드
-정적 필드 PI
    :클래스에 소속된 저장공간이 하나만 존재하는 변수
    :할당된 객체에는 저장공간이 없음
-비정적 필드 radius
    :할당되는 객체마다 저장공간이 할당되는 객체 소속 변수

정적 필드 참조 방법
-정적 필드는 Circle.PI와 같이 클래스이름.정적필드로 참조하는 방법이 원칙
    :c1.PI나 c2.PI와 같이 객체 이름으로도 참조 가능

+기능만 필요하고 객체로서는 필요하지 않은 유틸리티 메서드를 만들 때 ex> DateUtil, StringUtil
기능만 필요하고 객체로서는 필요하지 않다?=담을 공간이 동적으로 필요한 게 아니라 대부분 로직을 수행하는 것
* */
public class Circle {
    double radius; //반지름

    //pi는 값이 고정되어 있다 이 값을 new 호출시마다 메모리 영역을 할당하면 아깝다 8byte가 낭비됨
    //하지만 이런 경우 클래스 내에 공간에 값이 잡혀 있고, 값이 변하지 않는다
    static double PI = 3.141592; //static은 대문자

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return PI*radius*radius;
    }

    public double getPerimeter(){
        return 2*PI*radius;
    }
}
