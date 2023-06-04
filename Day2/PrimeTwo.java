import java.util.Scanner;

public class PrimeTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=2;i*i<=num;i++){
            if(num%i==0){
               count++;
               break;
            }
        }
        if(count==0){
            System.out.println("Prime Number");
        }else{
            System.out.println("Not Prime Number");
        }
    }
}
