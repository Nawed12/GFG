// Write a program to sort the given array
import java.util.*;
public class Sort {
    // Sort()
    // Selection sort
    // Bubble sort
    // Merge sort
    // Redix sort 
    // Insertion sort
    public static void sort(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={3,1,4,5,2,6};
        sort(arr);
    }
}
