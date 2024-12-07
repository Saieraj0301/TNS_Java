public class Factorial {
    public static void factorial(int n){
        int fact=1;
        while(n>=1){
            fact*=n;
            n--;
        }
        System.out.println(fact);

    }

    public static void main(String[] args) {
        factorial(5);
        factorial(4);
        
    }
}
