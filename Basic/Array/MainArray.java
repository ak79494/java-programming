class FixedArray {
	int[] arr;
	int idx;
	public FixedArray(int size) {
		arr = new int[size];
		idx = 0;
	}
	public void add(int number) {
		if(idx<arr.length) {
			arr[idx] = number;
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
class MainArray {
	public static void main(String[] args) {
		FixedArray arr = new FixedArray(4);
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(40);
		arr.printArray();
	}
}