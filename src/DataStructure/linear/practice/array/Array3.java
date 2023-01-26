package DataStructure.linear.practice.array;

import java.util.Arrays;

/*
* 배열 arr의 데이터 순서를 거꾸로 변경하세요
* 추가 배열을 사용하지 않고 구현
* */
public class Array3 {
    static void reverse(int[] arr){
        int size = arr.length;
        int temp = 0;
        for(int i=0;i<size/2;i++){
            temp = arr[i];
            arr[i] = arr[size-1-i];
            arr[size-1-i] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,10};
        reverse(arr);
    }
}
