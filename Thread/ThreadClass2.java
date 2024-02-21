class Aman implements Runnable{
	public void run() {
		for(int i=1;i<=5; i++) {
			System.out.println("Aman married with shraddha "+i);

		}
	}
}
class ThreadClass2 {
	public static void main(String[] args) {
		Aman aman1 = new Aman();
		//Aman aman2 = new Aman();

		Thread t1 = new Thread(aman1);
		//Thread t2 = new Thread(aman2);
		t1.start();
	//	t2.start();
		for(int i=1;i<=5; i++) {
			System.out.println("Shradha Software Developer "+i);

		}
	}
}