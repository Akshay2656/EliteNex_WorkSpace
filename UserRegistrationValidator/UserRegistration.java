class UserRegistration{
	public void checkAge(int age) throws InvalidAgeException{
		if (age < 18) {
			throw new InvalidAgeException("Age Must be greater than 18");
		}
	}	
	
	public void validatePassword(String password) throws InvalidPasswordException{
		boolean hasMinLength = password.length() >= 8;
		boolean hasDigits = password.matches(".*[0-9].*");
		boolean hasSpecialChar = password.matches(".*[!@#$%^&*()-=\\-=\\[\\]{};':\"\\\\|,.<>/?].*");
		
		if ( !hasMinLength || !hasDigits || !hasSpecialChar) {
			throw new InvalidPasswordException("Password must contains at least 8 character, one digit and one special character");
		}
	}
	
	
	public void registerUser(String userName, int age, String password) {
		try{
			checkAge(age);
			validatePassword(password);
			System.out.println("Registration Successfull");
			System.out.println("Welcome "+userName);
			
		}catch(InvalidAgeException e) {
			System.out.println("Registration failed");
			System.out.println("InvalidAgeException: "+e.getMessage());
			
		}catch(InvalidPasswordException e){
			System.out.println("Registration Failed");
			System.out.println("InvalidPasswordException: "+e.getMessage());
		}
	}
}