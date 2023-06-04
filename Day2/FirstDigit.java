import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int firstDigit=num;
        while(num>0){
            num=num/10;
            if(num/10==0 && num!=0){
                firstDigit=num;
            }
        }
        System.out.println("result: "+firstDigit);
    }
}
