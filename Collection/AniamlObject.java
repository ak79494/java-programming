import java.util.*;
class AniamlObject {
	public static void main(String[] args) {
		TreeSet t = new TreeSet();
		t.add(new Animal("Lion", 2));
		t.add(new Animal("Tiger", 1));
		t.add(new Animal("Chita", 3));
		t.add(new Animal("Cow", 4));
		System.out.println(t);
	}
}