package math;

public class Recursive {
    static int recursion1(int n){
        if(n==1){
            return 1;
        }
        return 3*recursion1(n-1);
    }

    static int recursion2(int n){
        if(n==1){
            return 1;
        }
        return n + recursion2(n-1);

    }

    static int recursion3(int n){
        if(n<3){
            return 1;
        }
        return recursion3(n-1) + recursion3(n-2);
    }
    public static void main(String[] args) {
        // 1, 3, 9, 27 --
        // 재귀함수 없이 풀어봄
        int n = 4;
        int result = 1;
        for(int i=0; i<n; i++){
            if(i == 0){
                result = 1;
            }else{
                result *= 3;
            }
        }
        System.out.println(result);

        //4 > 3*recursion(3) > 3*recursion(2) > 3*recursion(1) >  1

        // 1, 2, 3, 5 --
        n = 5;
        result = 0;
        for(int i=1; i<n+1; i++){
            result += i;
        }
        System.out.println(result);

        //5 > 5 + recursion(4) > 4 + recursion(3) > 3 + recursion(2) >  2 + recursion(1) > 1

        // 1, 1, 2, 3, 5 --
        n = 6;
        result = 0;
        int a1 = 1;
        int a2 = 1;

        if(n<3){
            result = 1;
        }else{
            for (int i=2; i<n; i++){
                result = a1 + a2;
                a1 = a2;
                a2 = result;
            }
        }
        System.out.println(result);

        //6 > recursion(4) + recursion(5) > recursion(2) + recursion(3) / recursion(3) + recursion(4) --
        //동일한 연산을 하고 있다
    }
}
