package Arrays;

public class secondLargest  {
    public static void main(String[] args){
        int numbers[] = {14,25,45,68,75,95,};
        int  secondLargest = secondLargest(numbers);
        System.out.println("Second largest number is : " + secondLargest);
    }
    public static int secondLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i= 0;i<numbers.length;i++){
           if(largest < numbers[i] ){
               secondLargest = largest;
               largest = numbers[i];
           }
        }
        return secondLargest;
    }
}
