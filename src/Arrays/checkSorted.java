package Arrays;
import java.util.*;
public class checkSorted {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Array ka size daal bsdk");
        int n = sc.nextInt();
        int arr[] = new int [n];
        System.out.println("Chal ab array ka number daal");
        for(int i = 0;i<n;i++){
           arr[i] = sc.nextInt();
        }
        boolean acc = true;
        boolean dec = true;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
            dec = false;
            }
            if(arr[i] > arr[i + 1]){
                acc = false;
            }
        }
        if(acc){
            System.out.println("Array is sorted");
        }
        else if(dec){
            System.out.println("Array is sorted");
        }
        else{
            System.out.println("Array is not sorted");
        }
   }

}

