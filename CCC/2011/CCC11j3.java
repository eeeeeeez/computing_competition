import java.util.Scanner;

public class CCC11j3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int a = sc.nextInt();
		int b = 0;
		int count = 0;
		
		while (t-a>=0) {
			b = t-a;
			t = a;
			a = b;
			count++;
		}
		
		System.out.println(count+2);
	}

}
