class Biology {
	String topic;
	int chapter;
	public void studied(){
		System.out.println("Student can started  studied at biology");
	}
}
class Maths extends Biology {
	String headline;
	public void display(){
		System.out.println("Aritmetic progression");
	}
}
class English extends Maths {
	public void spoken() {
		System.out.println("English is the main pillar  of all the subject");
	}
}
class INheritance09 {
	public static void main(String[] args) {
		English eng = new English();
		eng.headline = "AP";
		System.out.println("Math topic headline: "+eng.headline);
		eng.display();
		eng.spoken();

		Maths mat = new Maths();
		mat.topic = "Reproductive system";
		mat.chapter = 2;
		mat.headline = "Male/femal";
		mat.studied();
		System.out.println("biology topic : "+mat.topic);
		System.out.println("bio chapter num "+mat.chapter);
		System.out.println("bio headline: "+mat.headline);
		
	}
}