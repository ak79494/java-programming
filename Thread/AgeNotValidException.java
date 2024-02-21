class AgeNotValidException extends RuntimeException {
	AgeNotValidException() {
		super("Your age is below 18");
	}

} 