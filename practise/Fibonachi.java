package practise;

public class Fibonachi {
    // 12358
    public static void main(String[] args) {
        int a=1;
        int b= 1;
        int c=0;
        
        for(int i=1; i<=15;i++){
            a=b;
            b=c;
            c= a+b;
            System.out.println(c);
        }
    }
}
