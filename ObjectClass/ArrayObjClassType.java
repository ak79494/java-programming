class ArrayBlackList {
	Object[] arr;
	int count;
	public ArrayBlackList(int length) {
		arr = new Object[length];	
	}
	public void printArray() {
		for(int i=0; i<count; i++) {
			System.out.println(arr[i]+" ");
		}
	}
	public void add(Object element) {
		if(arr.length == count) {
			Object[]newArray = new Object[2 * count];
			for(int i=0; i<count; i++) {
				newArray[i]  = arr[i];
			}
			arr = newArray;

		}
		arr[count++]  = element;
	}
}
class ArrayObjClassType {
	public static void main(String[] args) {
		ArrayBlackList abl = new ArrayBlackList(4);
		abl.add(10);
		abl.add(20);
		abl.add(30);
		abl.add(false);
		abl.printArray();

	}
}