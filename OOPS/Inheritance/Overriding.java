class Physic{
	public void subject(){
		System.out.println("started studing physic subject");
	}
}
class Topic extends Physic {
	public void chapter(){
		super.subject();
		System.out.println("Started which topic studing in physic");
	}
}
class Overriding {
	public static void main(String[] args) {
		Topic topic =new Topic();
		topic.subject();
		topic.chapter();
	}
}