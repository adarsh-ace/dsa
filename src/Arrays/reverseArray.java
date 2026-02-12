package Arrays;
import java.util.*;
public class reverseArray {
    public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Enter the numbers of the array ");
        for(int i = 0; i < n;i++){
            arr[i] = sc.nextInt();
            }
        reverse(arr);
        System.out.println("The reversed Array is : ");
        for(int i = 0;i < n ; i++){
            System.out.print(arr[i] + " ");
        }
    }
    public static void reverse(int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int meow = arr[start];
            arr[start] = arr[end];
            arr[end] = meow;
            start ++;
            end --;
        }
    }
}
