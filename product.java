public class product {
    public static int Product(int a,int b){
        int product = a*b;
        return product;
    }

    public static void main(String []args){
        int prod = Product(5,10);
        System.out.println("Product = "+prod);
    }
}
