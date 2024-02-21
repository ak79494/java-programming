class ObjectArray {
	private Object[] objArray = new Object[5];
	int countElement = 0;

	public void add(Object obj) {
		if(countElement == objArray.length) {
			increaseCapacity();
			objArray[countElement] = obj; // add obj can store in obect obj
		    countElement++;
		}	
	}
	public void increaseCapacity() {
		int newCapacity = objArray.length*2;
		Object[] nextArray = new Object[newCapacity];
		for(int i=0; i<objArray.length; i++) {
			nextArray[i] = objArray[i];
		}
		objArray = nextArray;
		System.out.println(objArray[i]+" ");
	}
}
class ObjectArrayTest{
	public static void main(String[] args) {
		ObjectArray objA = new ObjectArray();
		objA.add(10);
		objA.add(20);
		objA.add(30);
		objA.add(false);
		objA.increaseCapacity();
		System.out.println();
		objA.printArray();
	}
}