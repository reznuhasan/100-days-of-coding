import java.util.Scanner;

public class PatternOne{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number of row: ");
        int row=sc.nextInt();
        System.out.print("Enter number of col: ");
        int col=sc.nextInt();
        for(int i=1;i<=row;i++){
            for(int j=1;j<=col;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
    }
}
