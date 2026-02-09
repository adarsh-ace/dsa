package Arrays;

public class LargestInArray {
    public static void main(String[] args){
        int numbers[] = {54,25,45,96,75,13,42,71};
        int largest = getLargest(numbers);
        System.out.println(largest);
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
