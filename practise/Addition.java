package practise;

import java.util.Scanner;

 class Add{
    int number(int no1, int no2){
    return no1+no2;

}}

public class Addition {
    
    public static void main(String[] args) {
        System.out.println("Enter 1st no: ");
        Scanner sc = new Scanner(System.in);
       int no1= sc.nextInt();
        System.out.println("Enter 2nd no: ");
       
        int no2= sc.nextInt();
        Add obj = new Add();
        System.out.println("Addtion is: " + obj.number(no1, no2));

    }


}
