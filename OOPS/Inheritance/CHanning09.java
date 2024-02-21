class Subject {
	int totalSubject;
	String name;
	Subject(int totalSubject,String name){
		System.out.println("Student are starting the studies");
		this.totalSubject = totalSubject;
		this.name = name;
	}
	
		}
		class English extends Subject {
		String topic;
		English(String topic) {
			super(2,"first English , 2nd accountanct");
			System.out.println("total 2 subject");
			this.topic = topic;
	}
}
class CHanning09 {
	public static void main(String[] args) {
		English eng = new English ("Spoken english");
		System.out.println( "total subject: "+eng.totalSubject);
		System.out.println("Subject name: "+eng.name);
		System.out.println("english topic: "+eng.topic);
	}
}