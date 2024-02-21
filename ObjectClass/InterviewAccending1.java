import java.util.Arrays;
class InterviewAccending1 {
	public static void main(String[] args) {
		String name = "jacqueline farnendez";
		char[] arr = name.toCharArray();
		Arrays.sort(arr);
		name = new String(arr);
		System.out.println(name);

	}
}