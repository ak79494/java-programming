import java.util.Arrays;

class SortStringAccending {

  public static void main(String[] args) {
    // input string str
    String str = "scaler";

    // now convert the string into char array
    char array[] = str.toCharArray();

    // now sort the array using array.sort() method
    // without passing any comparetor (natual order)

    Arrays.sort(array);
    // making the string from the array
    str = new String(array);

    System.out.println(str);
  }
}