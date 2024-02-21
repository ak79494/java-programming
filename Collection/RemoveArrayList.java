import java.util.ArrayList;
import java.util.List;
class RemoveArrayList {
	public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
    
    al.add("India");
    al.add("Latvia");
    al.add("Ukraine");
    al.add("Russia");
    al.add("Russia");
    System.out.println("Before Remove Duplicate elements:"+al);
    for(int i=0;i<al.size();i++){
 
        for(int j=i+1;j<al.size();j++){
            if(al.get(i).equals(al.get(j))){
                al.remove(j);
                j--;
            }
    }
 
 }
 
    System.out.println("After Removing duplicate elements:"+al);
 
	}
}