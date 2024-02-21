class Nora{
	static void saveemployename(String name){
		System.out.println("Employee name: "+name);
	}
	static void saveAccount(String account){
		System.out.println("Account name: "+account);
	}
	static void saveageofemployee(int age){
		System.out.println("age: "+age);
	}
	static void allemployeename(String[] names){
		for(int i=0;i<names.length;i++){
			System.out.println("All employee names: "+names[i]);
		}
	}
}