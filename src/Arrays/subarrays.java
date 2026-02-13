package Arrays;
import java.util.*;
public class subarrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array");
        int n = sc.nextInt();
        int number[]= new int[n];
        System.out.println("Enter the numbers of array");
        for(int i =0;i<n;i++){
             number[i] = sc.nextInt();
        }
        pairs(number);
    }
    public static void pairs(int number[]){
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=0;j<number.length;j++){
                int end= j;
                for(int k = start;k<=end;k++){
                    System.out.print(number[k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
