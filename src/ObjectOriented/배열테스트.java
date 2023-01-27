package ObjectOriented;
/*
배열
같은 타입(형)의 여러 변수를 하나의 묶음(SET)으로 선언해서 처리하는 것
배열의 선언과 생성
-타입[] 변수이름; or 타입 변수이름[]; ex>Strng[] userName; or String userName[];
배열의 길이와 인덱스
-배열의 길이는 int 범위의 0~양의 정수
-인덱스의 범위는 "0"부터 "배열의 길이 -1"까지

배열의 길이 변경
-더 큰 배열을 새로 생성
-기존 배열의 내용을 새로운 배열에 복사

배열의 초기화
-배열은 참조형 자료형이기 때문에, 배열의 위치의 주소값을 가르킨다
-복사시 참조된 값이 복사됨

+배열은 안쓰지 않으나 대안이 있기 때문에 잘 안씀
* */
public class 배열테스트 {
    public static void main(String[] args) {
        //배열의 선언
        int[] arr1; //자바의 방식

        String[] str1, str12; //자바의 방식
        String str2[], str21;


        //배열의 초기화
        int[] arr3 = new int[5]; //배열에 10개 공간을 선언함
        arr3[0] = 10;
        arr3[1] = 10;
        arr3[2] = 10;
        arr3[3] = 10;
        arr3[4] = 10;

        //얕은 복사: 값이 아닌 값의 주소를 복사한다
        int[] arr2 = arr3;
        arr3[0] = -100; //arr2에도 반영됨


        //깊은 복사: for문을 이용해 값을 하나하나 옮김
        int[] arr4 = new int[5];
        for(int i=0;i<arr3.length;i++){
            arr4[i]=arr3[i];
        }
        arr3[0] = -200; //arr4에는 반영되지 않음


        //int arr2[] = {10,20,30,40,45};

        //처리하는 과정이 반복문을 이용하면 굉장히 심플함
        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }

        System.out.println("----------------------");

        /*
        System.out.println(arr3[0]);
        System.out.println(arr3[1]);
        System.out.println(arr3[2]);
        System.out.println(arr3[3]);
        System.out.println(arr3[4]);
         */


        System.out.println("----------------------");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr2[i]);
        }

        System.out.println("----------------------");
        for(int i=0;i<arr2.length;i++){
            System.out.println(arr4[i]);
        }
    }


}
