public class Format {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        System.out.format("a=%d,b=%d%n",a,b);
        if(args.length==0){
            System.out.println("No args");
        }else{
            for (String x : args) {
                System.out.println(x+" ");
            }
        }
    }
}
