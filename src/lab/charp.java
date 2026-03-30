package lab;

public class charp {
    public static void main(String[] args) {
        char  [] s={'a','d','a','r','s','h'};
        int st=0;
        int en=s.length-1;
        while(st<=en){
            char temp=s[st];
            s[st]=s[en];
            s[en]= temp;
            st++;
            en--;
        }

        for(char i:s){
            System.out.print(i+"#"+" ");
        }
    }
}
