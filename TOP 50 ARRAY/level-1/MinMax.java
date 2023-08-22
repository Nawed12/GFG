// Find the minimum and maximum element in an array
import java.util.*;
public class MinMax {
    // Fun sort()----TC O(n log(n))
    // public static void minmax(int arr[]){
    //     Arrays.sort(arr);
    //     System.out.println("Min no "+ arr[0]);
    //     System.out.println("Max no "+ arr[arr.length-1]);
    // } 

    // method
    public static void mm(int arr[]){
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else if(arr[i]<min){
                min=arr[i];
            }
        }
        System.out.println("Max "+ max);
        System.out.println("Min "+ min);
    }

    public static void main(String[] args) {
        int arr[]={2,1,3,4,5,9,8,10};
        // minmax(arr);
        mm(arr);
    }
}
