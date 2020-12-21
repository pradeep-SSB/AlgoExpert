package Important_Algorithms;
import java.util.Scanner;

public class Kadens_algorithm {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    // int n = in.nextInt();
    // int[] arr = new int[n];   
    int[] arr ={1,1,-4,5,-1,-6,6,-4,4};
        System.out.println(Kadens(arr));
        in.close();
    }
    
    public static int Kadens(int[] arr){
        int MaxEndHere = arr[0];
        int MaxSoFar = arr[0];

        for(int i =1; i <arr.length; i++){
            MaxEndHere = Math.max(arr[i] + MaxEndHere , arr[i]);
            MaxSoFar = Math.max(MaxSoFar, MaxEndHere);
        }
        return MaxSoFar;
    }
}
