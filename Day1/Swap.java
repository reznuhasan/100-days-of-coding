import java.util.Scanner;

public class Swap {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your First Number:");
        int a=sc.nextInt();
        System.out.print("Enter your Second Number:");
        int b=sc.nextInt();
        System.out.println("First Number: "+a+" Second Number: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("First Number: "+a+" Second Number: "+b);
    }
}
