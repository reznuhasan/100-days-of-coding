import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        
        int result=(num*(num+1))/2;
        System.out.println(result);
    }
}
