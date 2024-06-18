package NumberWork;

public class CountOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 12345;
		 int sum = 0;
		 
		 for(;number>0;) {
			 
			 //sum = sum + number%10;
			 number = number/10;
			 sum=sum+1;
		 }
		 System.out.println(sum);
		 }
		


	}


