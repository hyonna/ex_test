package ex_test;

public class Test_1 {

	public static void main(String[] args) {
		
		int sum = 0;

		System.out.println("=========================");
		
		for(int i = 1; i < 1000; i++) {
			
			if(i % 3 == 0 || i % 5 == 0) {
				
				sum += i;
			}
		}
		
		System.out.println(sum);
	}

}
