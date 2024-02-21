class AzamSr{
	 int i;
	int j;
	void simpledisplay(){
		System.out.println(i);
		System.out.println(j);
	}
	class Student10{
		static String name;
		static int age;
		static void staticdisplay(){
			System.out.println("name: "+name);
			System.out.println("age: "+age);
		} 
			
		}
		public static void main(String[] args) {
			AzamSr obj = new AzamSr();
			obj.simpledisplay();
			staticdisplay();
	}
}