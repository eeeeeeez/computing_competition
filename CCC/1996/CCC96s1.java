import java.util.Arrays;
import java.util.Scanner;

public class CCC96s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		long n = sc.nextInt();
		long input = 0;
		long sum = 1;
		String output = "";
		
		
		if (n == 1) {
			input = sc.nextLong();
			for (int j = 2; j <= input/2; j++) {
				if (input % j == 0) {
					sum += j;
				}
			}
			if (sum == input) {
				output += (input + " is a perfect number." + "\n");
			}else if (sum < input) {
				output += (input + " is a deficient number." + "\n");
			}else if (sum > input){
				output += (input + " is an abundant number." + "\n");
			}
			sum = 1;
		}else {
			for (int i = 0; i<n; i++) {
				input = sc.nextLong();
				for (int j = 2; j <= input/2; j++) {
					if (input % j == 0) {
						sum += j;
//						System.out.println(j);
					}
				}
//				System.out.println(sum);
				if (sum == input) {
					output += (input + " is a perfect number." + "\n");
				}else if (sum < input) {
					output += (input + " is a deficient number." + "\n");
				}else if (sum > input){
					output += (input + " is an abundant number." + "\n");
				}	
				sum = 1;	
			
			}
			
		}
		System.out.println(output);
		
		
	}
	
	
	}

