package practise;

import java.util.Scanner;

class Multiply{
    public void calc(int num1, int num2){
        
        System.out.println("Multiplication of " +num1 +"is ");
        for(int i =1; i<=num2; i++){
            System.out.println(num1 + "*" + i+ " = " + (num1 * i));
        }
    }
}

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter number you want to multiply: ");
        Scanner sc = new Scanner(System.in);
       int num1= sc.nextInt();
       System.out.println("Till which number you want to multiply ");
       int num2= sc.nextInt();
        Multiply obj = new Multiply();
        obj.calc(num1, num2);
    }
}