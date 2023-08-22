import java.util.HashSet;

public class Union_Intersection {

    public static int unin(int arr1[], int arr2[]) {
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            set.add(arr1[i]);
        }
        for (int i = 0; i < arr2.length; i++) {
            set.add(arr2[i]);
        }
        return set.size();
    }
    
    public static int inter(int arr1[],int arr2[]){
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        int c=0;
        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
              c++;
              set.remove(arr2[i]);
            }
        }
        return c;
    }
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 3, 4, 5 };
        int arr2[] = { 1, 2, 3 };
        System.out.println("Union " + unin(arr1, arr2));
        System.out.println("Intersection "+ inter(arr1, arr2));
    }
}
