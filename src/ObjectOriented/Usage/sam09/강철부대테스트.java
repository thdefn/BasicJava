package ObjectOriented.Usage.sam09;

public class 강철부대테스트 {
    public static void main(String[] args) {
        SDT 김민수 = new SDT();
        김민수.구보();
        김민수.행군하기();

        SSU 황충원 = new SSU();
        황충원.구보();
        황충원.행군하기();

        UDT 육준서 = new UDT();
        육준서.구보();
        육준서.행군하기();

        칠공칠 이진봉 = new 칠공칠();
        이진봉.구보();

        특전사 박준무 = new 특전사();
        박준무.구보();

        해병수색대 오종혁 = new 해병수색대();
        오종혁.구보();

        System.out.println("------------------");
        IBS[] IBS목록 = {김민수, 황충원, 육준서, 이진봉, 박준무, 오종혁};
        for (int i = 0; i < IBS목록.length; i++) {
            IBS목록[i].헤드캐리어();
        }

        System.out.println("------------------");
        데스매치[] 데스매치목록 = {김민수, 황충원, 육준서};
        for (int i = 0; i < 데스매치목록.length; i++) {
            데스매치목록[i].행군하기();
        }


    }
}
