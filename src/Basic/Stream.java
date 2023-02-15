package Basic;// Java 프로그래밍 - 스트림

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Stream {

    public static void main(String[] args) {

//      1. 스트림 생성

//      1-1. 배열 스트림
        System.out.println("== 배열 스트림 == ");
        String[] arr = new String[]{"a", "b", "c"};

        System.out.println("== fori ==");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println("== forEach ==");
        for (String item: arr) {
            System.out.println(item);
        }

        System.out.println("== to Stream ==");
        java.util.stream.Stream stream = Arrays.stream(arr);  //스트림으로 변환됨
        stream.forEach(System.out::println);

//      1-2. 컬렉션 스트림
        System.out.println("== 컬렉션 스트림 ==");
        ArrayList list1 = new ArrayList(Arrays.asList(1, 2, 3));
        System.out.println("list1 = " + list1);

        java.util.stream.Stream stream2 = list1.stream();
        //stream2.forEach(System.out::println); 스트림은 최종 연산을 한번밖에할 수 없
        stream2.forEach(num -> System.out.println("num = " + num));

        System.out.println("== to Stream ==");


//      1-3. 스트림 builder
        System.out.println("== 스트림 builder ==");

        java.util.stream.Stream streamBuilider = java.util.stream.Stream.builder().add(1).add(2).add(3).build();

        streamBuilider.forEach(System.out::println);

//      1-4. 스트림 generate
        System.out.println("== 스트림 generate ==");
        java.util.stream.Stream streamGenerate = java.util.stream.Stream.generate(()->"abc").limit(3); //리밋 만큼 반복되어 출력
        streamGenerate.forEach(System.out::println);

//      1-5. 스트림 iterate
        System.out.println("== 스트림 iterate ==");
        java.util.stream.Stream streamIterate = java.util.stream.Stream.iterate(10, n->n*2).limit(3);
        streamIterate.forEach(System.out::println);


//      1-6. 기본 타입 스트림
        System.out.println("== 기본타입 스트림 ==");
        IntStream intStream = IntStream.range(1,5); //rangeClosed : 1-5까지 데이터 range : 1-4
        intStream.forEach(System.out::println);


//      2. 스트림 중개 연산

//      2-1. Filtering
        System.out.println("== Filtering ==");
        IntStream intStream2 = IntStream.range(1,10).filter(n->n%2==0);
        intStream2.forEach(System.out::println);

//      2-2. Mapping
        System.out.println("== Mapping =="); //각각의 원소를 연산해서 새로 만들어줌
        IntStream intStream3 = IntStream.range(1,10).map(n->n+1);
        intStream3.forEach(n-> System.out.println(n + " "));
        System.out.println();

//      2-3. Sorting
        System.out.println("== Sorting ==");
        IntStream intStream4 = IntStream.builder().add(5).add(1).add(3).add(4).add(2).build();
        IntStream intStreamSort = intStream4.sorted();
        intStreamSort.forEach(System.out::println);

//      3. 최종 연산

//      3-1. Sum, Average
        System.out.println("== sum, average ==");
        int sum = IntStream.range(1,5).sum();
        System.out.println("sum = " + sum);
        double average = IntStream.range(1,5).average().getAsDouble();
        System.out.println("average = " + average);


//      3-2. Min, Max
        System.out.println("== min, max ==");
        int min = IntStream.range(1,5).min().getAsInt();
        System.out.println("min = " + min);
        int max = IntStream.range(1,5).max().getAsInt();
        System.out.println("max = " + max);

//      3-3. reduce
        System.out.println("== reduce ==");
        java.util.stream.Stream<Integer> stream3 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)).stream();
        System.out.println(stream3.reduce((x,y)->x+y).get()); // 연쇄적으로 합을해서 데이터를 뽑아낼때


//      3-4. forEach
        System.out.println("== forEach == ");
        IntStream.range(1,10).filter(n->n==5).forEach(System.out::println);


    }
}


