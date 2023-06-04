import java.util.Scanner;

public class DivisorTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        while(num>=i){
            if(num/i<i){
                break;
            }
            if(num%i==0){
                System.out.format("%d %d",i,num/i);
                System.out.println();
            }
            i++;
        }
        
    }
}
