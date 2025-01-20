
public class IfElseAndOrDemo {

	public static void main(String[] args) {
		
		
		int num = 10;
		
		
		if( (num++ > 0) || (++num > 5) && (num++ > 8)) {// 
			System.out.println("+ve number...");
			//System.out.println("num --->"+num);
		}
		System.out.println("num--->"+num);
	}

}
