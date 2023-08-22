// Move all negative numbers to beginning and positive to end with constant extra space

import java.util.Arrays;

public class NegativePositive {
    // Naive aproach
    public static void sort(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    
    // TWo pointer approach
    public static void two(int arr[]){
        int l=0;
        int r=arr.length-1;
        while(l<r){
            // left negavtive and right negative
            if(arr[l]<0 && arr[r]<0){
                l++;
            }
            // LEFT postive and right negative
            else if(arr[l]>0 && arr[r]<0){
                int temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
            // BOTH postive
            else if(arr[r]>0 && arr[l]>0){
                r--;
            }else{
                l++;
                r--;
            }
        }

    }
    // print
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]={-1, 2, -3, 4, 5, 6, -7, 8, 9};
        // sort(arr);
        two(arr);
        print(arr);
    }
}
