import java.util.*;

class Student{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<String> student = new ArrayList<>();
		student.add("Akshay");
		student.add("Pallavi");
		student.add("Asmita");
		student.add("Rohit");
		student.add("Pooja");
		
		System.out.println("Students List ");
		for( String name : student){
			System.out.println(name+" ");
		}
		
		System.out.println("Total Student: "+student.size());
		
		System.out.println("Search Student: ");
		String keyElement = sc.nextLine();
		
		if (student.contains(keyElement)){
			System.out.println(keyElement+" is present");
		}	
		else{
			System.out.println(keyElement+" is not present");
		}
	}
}