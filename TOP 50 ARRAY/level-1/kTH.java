// K’th Smallest/Largest Element in Unsorted Array
import java.util.*;
public class kTH{


    // sort() --------Time Complexity: O(N log N)
    public static int kthsmallest(int arr[],int k){
        Arrays.sort(arr);
        return arr[k-1];
    }
    public static void main(String[] args) {
        int arr[]={7,10,4,3,20,15};
        int k=3;
        System.out.println( kthsmallest(arr, k));
       
    }
}