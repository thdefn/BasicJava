package ObjectOriented.Concept;

public class 대학생테스트 {
    public static void main(String[] args) {
        대학생 신입생1 = new 대학생();
        대학생 신입생2 = new 대학생("홍길동");
        대학생 신입생2_1 = new 대학생(20);
        대학생 신입생3 = new 대학생("홍길동",20);
        대학생 신입생4 = new 대학생("홍길동",20,"남");
        대학생 신입생5 = new 대학생("홍길동",20,"남","컴퓨터공학과");

        대학생 신입생6 = new 대학생("홍길동","남");
        대학생 신입생7 = new 대학생("홍길동","컴퓨터공학과");
    }
}
