package ObjectOriented.Utility;

public class 문자열테스트 {
    //넘어온 Object에 대해 화면에 출력
    public static void p(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        System.out.println("TEST");

        String url = "https://fastcampus.co.kr/";

        //length()
        int length  = url.length();
        p("문자열 길이: "+length);

        p("--------------");
        //charAt()
        for(int i=0;i<url.length();i++){
            System.out.print(url.charAt(i));
        }

        //toCharArray()
        p("--------------");
        for(char c1: url.toCharArray()){
            System.out.print(c1);
        }


        //contains(), idexOf(), lastIndexOf() : 문자열에 특정 문자열이 포함되니?
        //indexOf()>-1 : 문자열이 포함됨
        p("--------------");
        p(url.contains("http")); //return indexOf(s.toString()) > -1;
        p(url.indexOf(".")); //.co, url의 18부터 시작된다
        p(url.lastIndexOf(".")); //뒤에서부터 찾는다 .kr
        p(url.contains("FastCampus")); //false

        //toLowerCase(), toUpperCase(), trim()
        p(url.toUpperCase());
        p(url.toLowerCase());
        url = "https://fastcampus.co.kr/      ";
        p("["+url+"]");
        p("["+url.trim()+"]"); //앞뒤공백제거


    }
}
