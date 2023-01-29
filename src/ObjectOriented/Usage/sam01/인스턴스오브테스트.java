package ObjectOriented.Usage.sam01;
/*
다운캐스팅은 무조건 가능한 게 아니다
할당하려는 객체와 다운캐스팅하려는 객체의 본질이 같아야함

instaceof
-인스턴스가 그 형으로 변환할 수 있는지 알려줌
-자식은 부모인가? true 부모가 자식인가? false
-상속관계가 없으면 instanceof 자체를 물어볼 수 없다
* */
public class 인스턴스오브테스트 {
    public static void main(String[] args) {
        사람 남자 = new 사람("홍길동",1111);
        교직원 남자교직원 = new 교직원("홍길동",1111,"패트스탬퍼스",2222);

        //남자=사람
        //남자교직원=교직원 and 사람

        System.out.println("남자 instance of 사람: "+(남자 instanceof 사람));
        System.out.println("남자 instance of 교직원: "+(남자 instanceof 교직원));
        System.out.println("남자교직원 instance of 사람: "+(남자교직원 instanceof 사람)); //instanceof는 형변환이 가능한지 물어봄
        System.out.println("남자교직원 instance of 교직원: "+(남자교직원 instanceof 교직원));
    }

}
