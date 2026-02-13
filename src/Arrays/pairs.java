package Arrays;
import java.util.*;
public class pairs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the numbers of array");
        for(int i = 0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        pairs(arr);
    }

    public static void pairs(int arr[]){
//        int ts=0;
        for(int i = 0; i<arr.length-1;i++){
            int pehla = arr[i];
            for(int j = i +1;j<arr.length;j++){
                System.out.print("(" + pehla + "," + arr[j] + ") ");
            }
//            ts++;
            System.out.println();

        }
        //System.out.println("Total number of pairs are : " + ts);

    }
}
