public class Stmethod {
    // static variable
    static int a = 40;
  
    // instance variable
    int b = 50;
  
    void simpleDisplay()
    {
        System.out.println(a);
        System.out.println(b);
    }
  
    // Declaration of a static method.
    static void staticDisplay()
    { 
      System.out.println(a); 
    }
  
    // main method
    public static void main(String[] args)
    {
        Stmethod obj = new Stmethod();
        obj.simpleDisplay();
  
        // Calling static method.
        staticDisplay();
    }
}