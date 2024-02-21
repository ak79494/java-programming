import java.util.*;
class StringLetter {
    public static void main(String[] args) {
        
        String letters = "Azam";
        System.out.println("Input: "+letters);
        System.out.print("Output: ");
        
        // Convert String to a char array.
        char[] array = letters.toCharArray();
       
        // Modify the array.
        array[0] = 'a';
        array[1] = 'Z';
        array[2] = 'A';
        array[3] = 'M';

        
        
        // Get the String.
        String result = new String(array);
        System.out.println(result);
    }
}
