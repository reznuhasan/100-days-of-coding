import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fnum=sc.nextInt();
        int dnum=sc.nextInt();
        int tnum=sc.nextInt();
        int result=fnum+((tnum-1)*dnum);
        System.out.format("Result:%d",result);
    }
    
}
