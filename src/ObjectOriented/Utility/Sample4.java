package ObjectOriented.Utility;

import java.util.Calendar;
import java.util.Date;

/*
toString()은 대부분 오버라이딩 해 사용
* */
public class Sample4 {
    public static void main(String[] args) {
        Object obj1 = new Object();
        System.out.println(obj1.toString()); //getClass().getName() + "@" + Integer.toHexString(hashCode())
        System.out.println(obj1.hashCode());
        System.out.println(Integer.toHexString(obj1.hashCode()));

        String str1 = new String("홍길동");
        System.out.println(str1.toString()); //this

        Date dt = Calendar.getInstance().getTime();
        System.out.println(dt.toString());

        사람 홍길동 = new 사람("홍길동",20);
        System.out.println(홍길동.toString());//ObjectOriented.Utility.사람@6d6f6e28

    }
}
