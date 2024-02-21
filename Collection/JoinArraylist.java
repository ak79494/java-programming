 //Write a program in java to join two arraylists into one arraylist.
import java.util.*;
class JoinArraylist {
    public static void main(String[] args) {
        ArrayList<String> mainList = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
            list1.add("Monday");
            list1.add("Tuesday");
            list1.add("Wednesday");
            list1.add("Thursday");
            System.out.println("List1: "+list1);

            ArrayList<String> list2 = new ArrayList<>();
            list2.add("Monday");
            list2.add("Tuesday");
            list2.add("Wednesday");
            list2.add("Thursday");
            System.out.println("List2 :"+list2);
            mainList.addAll(list1);
            mainList.addAll(list2);
            System.out.println(mainList);
            

    }

}