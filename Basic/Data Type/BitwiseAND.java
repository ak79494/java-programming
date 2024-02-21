class BitwiseAND{
	public static void main(String[] args) {
		int pin = 2222;
		int dpin = 3333;

		int amt = 1000;
		int bal = 2000;

		boolean result = (pin==dpin)&(amt<=bal);
		                //cond1 false & cond2 true
		System.out.println(result);

		int a = 8;
		int b = 9;
		System.out.println(a&b);
	}
}
