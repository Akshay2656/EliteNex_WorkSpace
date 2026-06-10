class Calculator{
	public int calculate(int a , int b){
		return a + b;
	}
	
	public int calculate(int a, int b, int c){
		return a + b + c;
	}

	public double calculate(double a , double b){
		return a + b;
	}
	
	public int multiply(int a , int b){
		return a * b;
	}
	
	public static void main(String[] args){
		Calculator c = new Calculator();
		
		System.out.println(c.calculate(10, 20));
		System.out.println(c.calculate(10, 20, 30));
		System.out.println(c.calculate(10.05, 20.40));
		System.out.println(c.multiply(10, 20));
	}
}

