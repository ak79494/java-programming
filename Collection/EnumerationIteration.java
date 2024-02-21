import java.util.*;
public class EnumerationIteration
{
 public static void main(String args[])
 {
   Vector Barista = new Vector();
   Barista.add("Chipotele"); Barista.add("Starbucks"); Barista.add("Dunkin Donuts");
// Creating the enumeration from Vector
   Enumeration enumerate = Barista.elements();
// Traversing to the elements using hasMoreElements() method.
   while(enumerate.hasMoreElements())
   {
    //
     System.out.println(enumerate.nextElement());
   }
 }
}