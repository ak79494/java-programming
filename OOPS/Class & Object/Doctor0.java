class Doctor0{
	public static void main(String[] args) {
		Stranger.tellmePatientName();
		int age = Stranger.getPatientAge();
		System.out.println("Doctor can received patient age "+age);
		int fees = Stranger.getPatientFees();
		System.out.println("Fees : "+fees);
		 Patient p = Stranger.getPatientDetails();
		 System.out.println("Patient Name : "+p.name);
		 System.out.println("Patient address :"+p.address);
		 System.out.println("Patient phone : "+p.phone);
	}
}