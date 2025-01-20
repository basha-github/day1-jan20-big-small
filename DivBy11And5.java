import java.util.Scanner;

public class DivBy11And5 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num = sc.nextInt();
		
		
		if( (num % 5 == 0 ) &&(num % 11 == 0)) {
			System.out.println("bot div by 5 and 11");
		}
		else {
			System.out.println("not");
		}
		
		
	}

}
