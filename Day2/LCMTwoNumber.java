import java.util.Scanner;

public class LCMTwoNumber {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    int i=2;
    int res=1;
    while(num1>i || num2>i){
        if(num1%i==0 && num2%i==0){
            num1=num1/i;
            num2=num2/i;
            res*=i;
        }else{
            i++;
        }
    }
    res*=(num1*num2);
    System.out.println("result: "+res);

   } 
}
