class Animal implements Comparable {
	String name;
	int legs;
	Animal(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}
	public int compareTo(Object obj) {
		Animal ani = (Animal)obj;
		return this.legs-ani.legs;
	}
	public String toString() {
		return "Name: "+name+ ", legs: "+legs;
	}	
}