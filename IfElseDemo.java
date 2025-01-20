
public class IfElseDemo {

	public static void main(String[] args) {
		
		int num =-10;
		
		if(num++ > 0) {// 10
			System.out.println("+ve number");
		}
		else if(++num < 0){//12
			System.out.println("-ve number");
		}
		else if(num++ == 0) {//12
			System.out.println("zero number....");
		}
		System.out.println("num---->"+num);// 13
		
		System.out.println("ends");
	
		
	}

}
