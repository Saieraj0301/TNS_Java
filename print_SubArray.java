class print_SubArray {
    public static void printSubArray(int numbers[]){
        //outer loop to traverse all elements, also to point starting range
        for(int i=0;i<numbers.length;i++){
            //inner loop to traverse elements from ith pos, also to point ending range of subarray
            for(int j=i;j<numbers.length;j++){
                //loop to print elements in range from i to j
                for(int k=i;k<=j;k++){
                    System.out.print(" "+numbers[k]);
                }
                System.out.println();
            }

        }
    }
    
    public static void main(String[] args){
        int numbers[]={1,2,3,4,5};
        printSubArray(numbers);
    }
}

/*
Output: 

 1
 1 2
 1 2 3
 1 2 3 4
 1 2 3 4 5
 2
 2 3
 2 3 4
 2 3 4 5
 3
 3 4
 3 4 5
 4
 4 5
 5
 */