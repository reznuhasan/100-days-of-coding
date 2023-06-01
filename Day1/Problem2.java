import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fnum=sc.nextInt();
        int rnum=sc.nextInt();
        int tnum=sc.nextInt();
        int result=fnum*(int)(Math.pow(rnum, tnum-1));
        System.out.println(result);
    }
}
