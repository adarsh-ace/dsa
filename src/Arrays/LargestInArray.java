package Arrays;
import java.util.*;
public class LargestInArray {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        int n = sc.nextInt();
        int numbers[] = new int[n];
        System.out.println("Enter the numbers of the Array");
        for(int i= 0;i<n;i++){
            numbers[i] = sc.nextInt();
        }
        int largest = getLargest(numbers);
        System.out.println("Largest number in the Array is : " + largest);
    }
    public static int getLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        for(int i= 0;i<numbers.length;i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
    }
}
