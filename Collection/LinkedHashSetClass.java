
import java.util.*;
class Country {
	String name;
	int population;
	Country(String name, int population) {
		this.name = name;
		this.population = population;
	}
	public String toString() {
		return name+", "+population;
	}
	public boolean equals(Object obj) {
		Country country = (Country)obj;
		return this.population == country.population&&this.name.equals(country.name);
	}
}
class LinkedHashSetClass {
	public static void main(String[] args) {
		
		HashSet set = new LinkedHashSet();
		//set.add("India");
		//set.add("Russia");
		//set.add("Pakistan");
		//set.add("England");
		//set.add("England");
		set.add(new Country("India",130));
		set.add(new Country("Russia",100));
		set.add(new Country("England",30));
		set.add(new Country("Pakistan",240));
		System.out.println(set);
		// remove
		System.out.println(set.remove("Pakistan"));
		System.out.println(set);
	}
}