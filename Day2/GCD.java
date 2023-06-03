import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1<num2){
            int temp=num1;
            num1=num2;
            num2=temp;
        }
        int gcd=1;
        for(int i=2;i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                gcd=i;
            }
        }
        System.out.println("Result: "+gcd);
    }
}
