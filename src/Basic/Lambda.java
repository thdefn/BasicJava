package Basic;
/*
람다 표현식(Lambda Expression)
-메서드를 하나의 식으로 표현한 것
-형태는 매개 변수를 가진 코드 블록이지만 런타임 시에는 익명 클래스를 생성
-간략하면서도 명확한 식으로 표현
-객체지향보다 함수 지향 언어와 가까움
-(타입 매개 변수)->{}
-익명 함수 (Anonymous function) : 일회용 함수

장점
-코드의 간결성
-코드의 가독성이 높아짐
-생산성이 높아짐

단점
-재사용이 불가능 (익명)
-디버깅 어려움, 메서드는 중단점 설정해서 확인하기 편하나 람다식은 어려움
-재귀 함수로는 맞지 않음

* */
interface ComputeTool{
    public abstract int compute(int x, int y);

    //람다식은 인터페이스에 추장 메서드가 하나가 아닌 두 개인 경우 사용 제한됨
    //public abstract int compute2(int x, int y);
}

interface CompareTool{
    public abstract int getMaxNum(int num1, int num2);
}

public class Lambda {

    public static void main(String[] args) {
        //익명 클래스 = 일회용 클래스
        ComputeTool computeTool = new ComputeTool() {
            @Override
            public int compute(int x, int y) {
                return x+y;
            }

            //@Override
            public int compute2(int x, int y) {
                return x-y;
            }
        };
        System.out.println(computeTool.compute(1,2));

        //람다식
        ComputeTool computeTool2 = (x, y) -> {return x + y; };
        System.out.println(computeTool2.compute(1,2));

        //예제
        CompareTool practice = new CompareTool() {
            @Override
            public int getMaxNum(int num1, int num2) {
                return num1 > num2 ? num1 : num2;
            }
        };
        System.out.println(practice.getMaxNum(10,11));

        CompareTool practice2 = (x, y) -> {return (x>y) ? x : y ;};
        System.out.println(practice2.getMaxNum(10,11));

    }
}
