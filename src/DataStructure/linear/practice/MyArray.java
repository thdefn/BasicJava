package DataStructure.linear.practice;

/*
* 기본 배열 자료형을 이용해 배열의 생성, 삽입, 삭제 기능 구현
* 배열은 사이즈가 fix : 삽입 삭제시마다 배열의 사이즈가 변경되는 부분이 필요
* */

import java.util.Arrays;

public class MyArray {
    int[] arr;

    //배열의 초기 사이즈 설정
    MyArray(int size){
        this.arr = new int[size];
    }

    //배열에 데이터 삽입
    public void insertData(int index, int data){
        if(index<0 || index>this.arr.length){ //맨 끝자리를 하나 뛰어넘고 다음자리에 삽입 불가
            System.out.println("Index Error");
            return;
        }

        int[] arrDup = this.arr.clone(); //기존 배열에 데이터 복사
        this.arr = new int[this.arr.length+1]; //새로운 데이터가 삽입되었으므로 기존의 배열보다 하나 큰 빈 배열 생성

        //기존 데이터 새로운 배열에 할당
        for (int i=0; i<index; i++) {
            this.arr[i] = arrDup[i];
        }

        for (int i=index+1; i<this.arr.length; i++) {
            this.arr[i] = arrDup[i-1];
        }
        
        this.arr[index] = data;
    }

    //배열에서 특정 데이터 삭제
    public void removeData(int data){
        int targetIndex = -1; //아무것도 찾은 게 없다
        for (int i=0; i<this.arr.length ; i++) {
            if(this.arr[i] == data){
                targetIndex = i;
                break;
            }
        }

        if(targetIndex == -1){
            System.out.println("Argument Not Found");
        }else{
            int[] arrDup = this.arr.clone();
            this.arr = new int[this.arr.length-1];

            for(int i=0;i<targetIndex;i++){
                this.arr[i] = arrDup[i];
            }

            for(int i=targetIndex;i<this.arr.length;i++){
                this.arr[i] = arrDup[i+1];
            }
        }
    }

    public static void main(String[] args) {
        //      Test code
        int size = 5;
        MyArray myArray = new MyArray(size);

        for (int i = 0; i < size; i++) {
            myArray.arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(myArray.arr));   // [1, 2, 3, 4, 5]

        myArray.arr[0] = 10;
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 3, 4, 5]

        myArray.insertData(2, 20);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 4, 5]

        myArray.insertData(6, 60);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 4, 5, 60]

        myArray.insertData(-1, 0);  // Index Error

        myArray.removeData(4);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 5, 60]

        myArray.removeData(5);
        System.out.println(Arrays.toString(myArray.arr));   // [10, 2, 20, 3, 60]

        myArray.removeData(99); // 해당 데이터가 없습니다.
    }
}
