final class MyFinalClass {
	final String name;
	final int age;
	 MyFinalClass(String name,int age) {
	 	this.name = name;
	    this.age = age;
	 }
	 // final class cannot change the value but if i create another another value then go for change()k
	 MyFinalClass change(String name, int age) {
	 	MyFinalClass myf = new  MyFinalClass(name,age);
	 	return myf;
	 }
}
class ImmutuableClass {
	public static void main(String[] args) {
		MyFinalClass mf = new MyFinalClass("Shradha",24);
		System.out.println("name: "+mf.name);
		System.out.println(mf.age);

        // use change method
		MyFinalClass myf = mf.change("Shradha khapra", 24);
		System.out.println("full name: "+myf.name);
		System.out.println(myf.age);

		// concatenation
		String st1 = new String("Shradha"); //shradha is one object this is shradha// old obj
		System.out.println("before conact: "+st1);
		String st2 = st1.concat("khapra");// khapra in another objest not same name this this shradha khapra //old obj add some value then go concat method
		System.out.println("After concat: "+st2);
	}
}