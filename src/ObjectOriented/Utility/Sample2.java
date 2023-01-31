package ObjectOriented.Utility;

public class Sample2 {

    public static boolean isHongildong(String str){
        String gender = "";

        /* error NullPointerException
        if(gender.equals("M")){}
        else if (gender.equals("F")) {
        }

        if(str.equals("홍길동")){ // error NullPointerException str이라는 인스턴스가 존재해야만 equals 사용 가능
            return true;
        }else{
            return false;
        }
         */

        if("M".equals(gender)){}
        else if ("F".equals(gender)) {
        }

        if("홍길동".equals(str)){
            return true;
        } else {
            return false;
        }

        /* or
        if(str!= null && str.equals("홍길동")){ // error NullPointerException str이라는 인스턴스가 존재해야만 equals 사용 가능
            return true;
        }else{
            return false;
        }
         */


    }

    public static void main(String[] args) {
        String str1 = "홍길동";
        String str2 = "이순신";
        String str3 = null;

        //잘못된 예제 : 기본형을 비교할때만
        if(str1 == str2){
        }
        //문자열의 비교는 아래와 같이
        if(str1.equals(str2)){

        }
        if(str2.equals(str1)){

        }

        System.out.println(isHongildong(str1));
        System.out.println(isHongildong(str2));
        System.out.println(isHongildong(str3));

    }
}
