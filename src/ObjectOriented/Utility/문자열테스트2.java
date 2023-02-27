package ObjectOriented.Utility;

public class 문자열테스트2 {
    //넘어온 Object에 대해 화면에 출력
    public static void p(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        // 사전 기준으로 어떤 게 더 앞에 있는지
        String str1 = "홍길동";
        String str2 = "이순신";

        p(str1.compareTo(str2)); // str1이 str2보다 사전상 뒤에 있어서 양수
        p(str2.compareTo(str1)); // str2가 str1보다 사전상 앞에 있어서 음수
        p(str2.compareTo(str2)); //0
    }
}
