import java.util.Scanner;

class CheckNumber{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        if(num1%2==1){
            System.out.println("It's Odd Number");
        }else{
            System.out.println("It's Even Number");
        }
    }
}