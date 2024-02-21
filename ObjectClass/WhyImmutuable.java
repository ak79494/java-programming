final class Immutuable {
	final String name;
	final int age;
	Immutuable(String name,int age) {
		this.name = name;
		this.age = age;
	}
	Immutuable change(String name,int age) {
		Immutuable im = new Immutuable(name,age);
		return im;
	}
}
class WhyImmutuable {
	public static void main(String[] args) {
		Immutuable imm = new Immutuable("Shradha",24);
		System.out.println(imm.name);
		System.out.println(imm.age);

		Immutuable im = imm.change("Aman", 24);
		System.out.println("imm name: "+imm.name+"  "+imm.age);
		System.out.println("im name: "+im.name+" "+im.age);

		// concat 
		String s1 = new String("Shradha");
		System.out.println("before concat: "+s1);
		String s2 = s1.concat("khapra");
		System.out.println("After concat: "+s2);
	}
}