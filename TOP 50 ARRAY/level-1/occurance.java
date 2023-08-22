// Count number of occurrences

import java.util.HashMap;

public class occurance {
    // linear search TC O(n)
    // public static int brute(int arr[],int x){
    // int c=0;
    // for(int i=0;i<arr.length;i++){
    // if(arr[i]==x){
    // c++;
    // }
    // }
    // return c;
    // }

    // // Binary search
    // public static int binary(int arr[],int x){
    // int s=0;
    // int e=arr.length-1;
    // int c=0;
    // while(s<e){
    // int mid=(s+e)/2;
    // if(arr[mid]==x){
    // c++;
    // }else if(arr[mid]>x){
    // e=mid-1;
    // }else{
    // s=mid+1;
    // }
    // }
    // return c;
    // }

    // HASHING
    public static int countocc(int arr[], int x) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        if (!map.containsKey(x)) {
            return 0;
        }
        return map.get(x);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 2, 3, };
        int x = 2;
        // System.out.println(brute(arr, x));
        // brute(arr, x);
        // System.out.println(binary(arr, x));

        // System.out.println(countocc(arr, x));
    }
}
