class PrimeRun implements Runnable { 
	long minPrime;
	PrimeRun(long minPrime) {
		this.minPrime = minPrime;
	}
	public void run() {
		System.out.println("Aman is a software developer");
	}
}
class ThreadPrimeRun {
	public static void main(String[] args) {
		PrimeRun p = new PrimeRun(143);
		Thread th = new Thread(p);
		th.start();
        
	    
	}
	
}