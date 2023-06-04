import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int prevNum=-1;
        int presentNum=1;
        for(int i=0;i<num;i++){
            int res=presentNum+prevNum;
            System.out.print(res+" ");
            prevNum=presentNum;
            presentNum=res;
        }
    }
}
