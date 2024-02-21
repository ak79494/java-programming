// Write a program to join two ArrayList into one single ArrayList
import java.util.*;
class TwoArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> mainList = new ArrayList<>();

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("India");
        list1.add("Latvia");
        mainList.add(list1);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Russia");
        list2.add("Ukraine");
        mainList.add(list2);
        
        //Nested loops
        for(int i=0; i<mainList.size(); i++) {
            ArrayList<String> currList = mainList.get(i);
            for(int j=0; j<currList.size(); j++) {
                System.out.println(currList.get(j)+" ");
            }
        }
        System.out.println(mainList);
    }
}