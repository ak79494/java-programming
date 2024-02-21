class Rvariable1{
	int i;
	void m(int i){
		System.out.println("m()executed");
		System.out.println(i);
		System.out.println(this.i);
	}
}
class Testvariable1{
	public static void main(String[] args) {
		Rvariable1 r = new Rvariable1();
		r.m(24);
		
	}
}