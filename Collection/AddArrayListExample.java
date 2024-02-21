import java.util.*;
public class AddArrayListExample {
    public static void main(String args[]) { 
       ArrayList<String> al = new ArrayList<String>(); 
       al.add("'India");
       al.add("Ukraine");
       al.add("Russia");
       al.add("Latvia");
       al.add(1,"England");
       System.out.println("ArrayList after adding String:"+ al);
        
       //Addition of String element at 1st position
       al.add(2, "Australia");

       //Displaying the ArrayList
       System.out.println("ArrayList after adding:"+ al);
    }
}