package ObjectOriented.Utility;

public class 문자열테스트3 {
    //넘어온 Object에 대해 화면에 출력
    public static void p(Object obj){
        System.out.println(obj);
    }

    public static void main(String[] args) {
        // 이름, 주민번호, etc 비즈니스 로직은 웬만하면 문자열이다
        // String.format
        String name= "홍길동";
        int age = 24;
        double weight = 80.11111111112;

        System.out.println("이름: "+name+", 나이: "+age+", 몸무게: "+weight);
        String display = String.format("이름: %s, 나이: %d, 몸무게: %.2f"
                ,name, age, weight);
        System.out.println(display);

        try{
            byte[] b1 = name.getBytes("UTF-8");
        }catch (Exception e){

        }

    }
}
