class Array1 {
	int[] arr;
	int idx;
	public Array1(int size) {
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
			for(int i=0; i<list.length;i++) {
				System.out.println(list[i]+"");
			}
			System.out.println();
		}
	}
			
	public static void main(String[] args) {
		Array1 list = new Array(4);
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.printArray();
	}
}