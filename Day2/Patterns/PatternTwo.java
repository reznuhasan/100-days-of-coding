import java.util.Scanner;

public class PatternTwo {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=num;j++){
                if(num<i+j){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            for(int k=1;k<i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
