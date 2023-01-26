package DataStructure.linear.practice.array;
/*
* 배열 arr에서 중복 값을 제거한 새 배열을 만드시오
* */
public class Array6 {
    static void deleteOverlap(int[] arr){
        Boolean visited = false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    visited = true;
                    break;
                }
            }
            if(visited==false){
                System.out.print(arr[i]+" ");
            }
            visited = false;
        }
    }

    static void answer(int[] arr){
        int[] arrResult = new int[arr.length]; //중복을 제거해 새로운 데이터를 넣을 배열
        int cnt = 0; //인덱스 관리

        for(int i=0;i<arr.length;i++){
            boolean dupFlag = false;
            for(int j=0;j<cnt;j++){
                if(arr[i] == arrResult[j]){
                    dupFlag = true;
                }
            }
            if(dupFlag == false){
                arrResult[cnt++] = arr[i];
            }
        }

        for(int i=0;i<cnt;i++){
            System.out.print(arrResult[i]+" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {1,5,3,2,2,3,1,4,1,2,3,5};
        deleteOverlap(arr);
    }
}
