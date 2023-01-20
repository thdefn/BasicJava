package datastructure.linear;

import java.util.ArrayList;
import java.util.Arrays;

/*
배열
-많은 수의 데이터를 다룰 때 사용하는 자료 구조
-각 데이터를 인덱스와 1:1 대응하도록 구성
-데이터가 메모리 상에 연속적으로 저장됨

배열의 장점
-인덱스를 이용하에 데이터에 빠르게 접근 가능

배열의 단점
-데이터의 추가/삭제가 번거로운 편
    :미리 최대 길이를 정해서 생성해야 함
    :가변 길이 배열은 배열의 크기를 변경할 때마다 새로운 배열을 생성
    :데이터 삭제 시, 인덱스를 유지하기 위해 빈 공간 유지
    :새로운 데이터를 추가할 때, 메모리를 새로 생성하여 복사 진행
* */
public class Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        for(int item : arr){
            System.out.println(item);
        }

        arr[1] = 100;
        System.out.println(Arrays.toString(arr));


        int[][] arr2 = {{1,2,3},{4,5,6}};
        for(int[] row:arr2){
            for(int item: row){
                System.out.println(item);
            }
        }

        ArrayList list = new ArrayList(Arrays.asList(1,2,3));
        System.out.println(list);
        list.add(4);
        list.add(5);
        list.remove(2);
        list.remove(Integer.valueOf(2)); //실제로 2 라는 값을 지우고 싶을 때

        ArrayList list2d = new ArrayList();
        ArrayList d1 = new ArrayList(Arrays.asList(1,2,3));
        ArrayList d2 = new ArrayList(Arrays.asList(4,5,6));
        list2d.add(d1);
        list2d.add(d2);
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(list2d);

    }
}
