package lab;

public class countArr {
    public static void main(String[] args) {
        char  [] s={'a','d','a','r','s','h'};
        int st=0;
        int en=s.length-1;
        int count=0;
        while(st<=en){
            count=count+1;
            st++;
        }
        System.out.println(count);
    }
}
