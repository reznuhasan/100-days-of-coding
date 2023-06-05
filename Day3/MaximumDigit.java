import java.util.Scanner;

public class MaximumDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            int newNum=sc.nextInt();
            arr[i]=newNum;
        }
        int maximum=arr[0];
        for(int i=0;i<num;i++){
            if(maximum<arr[i]){
                maximum=arr[i];
            }
        }
        System.out.println("Result: "+maximum);
    }
}
