package AbstractClass;

public class question1 {
    public static void main(String[] args)
    {
        Test obj = new Test();
        obj.set(2);
        obj.get();
    }
}



abstract class demo
{
    public int a;
    demo()
    {
        a = 10;
    }

    abstract public void set(int a);

    abstract  public void get();

}

class Test extends demo
{

    public void set(int a)
    {
        this.a = a;
    }

    final public void get()
    {
        System.out.println("a = " + a);
    }

}
