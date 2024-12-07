import java.util.*;
class reverseArray{
    public static void reverse(int numbers[]){
        int first=0;
        int last=numbers.length-1;
        //traverse the array
        while(first<last){
            int temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;

            first++;
            last--;
        }


    }

    public static void main(String[] args) {
        int numbers[]={2,4,6,8,10};
        reverse(numbers);
        for(int i=0;i<numbers.length;i++){
            System.out.print(" "+numbers[i]);
        }
    }
}