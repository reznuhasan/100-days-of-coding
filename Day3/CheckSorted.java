import java.util.Scanner;

public class CheckSorted {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=sc.nextInt();
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            int newNum=sc.nextInt();
            arr[i]=newNum;
        }   
        boolean sorted=true;
        if(arr[0]<arr[1]){
            for(int i=1;i<num-1;i++){
                if(arr[i]>arr[i+1]){
                    sorted=false;
                }
            }
        }
        if(arr[0]>arr[1]){
            for(int i=1;i<num-1;i++){
                if(arr[i]<arr[i+1]){
                    sorted=false;
                }
            }
        }
        System.out.println(sorted);
    }
    
}
