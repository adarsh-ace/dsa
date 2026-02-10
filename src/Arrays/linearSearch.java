package Arrays;
import java.util.*;
public class linearSearch {
    public static void main(String[] args){
        int number[] = {15,85,98,36,25,75,15,21,12,98,32};
        int key = 21;

//        int n = sc.nextInt();          // size
//        int[] number = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            number[i] = sc.nextInt();     // elements
//        }
//        int key = sc.nextInt();
        int index = linearSearch(number,key);
        if(index == 1){
            System.out.println("Number not found");
        }else{
            System.out.println("Number is at index : " + index);
        }
    }
    public static int linearSearch(int number[],int key){
        for(int i = 0 ; i<= number.length;i++){
            if(number[i] == key){
                return i;
            }
        }
        return -1;
    }
}
