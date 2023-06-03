import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiplication");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("Addition Operation");
                int value1 = sc.nextInt();
                int value2 = sc.nextInt();
                System.out.println("result: " + (value1 + value2));
                break;
            case 2:
                System.out.println("Subtraction Operation");
                int value3= sc.nextInt();
                int value4 = sc.nextInt();
                System.out.println("result: " + (value3 - value4));
                break;
            case 3:
                System.out.println("Multipication Operation");
                int value5= sc.nextInt();
                int value6 = sc.nextInt();
                System.out.println("result: " + (value5 * value6));
                break;
        }
    }
}
