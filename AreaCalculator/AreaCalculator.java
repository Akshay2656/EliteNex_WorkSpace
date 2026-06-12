class AreaCalculator{
	public int calculateArea(int side){
		return side * side;
	}
	
	public int calculateArea(int length, int width){
		return length * width;
	}

	public double calculateArea(double radius){
		return 3.14 * radius * radius;
	}
	
	public double calculateArea(double base , double height){
		return 0.5 * base * height;
	}
	
	public static void main(String[] args){
		AreaCalculator area = new AreaCalculator();
		
		System.out.println(area.calculateArea(20));
		System.out.println(area.calculateArea(20,20));
		System.out.println(area.calculateArea(4));
		System.out.println(area.calculateArea(10,12));
	}
}