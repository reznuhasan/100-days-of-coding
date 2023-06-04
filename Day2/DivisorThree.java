import java.util.Scanner;

public class DivisorThree {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int i=1;
        while(i*i<num1){
            if(num1%i==0){
                System.out.println(i);
            }
            i++;
        }
        while(i>=1){
            if(num1%i==0){
                System.out.println(num1/i);
            }
            i--;
        }
    }
}
