class StringAccending2 {
	public static void main(String[] args) {
		String name = "Rasa tandon";
		char[] arr = name.toCharArray();

		Arrays.sort(arr);

		name = new String(arr);
		System.out.println(name);
	}
}