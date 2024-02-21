import java.util.HashSet;
import java.util.Iterator;
class HashSetToObject {
	public static void main(String[] args) {
	  HashSet<String> hs = new HashSet<>();
      hs.add("India");
      hs.add("Russia");
      hs.add("Latvia");
      hs.add("Ukraine");
      Iterator it = hs.iterator();
      while(it.hasNext()) {
      	System.out.println(it.next());
      }
      System.out.println("Copying all elements...");
      Object[] obArr = hs.toArray();
      for (Object ob : obArr)
      System.out.println(ob);
	}
}