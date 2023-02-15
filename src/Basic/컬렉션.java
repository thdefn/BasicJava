package Basic;// Java 프로그래밍 - 변수와 자료형_4

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

public class 컬렉션 {
    public static void main(String[] args) {

//      1. 자료형 - 리스트
        System.out.println("== 리스트 ==");
        ArrayList l1 = new ArrayList();

        //generics : 자료형을 명시적으로 지정하는 것
        // 제한적이지만 예외처리 관점에서 안정성 높이고 형변환을 줄여줌


//      1-1. add

        l1.add(1);
        l1.add("hello");
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add("world");

        System.out.println("l1 = " + l1);

        l1.add(0,1); // 0번 위치에 이 엘레멘트 추가할래

        System.out.println("l1 = " + l1);


//      1-2. get

        System.out.println(l1.get(0));
        System.out.println(l1.get(3));

//      1-3. size

        System.out.println(l1.size());

//      1-4. remove

        System.out.println(l1.remove(0));
        System.out.println("l1 = " + l1);

        System.out.println(l1.remove(Integer.valueOf(2))); // 2라는 값을 찾아서 지움
        System.out.println("l1 = " + l1);


//      1-5. clear

        l1.clear();
        System.out.println("l1 = " + l1);


//      1-6. sort

        ArrayList l2 = new ArrayList();
        l2.add(5);
        l2.add(3);
        l2.add(4);

        System.out.println("l2 = " + l2);

        l2.sort(Comparator.naturalOrder()); // 오름차순
        System.out.println("l2 = " + l2);
        l2.sort(Comparator.reverseOrder());
        System.out.println("l2 = " + l2);

//      1-7. contains

        // 데이터가 리스트에 들어있는지 체크
        System.out.println(l2.contains(1));
        System.out.println(l2.contains(3));

//      2. Maps
        System.out.println("== Maps ==");

        HashMap map = new HashMap();

//      2-1. put

        map.put("kiwi",9000);
        map.put("apple",10000);
        map.put("mango",12000);
        System.out.println("map = " + map);


//      2-2. get

        System.out.println(map.get("mandarine")); // 없으니까 null 출력
        System.out.println(map.get("kiwi"));

//      2-3. size

        System.out.println(map.size());

//      2-4. remove

        System.out.println(map.remove("kiwi"));
        System.out.println(map.remove("mandarine")); // 없으니까 null 출력
        System.out.println("map = " + map);


//      2-5. containsKey

        // 해당 키 값이 맵에 남아 있나?
        System.out.println(map.containsKey("apple"));
        System.out.println(map.containsKey("kiwi"));

//      3. Generics
        System.out.println("== Generics ==");
        ArrayList l3 = new ArrayList();
        l3.add(1);
        l3.add("hello");

        System.out.println("l3 = " + l3);

        ArrayList<String> l4 = new ArrayList<String>(); // 두번째 <> 는 비워도 앞이랑 맞춰지나 암묵적으로 작성
        //l4.add(1);
        l4.add("hello");

        System.out.println("l4 = " + l4);
        
        HashMap map1 = new HashMap();
        map1.put(123,"id");
        map1.put("apple",10000);

        System.out.println("map1 = " + map1);
        
        HashMap<String, Integer> map2 = new HashMap<String, Integer>();
        //map2.put(123,"id");
        map2.put("apple", 10000);

        System.out.println("map2 = " + map2);


    }

}
