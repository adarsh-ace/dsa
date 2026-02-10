package Arrays;

public class meow {
  public  static void main(String[] args) {
      int arr[] = {10,20,30,40,50};
      int i = 0;
      int cat = 0;

      while (cat < 3) {
          System.out.println(arr[i]);
          if (i == 0) cat++;
          i = (i + 1) % arr.length;
      }

    }
}
