public class SubArray{
    public static void subarr(int arr[],int sum){
         int currSum=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                currSum=0;
                for(int k=i;k<=j;k++){
                    currSum+=arr[k];
                                        
                }
                    if(currSum==sum){
                    System.out.print( "Sum found between indexes"+i
                        + " and " + j);
                        break;
                    }
                
                System.out.println();
            }
            // System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6}; 
        int sum=6;
        subarr(arr,sum);
    }
}