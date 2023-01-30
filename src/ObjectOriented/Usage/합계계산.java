package ObjectOriented.Usage;
/*
오버로딩
-생성자 오버로딩 : 함수 이름은 같으나 인자가 다름
-메소드 오버로딩 : 클래스 내부에서 인자가 다르나 이름이 같은 메소드가 여러개 정의, 반환값은 다를 수 있지만 인자가 같을 수는 없음


+오버로딩의 경우 메소드와 정적 메소드는 무관
정적메소드의 오버로딩은 이름이 같고 매개변수가 다르면 가능

다만, 정적 메소드의 경우 클래스 내부에 소속된 변수들의 접근 못함
또한 정적 메소드 내부에서는 this, super 사용 못함
this나 super은 인스턴스가 된 상태에서 사용하는 개념
static은 인스턴스가 아닌 클래스 내부에 선언된 메소드 혹은 속성임

static은 생성하지 않고 사용한다 > util을 구현할 때 유용
* */
public class 합계계산 {
    int 내부값1;
    public static int 더하기(int 값1, int 값2){
        //return 값1 + 값2 + this.내부값; static 내에서는 클래스 내의 내부적인 속성 사용 불가, 생성된 게 아니라서
        //return 값1 + 값2 + 내부값;
        return 값1 + 값2;
    }

    public long 더하기(int 값1, int 값2, int 값3){
        return 값1 + 값2 + 값3;
    }

    public long 더하기(int[] 값, int 값개수){
        int sum = 0;
        for (int i = 0; i < 값개수; i++) {
            sum += 값[i];
        }
        return sum;
    }
}
