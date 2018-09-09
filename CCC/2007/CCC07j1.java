import java.util.Scanner;

public class CCC07j1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Java1 Class4 Homework
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();

		if ((A >= B) && (A >= C)) {
			if (B > C) {
				System.out.println(B);
			} else if (C > B) {
				System.out.println(C);
			}
		} else if ((B > A) && (B > C)) {
			if (A > C) {
				System.out.println(A);
			} else if (C > A) {
				System.out.println(C);
			}
		} else if ((C > A) & (C > B)) {
			if (A > B) {
				System.out.println(A);
			} else if (B > A) {
				System.out.println(B);
			}
		} else if ((A <= B) && (A <= C)) {
			if (B < C) {
				System.out.println(B);
			} else if (C < B) {
				System.out.println(C);
			}
		} else if ((B <= A) && (B <= C)) {
			if (A < C) {
				System.out.println(A);
			} else if (C < A) {
				System.out.println(C);
			}
		} else if ((C <= A) && (C <= B)) {
			if (A < B) {
				System.out.println(A);
			} else if (B < A) {
				System.out.println(B);
			}
		} else if ((A >= B) || (A >= C) && (A <= B) || (A <= C)) {
			System.out.println(A);
		} else if ((B >= A) || (B >= C) && (B <= A) || (B <= C)) {
			System.out.println(B);
		} else if ((C >= A) || (C >= B) && (C <= A) || (C <= B)) {
			System.out.println(C);
		}
			
	
	} 

}
