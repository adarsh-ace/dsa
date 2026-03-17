
package lab;

public class lastOccurance {
    public static int lastOcc(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (arr[mid] == target) {
                ans = mid;
                s = mid + 1; // move right
            } else if (arr[mid] < target) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,3,4,5,6};
        int target = 3;
        int result = lastOcc(arr, target);
        System.out.println(result);
    }
}