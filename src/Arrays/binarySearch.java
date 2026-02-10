package Arrays;
import java.util.*;
public class binarySearch {
    static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[] numbers = new int [n];
//        int[] numbers = {24,56,12,76,18,37};

        System.out.println("Enter the numbers of array");
        for(int i = 0; i< n;i++){
            numbers[i] = sc.nextInt();
        }

        System.out.println("enter the key value");
        int key = sc.nextInt();

        int index = binarySearch(numbers,key);
            System.out.println(index);
    }

    public static int binarySearch(int[] numbers, int key){
        int start = 0, end = numbers.length-1;

        while (start <= end) {
            int mid = (start + end) / 2;

            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] < key){
                start = mid + 1;
            }else{
                end = mid -1;
            }
        }
        return -1;
    }
}
