import java.util.ArrayList;
class SimpleLoopArray {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Lovely");
		list.add("Kiara");
		list.add("Disha");
		list.add("Rasa");
		Object[] array = list.toArray();
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}
}