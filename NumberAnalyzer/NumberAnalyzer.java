import java.util.*;

class NumberAnalyzer{
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
	
		// if (num > 0 ){
			// if( num % 2 == 0){
				// System.out.println("Number Is Even");
			// }else{
				// System.out.println("Number is odd");
			// }
			// System.out.println("Number is Positive "+num);
		// }	
		// else if (num < 0){
			// System.out.println("Number is Negative "+num);
		// } else{
			// System.out.println("Zero"+num);
		// }
		
		if (num > 0){
			System.out.println("Number is Positive");
		}
		else if (num < 0) {
			System.out.println("Number is Negative");
		}
		else{
			System.out.println("Number is Zero");
		}
		
		if (num != 0){
			if (num % 2 == 0){
				System.out.println("Number is Even");
			}
			else{
				System.out.println("Number is Odd");
			}
		}
		
	}
}