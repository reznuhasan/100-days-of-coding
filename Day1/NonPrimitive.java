class Demo{
    int x;
    int y;
}
public class NonPrimitive {
    public static void main(String[] args) {
        Demo b=new Demo();
        b.x=20;
        b.y=30;
        Demo c=b;
        c.x=50;

        System.out.println(c.x);
        System.out.println(b.x);

    }
    
}
