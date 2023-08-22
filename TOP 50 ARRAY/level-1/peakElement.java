// Find a peak element which is not smaller than its neighbours


public class peakElement {
    public static void peak(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i-1]<arr[i]&& arr[i+1]<arr[i]){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5, 10, 20, 15};
        peak(arr);
        
    }
}
