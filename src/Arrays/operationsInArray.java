package Arrays;
import java.util.*;
public class operationsInArray {
   public static void main(String[] args) {
   int marks[] ={56,75,86};
   update(marks);
   for(int i = 0;i<=marks.length;i++){
       System.out.println("updated marks : " + marks[i]);
   }
   }
   public static void update(int marks[]){
       Scanner sc= new Scanner(System.in);
       System.out.println("jitta badhana hai badha le bhai");
       int n = sc.nextInt();
       for(int i=0;i<=marks.length;i++){
           marks[i] = marks[i]+ n;
           System.out.println(marks[i]);
       }

   }
}
