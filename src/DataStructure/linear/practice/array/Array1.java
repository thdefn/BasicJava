package DataStructure.linear.practice.array;
/*
* 배열 arr의 모든 데이터에 대해서,
* 짝수 데이터들의 평균과 홀수 데이터들의 평균을 출력하세요.
* */
public class Array1 {
    static void getMean(int[] arr){
        int evenSum = 0;
        int evenCount = 0;
        int oddSum = 0;
        int oddCount = 0;

        for (int item : arr){
            if(item%2==0){
                evenCount += 1;
                evenSum += item;
            }else{
                oddCount += 1;
                oddSum += item;
            }
        }
        System.out.println("짝수 평균: "+String.valueOf(evenSum/evenCount));
        System.out.println("홀수 평균: "+String.valueOf(oddSum/oddCount));

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        getMean(arr);
    }
}
