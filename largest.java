import java.util.*;
public class largest {
    public static int getlargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];
            }
            if(numbers[i]<smallest){
                smallest=numbers[i];
            }
        }
        System.out.println("Smallest element= "+smallest);
        return largest;
    }
    public static void main(String[] args){

        int numbers[]={1,2,6,3,5};
        
        System.out.print(("Largest element = "+getlargest(numbers)));
    }
}
