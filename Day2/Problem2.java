import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if(num==0){
            System.out.println("Zero");
        }else if(num%2==0){
            if(num<0){
                System.out.println("Negative Even Number");
            }else{
                System.out.println("Even Number");
            }
        }else{
            if(num<0){
                System.out.println("Negative Odd Number");
            }else{
                System.out.println("Odd Number");
            }
        }
    }
}
