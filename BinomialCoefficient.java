public class BinomialCoefficient {

    public static int factorial(int n){
        int fact=1;
        while(n>=1){
            fact*=n;
            n--;
        }
        return fact;

    }
    public static int Binomial(int n ,int r){

        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binomialcoefficient = (fact_n)/(fact_r * fact_nmr);
        return binomialcoefficient;
    
    }
    public static void main(String[] args) {
        System.out.println((Binomial(5,2)));
    }
}
