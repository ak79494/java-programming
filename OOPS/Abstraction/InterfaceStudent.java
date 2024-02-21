interface Student2 {
	int i = 10;
	void play();
}
class Shradha implements Student2 {
	public void play() {
		System.out.println("Shradha playing cricket");
	}
}
class Aman implements Student2 {
	public void play() {
		System.out.println("Aman playing a football");
	}
}
class Helperclass {
	static Student2 getPlay(String type) {
		if(type.equals("cricket")) {
			return new Shradha();
		}else{
			return new Aman();
		}
	}
}
class InterfaceStudent {
	public static void main(String[] args) {
		Student2 student = Helperclass.getPlay("football");
		student.play();
		
	}
}