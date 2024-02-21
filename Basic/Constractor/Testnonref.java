class NonReference{
	int i;
	 void m(int i){
		System.out.println("m()executed");
		System.out.println(i);
		System.out.println(this.i);
	}
}
class Testnonref{
	public static void main(String[] args) {
		NonReference n = new NonReference();
		n.m(24);
		
	}
}