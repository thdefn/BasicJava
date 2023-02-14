package Basic;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

/*
예외 (Exception)
-정상적이지 않은 Case
    * 0으로 나누기
    * 배열의 인덱스 초과
    * 없는 파일 열기

예외 처리 (Exception Handling)
-정상적이지 않은 Case에 대한 적절한 처리 방법
-finally : 예외 발생 여부와 관계 없이 항상 실행되는 부분
-throw : 예외를 발생시킴
-throws : 예외를 전가시킴
* */

class NotTenException extends RuntimeException {} //직접 exception 만들기

public class Exception {

    public static boolean checkTen(int ten) {
        if (ten != 10) {
            return false;
        }
        return true;
    }

    public static boolean checkTenWithException(int ten) {
        try {
            if (ten != 10) {
                throw new NotTenException();
            }
        }catch (NotTenException e){
            //메서드 안에서 직접 처리
            System.out.println("e = " + e);
            return false;
        }
        return true;
    }

    public static boolean checkTenWithThrows(int ten) throws NotTenException {
        if (ten != 10) {
            throw new NotTenException();
        }
        return true;
    }

    public void getAE() throws ArithmeticException{ //내부에서 예외가 발생했을 경우 예외를 바깥쪽으로 전가함, 함수를 호출한 쪽에서 예외를 처리할 수 있도록 함
        throw new ArithmeticException(); //예외가 발생함
    }
    public static void main(String[] args) {

        try{
            int a = 5/0; //Exception in thread "main" java.lang.ArithmeticException
        }catch (ArithmeticException e){
            System.out.println("0으로 나누기 예외 발생");
            System.out.println(e);
        }finally {
            System.out.println("1-1 연습 종료");
        }

        System.out.println("함수가 종료되지 않고 이어서 실행된다");

        try {
            int[] b = new int[4]; //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException
            b[4] = 1;
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

        try {
            BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

        boolean checkResult = Exception.checkTen(10);
        System.out.println("checkResult = " + checkResult);

        boolean checkResult2 = Exception.checkTenWithException(3); //Exception in thread "main" Basic.NotTenException
        System.out.println("checkResult2 = " + checkResult2);

        boolean checkResult3 = false;
        try {
            checkResult3 = Exception.checkTenWithThrows(3); //Exception in thread "main" Basic.NotTenException
        }catch (NotTenException e){
            System.out.println("e = " + e);

        }
        System.out.println("checkResult3 = " + checkResult3);



    }
}
