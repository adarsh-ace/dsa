package Arrays;

public class binarySearch {
    public static void main(String[] args){
        int numbers[] = {24,56,12,76,18,37};
        int key = 10;
        int index = binarySearch(numbers,key);

            System.out.println(index);

    }

    public static int binarySearch(int numbers[] , int key){
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
