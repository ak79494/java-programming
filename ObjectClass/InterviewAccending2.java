import java.util.Arrays;
class InterviewAccending2 {
	public static void main(String[] args) {
		String[] name = {"jacqueline","Disha patani","Rasa", "Shruti"};
		int size = name.length;
		for(int i=0; i<size-1; i++) {
			for(int j=i+1; j<size; j++) {
				if(name[i].compareTo(name[j]) > 0) {
					//swap

					String temp = name[i];
					name[i] = name[j];
					name[j] = temp;
				}
			}

		}
		System.out.println(Arrays.toString(name));
	}
}