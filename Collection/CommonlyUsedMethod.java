import java.util.*;
class CommonlyUsedMethod {
	public static void main(String[] args) {
		ArrayList<String> list1 = new ArrayList<>();
		list1.add("Lovely");
		list1.add("Kiara");
		list1.add("Disha");
		list1.add("Rasa");

		ArrayList<String> list2 = new ArrayList<>();
		list2.add("India");
		list2.add("Latvia");
		list2.add("England");
		list2.add("Russia");

		System.out.println(list1); // lovely, kiara,Disha,Rasa
		System.out.println(list1.size()); //4
		//addAll()
		list1.addAll(list2);
		System.out.println(list1); // all
		System.out.println(list1.size()); //8

		//remove()
		System.out.println(list1.remove("England")); // true
		System.out.println(list1); //  rem

		//removeAll(())
		list1.removeAll(list2);
		System.out.println(list1);


		//contains()
		if(list1.contains("Rasa")) {
			System.out.println("Rasa is Available in element");
		}else{
			System.out.println("Rasa is not Available in Element");
			
		}
		

	}
}