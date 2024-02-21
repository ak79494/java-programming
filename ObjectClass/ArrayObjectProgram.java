class Program {
	int[] arr;
	int idx;
	public Program(int size) {
		arr = new int[size];
		idx = 0;
	}
	public void add(int num) {
		if(idx<arr.length) {
			arr[idx] = num;
			idx++;
		}else{
			System.out.println("Array is full");
		}
	}
	public void printArray() {
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
}
class ArrayObjectProgram {
	public static void main(String[] args) {
		Program pro =  new  Program(3);
		pro.add(0);
		pro.add(2);
		pro.add(4);
		pro.printArray();

	}
}