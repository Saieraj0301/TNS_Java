class Max_SubArraySum{
    public static void maxSubAraySum(int arr[]){
        int maxSum=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int currentSum=0;
                for(int k=i;k<=j;k++){
                    currentSum+=arr[k];
                }
                if(currentSum>maxSum){
                    maxSum=currentSum;
                }
            }
        }
        System.out.println("MaxSum of Subarray is: "+maxSum);
    }

    public static void main(String []args){
        int arr[]={1,-2,6,-1,3};
        maxSubAraySum(arr);

    }
}