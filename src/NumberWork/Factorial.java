package NumberWork;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result =factorial(5);
		System.out.println("factorial="+result);
	}
	
	
	
	static int factorial(int number){
		int facto=1;
		for (int i = 1; i <=number; i++) {
			facto*=i;// facto=facto*i;	
		}
		return facto;
	}
	



	}


