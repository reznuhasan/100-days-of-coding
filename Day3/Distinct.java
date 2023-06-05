import java.util.Scanner;

public class Distinct {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            int newNum=sc.nextInt();
            arr[i]=newNum;
        }
        for(int i=0;i<num-1;i++){
            for(int j=i+1;j<num;j++){
                if(arr[i]==arr[j] && arr[i]!=0){
                    arr[j]=0;
                }
            }
        }
        int count=0;
        for(int i=0;i<num;i++){
            if(arr[i]!=0){
                count++;
            }
        }
        System.out.println("Result: "+count);
    }
}
