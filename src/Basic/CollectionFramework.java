package Basic;

import java.util.*;

/*
컬렉션 프레임워크 (Collection Framework)
-여러 데이터를 편리하게 관리할 수 있도록 만들어 놓은 것
    * 자료 구조 및 알고리즘을 구조화
-대표 인터페이스
    * List 인터페이스, Set 인터페이스, Map 인터페이스

List 인터페이스
-순서가 있는 데이터의 집합
-데이터 중복 허용
-대표 구현 클래스
    * ArrayList
    * LinkedList
    * Vector

Set 인터페이스
-순서가 없는 데이터의 집합
-데이터의 중복 허용하지 않음
-대표 구현 클래스
    * HashSet
    * TreeSet

Map 인터페이스
-키와 값의 쌍으로 이루어진 데이터 집합
-순서를 유지하지 않음
-대표 구현 클래스
    * HashMap
    * TreeMap
* */
public class CollectionFramework {
    public static void main(String[] args) {
        //List 인터페이스

        //ArrayList
        ArrayList list1 = new ArrayList();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        System.out.println("list1 = " + list1);
        list1.remove(Integer.valueOf(2)); //1번값 찾아서 지우기
        System.out.println("list1 = " + list1);
        list1.add(0,10);
        System.out.println("list1 = " + list1);
        System.out.println("list1.size() = " + list1.size());
        System.out.println("list1.contains(1) = " + list1.contains(1));
        System.out.println("list1.indexOf(10) = " + list1.indexOf(10));


        //LinkedList
        LinkedList list2 = new LinkedList();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println("list2 = " + list2);
        list2.addFirst(10);
        list2.addLast(20);
        System.out.println("list2 = " + list2);
        list2.remove(Integer.valueOf(1)); //1이라는 값을 지워
        System.out.println("list2 = " + list2);
        list2.removeFirst();
        list2.removeLast();
        System.out.println("list2 = " + list2);

        //Set 인터페이스

        //HashSet
        HashSet set1 = new HashSet();
        set1.add(1);
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1);
        set1.remove(1); //1이라는 값을 지워
        System.out.println("set1 = " + set1);//set1 = [2, 3]
        set1.add(2);
        set1.add(3);
        System.out.println("set1 = " + set1); //set1 = [2, 3] Set에는 중복된 데이터가 들어갈 수 없다, 알아서 중복 처리
        System.out.println("set1.size() = " + set1.size());
        System.out.println("set1.contains(2) = " + set1.contains(2));

        //TreeSet
        TreeSet set2 = new TreeSet();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        System.out.println("set2 = " + set2);
        set2.remove(1); //1이라는 값을 지워
        System.out.println("set2 = " + set2);
        set2.clear();
        System.out.println("set2 = " + set2);
        set2.add(10);
        set2.add(5);
        set2.add(15);
        set2.add(15);
        System.out.println("set2 = " + set2); //set2 = [5, 10, 15] 알아서 중복 처리

        System.out.println(set2.first());
        System.out.println(set2.last());
        System.out.println(set2.lower(10));
        System.out.println(set2.higher(10)); //tree는 탐색에 특화된 자료 구조


        //Map 인터페이스

        //HashMap
        HashMap map1 = new HashMap();
        map1.put(1,"kiwi");
        map1.put(2,"apple");
        map1.put(3,"mango");
        System.out.println("map1 = " + map1);
        map1.remove(2);//키값으로 삭제
        System.out.println("map1 = " + map1);
        System.out.println("map1.get(1) = " + map1.get(1));

        //TreeMap
        TreeMap map2 = new TreeMap();
        map2.put(10,"kiwi");
        map2.put(5,"apple");
        map2.put(15,"mango");
        System.out.println("map2 = " + map2);

        System.out.println(map2.firstEntry());
        System.out.println(map2.firstKey());
        System.out.println(map2.lastEntry());
        System.out.println(map2.lastKey());
        System.out.println(map2.lowerEntry(10)); //5=apple
        System.out.println(map2.higherEntry(10)); //15=mango

    }
}
