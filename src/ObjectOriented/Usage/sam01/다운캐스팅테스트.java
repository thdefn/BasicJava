package ObjectOriented.Usage.sam01;

public class 다운캐스팅테스트 {
    public static void main(String[] args) {
        //다운캐스팅 안되는 케이스
        사람 남자 = new 사람("홍길동",1111);
        System.out.println("이름: "+남자.이름+", 주민번호: "+남자.번호);

        //교직원 교직원1 = 남자; compile error
        //교직원 교직원2 = (교직원) 남자; 사람 cannot be cast to 교직원, 교직원2의 본질은 사람임 따라서 에러 발생
        //System.out.println(교직원2.학교명);


        //다운캐스팅 가능한 케이스
        교직원 남자교직원 = new 교직원("홍길동",1111,"패트스탬퍼스",2222);
        System.out.println("----------------");
        System.out.println("이름: "+남자교직원.이름+", 주민번호: "+((사람)남자교직원).번호); //업캐스팅
        System.out.println("이름: "+남자교직원.이름+", 주민번호: "+남자교직원.get주민번호());
        System.out.println("학교명: "+남자교직원.학교명+", 교직원번호: "+남자교직원.번호);

        사람 남자사람 = 남자교직원; //업캐스팅
        System.out.println("----------------");
        System.out.println("이름: "+남자사람.이름+", 주민번호: "+남자사람.번호);

        System.out.println("----------------");
        교직원 남자교직원2 = (교직원)남자사람; //다운캐스팅, 남자사람의 본질은 남자교직원이었기 때문에 교직원으로 다운캐스팅 가능
        System.out.println("이름: "+남자교직원2.이름+", 주민번호: "+남자교직원2.get주민번호());
        System.out.println("학교명: "+남자교직원2.학교명+", 교직원번호: "+남자교직원2.번호);

    }
}
