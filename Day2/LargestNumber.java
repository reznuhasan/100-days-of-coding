import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int[] arr=new int[3];
        arr[0]=a;
        arr[1]=b;
        arr[2]=c;
        for(int i=0;i<2;i++){
            for(int j=i+1;j<3;j++){
                if(arr[i]<arr[j]){
                    arr[i]=arr[i]+arr[j];
                    arr[j]=arr[i]-arr[j];
                    arr[i]=arr[i]-arr[j];
                }
            }
        }
        for(int i=0;i<3;i++){
            System.out.println(arr[i]);
        }
        System.out.format("Largest Number:%d",arr[0]);
    }
    
}
