class TechMhindra{
	public static void main(String[] args) {
		 String[] names = Manager.getNamesofEmployes();
		 System.out.println("techmahindra received all the employees name");
		 for(int i=0; i<names.length;i++){
		 	System.out.println("Employees names: "+names[i]);
		 }
		 long[] phones = Manager.getNumberofEmployees();
		 System.out.println("Employees received phones numberrs");
		 for(int j=0; j<phones.length; j++){
		 	System.out.println("Employees numbers "+phones[j]);
		 }
	}
}