// Write a program to reverse the array

public class Reverse {
    //
    // public static void rev(int arr[]){
    //     for(int i=arr.length-1;i>=0;i--){
    //         System.out.print(arr[i]+" ");
    //     }
    // }
    
    // SWAP ---TC  O(n)
    public static void swap(int arr[]){
        int s=0;
        int e=arr.length-1;
        while(s<e){
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
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
        int arr[]={2,3,4,5,6,7,9};
        swap(arr);
        print(arr);
    }
}
