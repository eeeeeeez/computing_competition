import java.util.Arrays;
import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] score = new int[N];
		
		int middle = 0;
		int middleAfter = 0;
		double median = 0;
		
		for (int i = 0;i<N;i++) {
			score[i] = sc.nextInt();
		}
		Arrays.sort(score);
		int[] sortedScore = score;
			
		if (N%2==0) {
			middle = (N-1)/2;
			middleAfter = N/2;
			median = ((sortedScore[middle]+sortedScore[middleAfter]));
			System.out.println("The median on the test is " + median/2 + ".");
			
			//System.out.println(sortedScore[n/2] + sortedScore[n/2-1] / 2)
		}else {
			middle = (N-1)/2;
			median = score[middle];
			System.out.println("The median on the test is " + median + ".");
		}
		
		
		
	
	}

}
