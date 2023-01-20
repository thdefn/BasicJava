package math.practice;

public class Recursive1{
    static int factorial(int n){
        if(n==1){
            return 1;
        }
        return n * factorial(n-1);
    }
    public static void main(String[] args) {
        System.out.println(factorial(1));
        System.out.println(factorial(2));
        System.out.println(factorial(3));
    }
}
