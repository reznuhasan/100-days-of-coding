import java.util.Scanner;

public class SumOfArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            int newNum=sc.nextInt();
            arr[i]=newNum;
        }
        int sum=0;
        for(int i=0;i<num;i++){
            sum+=arr[i];
        }
        System.out.println("Result: "+sum);
    }
}