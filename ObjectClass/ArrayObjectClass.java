class BlackList {
	int[] arr;
	int idx;
	public BlackList(int size) {
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
class ArrayObjectClass {
	public static void main(String[] args) {
		BlackList list = new BlackList(2);
		list.add(0);
		list.add(2);
		list.printArray();
	}
}