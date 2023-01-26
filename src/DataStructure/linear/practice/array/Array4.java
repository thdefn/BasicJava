package DataStructure.linear.practice.array;
/*
* 배열 arr에서 peek값 모두 출력
* peek 값은 좌우보다 큰 값을 의미함
* */
public class Array4 {
    static void getPeek(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            if(i==0 && arr[i]>arr[i+1]){
                System.out.print(arr[i]+" ");
            } else if (i==arr.length-1 && arr[i]>arr[i-1]) {
                System.out.print(arr[i]+" ");
            } else if (arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr={3,1,2,6,2,2,5,1,9,10,1,11};
        getPeek(arr);
    }
}
