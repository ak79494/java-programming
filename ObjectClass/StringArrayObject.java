class Rashmika {
	String type = "Actress";
	public static void newFilm() {
		System.out.println("National crush Rashmika mandanna");
		System.out.println("Upcoming movies: Animal, Pushpa 2");
	}
}
class StringArrayObject {
	public static void main(String[] args) {
		Rashmika actress1 = new  Rashmika();
		Rashmika actress2 = new  Rashmika();

		Rashmika[] actress = {actress1, actress2};
		for(Rashmika mandanna : actress) {
			System.out.println(mandanna.type);
			mandanna.newFilm();
		}
	}
}