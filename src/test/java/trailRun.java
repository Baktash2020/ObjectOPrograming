
public class trailRun {

	public static void main(String[] args) {


		int x = 0;
		
		int y= 10;
		int z;
		
		try {
		z=y/x;
		
		System.out.println(z);

	}
		
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("devide by zero is not possibel");
			
		}
		
		
		int a =45;
		int b = 50;
		System.out.println(a+b);
				
	}

}
