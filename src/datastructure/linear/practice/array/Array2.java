package datastructure.linear.practice.array;
/*
* 배열 arr에서 target에 해당하는 값의 인덱스를 출력
* 해당 값이 여러 개인 경우 가장 큰 인덱스 출력*/
public class Array2 {
    static void getIndex(int[] arr, int target){
        int targetIndex = -1;
        for(int i=arr.length-1;i>=0;i--){
            if(arr[i]==target){
                targetIndex = i;
                break;
            }
        }
        if(targetIndex == -1){
            System.out.println("Argument Not Found");
        }else{
            System.out.println("결과: "+targetIndex);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,1,100,1,1,1,100};
        int target = 100;
        getIndex(arr,target);
    }
}
