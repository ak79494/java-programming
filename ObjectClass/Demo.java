class Demo {
	String name;
	int age;
	Demo(String name, int age) {
		this.name = name;
		this.age = age;

	}
	public int hashCode() {
		return age;
	}
	public boolean equals(Object obj) {
		return this.hashCode()==obj.hashCode();
	}
	public String toString() {
		return name+" "+age;
	}
}
