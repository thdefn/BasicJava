package ObjectOriented.Utility;

public class 문자열테스트 {
    //넘어온 Object에 대해 화면에 출력
    public static void p(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        System.out.println("TEST");

        String url = "https://fastcampus.co.kr/";

        final String FS = "https://fastcampus.co.kr/";

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

        //equals, equalsIgnoreCase
        url = "https://FastCampus.co.kr/";
        p(url.equals(FS)); //false
        p(url.equalsIgnoreCase(FS)); //true euqal 할건데 대소문자는 구분 안할래
        p(FS.equalsIgnoreCase(url)); //true


        //replace(), replaceAll(), split()
        // news, tv, sbs / news, radio, kbs
        // 분류, 매체, 방송국
        // 카테고리 > 상품
        // http://www.coupang.com/tv/item001 카테고리를 주소로 하는데 각각의 값을 가져오고 싶을 때
        // http://www.coupang.com/news/tv/sbs
        String url2 = "http://www.naver.com/news/tv/sbs";
        p(url2);
        p(url2.replace("http://www.naver.com/","")); // news/tv/sbs
        p("-------------------");
        String[] url2List = url2.replace("http://www.naver.com/","").split("/");
        p("분류:"+url2List[0]);
        p("매체:"+url2List[1]);
        p("방송국:"+url2List[2]);
        /*
        for(String u : url2List){
            p(u);
        } // http:, ,www.naver.com,news,tv,sbs
         */

        // concat
        p(url2.concat("/index.html"));
        p(url2+"/index.html"); //concat은 자바에서 잘 안씀


        // substring()
        p(url);
        p(url.substring(8)); //FastCampus.co.kr/
        p(url.substring(8,18)); //FastCampus.co.kr/

        // valueOf()
        String v1 = String.valueOf(12);
        String v0 = 12 + ""; //이렇게 많이 씀
        int n1 = Integer.parseInt(v1);
        p(v1);
        p(v0);

    }
}
