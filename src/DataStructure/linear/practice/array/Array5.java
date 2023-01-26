package DataStructure.linear.practice.array;
/*
* 배열 arr의 값을 오름차순으로 출력
* */
public class Array5 {
    static void getAsc(int[] arr){
        int[] vistied = new int[arr.length]; //arr의 가장 작은 값을 출력할건데, 출력한 애는 이미 출력했다고 표시
        int visitCount = 0;
        int minVal = Integer.MAX_VALUE; //초기값은 가장 큰 값
        int minIdx = -1;

        while (visitCount < arr.length){
            for(int i=0; i<arr.length; i++){
                if(arr[i]<minVal && vistied[i]==0){
                    minVal = arr[i];
                    minIdx = i;
                }
            }

            if(minIdx!=-1){
                System.out.print(minVal + " ");
                vistied[minIdx] = 1;
                visitCount++;
            }

            minVal = Integer.MAX_VALUE;
            minIdx = -1;
        }
    }
    public static void main(String[] args) {
        int[] arr={5,3,1,4,6,1};
        getAsc(arr);
    }
}
