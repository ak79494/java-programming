class Subject {
    String subject;
	Subject(String subject){
		System.out.println("Studing started in the  physic subject");
		this.subject = subject;
	}
}
class Physic1 extends Subject {
	String headline;
	Physic1(String headline){
		super("PHYSIC AND BIOLOGY");
		System.out.println("started topic motion third law");
		this.headline = headline ;
	}
}
class Biology extends Physic1{
	String lession;
	Biology(String lession){
		super("topic Motion third law");
		System.out.println("Starting  new subject biology ");
		this.lession = lession;
	}
}
class Chaning {
	public static void main(String[] args) {
		Biology bio = new Biology("reproductive system");
		
		System.out.println("topic subject: "+bio.subject);
		System.out.println("topic physic: "+bio.headline);
		System.out.println("topic biology: "+bio.lession);
		
	}

}