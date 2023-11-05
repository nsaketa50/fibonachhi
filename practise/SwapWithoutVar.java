package practise;

//Can you write a Java program to swap two numbers without using the third variable for me?
public class SwapWithoutVar {
    public static void main(String[] args) {
        
        int a = 5;
        int b = 10;
        
        a = a+b; //15
        b= a-b; //10
        a = a-b; 

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);

    }
}
