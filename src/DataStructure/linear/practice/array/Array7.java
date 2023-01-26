package DataStructure.linear.practice.array;
/*
* 2차원 배열 arr을 시계 방향으로 90도 회전시킨 결과를 출력하세요
* */
public class Array7 {
    public static void printArr(int[][] arr){
        for (int[] item1D: arr) {
            for (int item: item1D) {
                System.out.print(item+" ");
            }
            System.out.println();
        }

    }
    static void rotate(int[][] arr){
        int[][] arr90 = new int[arr[0].length][arr.length];
        for(int i=0; i<arr.length; i++){
            for(int j=0;j<arr[i].length;j++){
                int r = arr.length -1 -i; //첫번째 행이 마지막 열로 가기 위한
                arr90[j][r] = arr[i][j];
            }
        }
        printArr(arr);
        System.out.println("--after--");
        printArr(arr90);

    }

    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        rotate(arr);
    }
}
