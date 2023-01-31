package ObjectOriented.Utility;

import java.util.Calendar;
import java.util.Date;

/*
rt.jar/java/lang
* */
public class Sample {
    public static void main(String[] args) {
        //java.lang 라이브러리는 따로 import 할 필요가 없다
        String str = "홍길동";
        System.out.println(str);

        //java.util
        Date today = Calendar.getInstance().getTime();

    }
}
