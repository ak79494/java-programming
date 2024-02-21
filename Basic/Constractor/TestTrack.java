class Track{
	int i;
	Track(){
		System.out.println("inside track");
		System.out.println("this: "+this);
	}
	void m(){
		System.out.println("inside m()");
		System.out.println("this: "+this);
	}
}
class TestTrack{
	public static void main(String[] args) {
		Track t = new Track();
		System.out.println("inside main");
		System.out.println("t: "+t);
		t.m();
		
	}
}