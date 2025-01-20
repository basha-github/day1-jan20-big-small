import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
	
		// Write a program to check whether a number is negative, 
		//positive or zero	
		
		//int num = 100;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please  enter number...");
		int num = sc.nextInt();
		
		if(num > 0) {
			System.out.println("+ve number");
		}
		else if(num < 0){
			System.out.println("-ve number");
		}
		else if(num == 0) {
			System.out.println("zero number....");
		}
		
		System.out.println("ends");
		
		
		
	}

}
