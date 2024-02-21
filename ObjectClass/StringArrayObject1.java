class Array3{
	int[] arr;
	int idx;
	public Array3(int size) {
		arr = new int[size];
		idx=0;
	}
	public void add(int num) {
		if(idx<arr.length) {
			arr[idx] = num;
			idx++;
		}else{
			System.out.println("Array is full");
		}
	}
	public void printArray(){
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]+" ");
		}
		System.out.println();
	}
}
class StringArrayObject1 {
	public static void main(String[] args) {
		Array3 array = new Array3(4);
		array.add(0);
		array.add(1);
		array.add(2);
		array.add(3);
		array.printArray();
	}
}