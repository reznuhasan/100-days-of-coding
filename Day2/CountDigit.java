import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int count=0;
        while(true){
            System.out.println("Enter Zero For Stop.");
            System.out.print("Enter Your Number: ");
            int num=sc.nextInt();
            if(num==0){
                break;
            }
            count++;
        }
        System.out.println("Total Number: "+count);
    }
}
