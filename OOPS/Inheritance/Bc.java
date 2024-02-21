class Bc
{
    int a;
};

class Dc extends Bc
{
    int b;
    void set (int x, int y)
    {
        a=x;
        b=y;
    }
    void sum ()
    {
        System.out.println ("SUM = "+(a+b));
    }
}

class InDemo
{
    public static void main (String k [])
    {
        int n1=Integer.parseInt (k [0]);
        int n2=Integer.parseInt (k [1]);
        Dc do1=new Dc ();
        do1.set (n1, n2);
        do1.sum ();
    }
};