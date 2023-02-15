package Basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;

public class 로또번호만들기 {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        for (int i = 0; set.size()<6; i++) { //중복되지 않은 데이터가 6개 들어갈때까지 이 반복문을 계속 돈다
            int num = (int) ((Math.random()*45) + 1); //Math.random()*45를 통해 1-44 스케일로 난수 생성
            set.add(num);
        }

        //set 내에 랜덤으로 들어가 있기 때문에 정렬해서 출력
        //ArrayList list = new ArrayList(set);
        LinkedList list = new LinkedList(set); //HashSet to LinkedList, Set을 List로 변환하기 위함
        Collections.sort(list);
        System.out.println("로또 번호: "+list);
    }
}
