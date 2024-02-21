class LogicalAND {
	public static void main(String[] args) {
		int pin = 2222;
		int dpin = 2222;

		int amt = 500;
		int bal = 1000;

		boolean result = (pin==dpin) && (amt<=bal);
	                     // true     &&  true 
		System.out.println(result);
	}
}