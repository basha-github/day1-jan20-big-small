import java.util.Scanner;

public class CountNotes {

	public static void main(String[] args) {
	
		//Write a program to count total number of notes in given amount
		
		// 10
		// 1 2 5 10
		Scanner sc = new Scanner(System.in);
		System.out.println("enter amount to return");
		int rupees = sc.nextInt();
		// 58
		int notes10 =0,coin5=0,coin2=0,coin1=0;
		boolean is2Coin = false;
		if(rupees >= 10) {
			// 54 / 10-----5
			notes10 = rupees / 10;// 5 of 10
			rupees = rupees % 10;// 8
		}
		if(rupees >= 5) {// 
			coin5 = rupees / 5;// 5 -- 1
			rupees = rupees % 5;//3
		}
		if( (is2Coin == true) && (rupees >= 2)) {// 
			coin2 = rupees / 2;// 2 -- 1
			rupees = rupees % 2;//1
		}
		if(rupees >= 1) {// 
			coin1 = rupees;// 2 -- 1
		}
		if(notes10 > 0)
		System.out.println("10 Notes--->"+notes10);
		if(coin5 > 0)
		System.out.println("5 coin--->"+coin5);
		if(coin2 > 0)
		System.out.println("2 coin--->"+coin2);
		if(coin1 > 0)
		System.out.println("1 coin--->"+coin1);
		
		
		
		
		
	}

}
