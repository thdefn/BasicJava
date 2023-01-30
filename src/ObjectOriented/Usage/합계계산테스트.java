package ObjectOriented.Usage;

public class 합계계산테스트 {
    public static void main(String[] args) {
        합계계산 계산1 = new 합계계산();
        System.out.println(계산1.더하기(10,20));
        System.out.println(계산1.더하기(10,20,30));
        System.out.println(계산1.더하기(new int[]{10,20,30,40,50}, 5));

        //static으로 실행하는 경우 생성하지 않고 그대로 호출
        System.out.println(합계계산.더하기(10,20));
    }
}
