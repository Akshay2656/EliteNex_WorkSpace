class Result{
	private int studentRollNo;
	private String studentName;
	private int englishMarks;
	private int mathsMarks;
	private int physicsMarks;
	
	Result(int studentRollNo, String studentName, int englishMarks, int mathsMarks, int physicsMarks){
		this.studentRollNo = studentRollNo;
		this.studentName = studentName;
		this.englishMarks = englishMarks;
		this.mathsMarks = mathsMarks;
		this.physicsMarks = physicsMarks;
	}
	
	public void setRollNo(int studentRollNo){
		this.studentRollNo = studentRollNo;
	}
	
	public int getRollNo(){
		return studentRollNo;
	}
	
	public void setName(String studentName){
		this.studentName = studentName;
	}
	
	public String getName(){
		return studentName;
	}
	
	public void setEnglishMarks(int englishMarks){
		this.englishMarks = englishMarks;
	}
	
	public int getEnglishMarks(){
		return englishMarks;
	}
	
	public void setMathsMarks(int mathsMarks){
		this.mathsMarks = mathsMarks;
	}
	
	public int getMathsMarks(){
		return mathsMarks;
	}

	public void setPhysicsMarks(int physicsMarks){
		this.physicsMarks = physicsMarks;
	}
	
	public int getPhysicsMarks(){
		return physicsMarks;
	}
	
	// Calculation methods
	public int calculateTotal(){
		return englishMarks + mathsMarks + physicsMarks;
	}
	
	public double calculatePercentage(){
		int total = calculateTotal();
		return (total/300) * 100;  
	}
	
	public String calculateGrade(){
		double percentage = calculatePercentage();
		
		if (percentage >= 90){
			return "A+";
		}
		else if (percentage < 90 && percentage >= 70){
			return "A";
		}
		else if (percentage < 70 && percentage >= 50){
			return "B";
		}
		else if (percentage < 50 && percentage >= 35){
			return "C";
		}
		else{
			return "Fail";
		}
	}

		public void display(){
			System.out.println("Student RollNo  : "+getRollNo());
			System.out.println("Student Name    : "+getName());
			System.out.println("English Marks   : "+getEnglishMarks());
			System.out.println("Maths Marks     : "+getMathsMarks());
			System.out.println("Physics Marks   : "+getPhysicsMarks());
			
			System.out.println("Total Marks     : "+calculateTotal());
			System.out.println("Total Percentage: "+calculatePercentage());
			System.out.println("Grade           : "+calculateGrade());
			
		}
	
}

public class ResultProcessor{
	public static void main(String[] args){
	
		
		Result result = new Result(101, "Akshay", 89,53,65);
		
		result.display();
		
	}
}
