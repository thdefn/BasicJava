package Basic;// Java 프로그래밍 - 변수와 자료형_3

public class 문자열 {
    public static void main(String[] args) {

//      1. 자료형 - 문자열
        System.out.println("== 문자열 ==");
        String s1 = "Hello World";
        System.out.println("s1 = " + s1);
        String s2 = "01234";
        System.out.println("s2 = " + s2);

//      1-1. equals

        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(s3.equals(s4)); //T
        System.out.println(s3 == s4); //T s3와 s4는 동일한 메모리를 가르킴

        String s5 = new String("Hi");
        System.out.println(s3.equals(s5)); // T 이퀄스는 값을 비교함
        System.out.println(s3 == s5); // F 객체를 비교함 s5는 새로운 객체가 생성됨

        // 값을 비교시 equals를 쓰자


//      1-2. indexOf

        String s6 = "Hello! World!";
        System.out.println(s6.indexOf("!"));
        System.out.println(s6.indexOf("!",s6.indexOf("!")+1)); // 뒷 느낌표의 인덱스를 찾고 싶을때

//      1-3. replace
        String s7 = s6.replace("Hello","Bye");
        System.out.println("s7 = " + s7);

//      1-4. substring
        System.out.println(s7.substring(0,3)); // 0,1,2를 출력
        System.out.println(s7.substring(0, s7.indexOf("!")+1)); // !까지 출력을 하고 싶을때

//      1-5. toUpperCase

        System.out.println(s7.toUpperCase());


//      2. 자료형 - StringBuffer
        System.out.println("== StringBuffer ==");

        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("56789");
        System.out.println("sb1 = " + sb1);

        // 스트링으로도 append와 비슷한 작업 가능함
        String a = "01234";
        String b = "56789";
        String bak = a;
        System.out.println(a == bak);

        a += b;
        System.out.println(a);
        System.out.println(a == bak); // 새롭게 객체를 생성함

        // but 변화가 자주 일어난다면 스트링 버퍼를 사용하자 스트링 버퍼는 데이터가 변경되어도 객체가 새로 만들어지지 않음
        // 스트링은 객체에 변화가 생길때마다 여러번 객체가 생성됨 > 메모리 때문에 속도 딜레이 발생

//      3. 자료형 - 배열
        System.out.println("== 배열 ==");
        int[] myArray1 = {1,2,3,4,5};
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);

        char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(myArray2[2]);

        String[] myarray3 = new String[3];
        myarray3[0] = "Hello";
        myarray3[1] = " ";
        myarray3[2] = "World!";
        System.out.println(myarray3[0] + myarray3[1] + myarray3[2]);

    }
}
