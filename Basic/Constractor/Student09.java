class AzamSir{
	 int i;  
    int j;  
    void simpledisplay(int i , int j){
    i = i;
    j = j;

    }
   public void printInfo(){
   	System.out.println(this.i);
   	System.out.println(this.j);
   }
   class Student09{
	static String name;
	static int age;
	Student09(String name, int age){  
	}
void staticdisplay(){
	System.out.println("name: "+name);
	System.out.println("age: "+age);
}
}
public static void main(String[] args) {
	AzamSir obj = new AzamSir();
	obj.simpledisplay();
	staticdisplay();

}

}