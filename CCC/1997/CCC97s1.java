import java.util.Scanner;

public class CCC97s1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		while (n-- != 0) {
			int subject = sc.nextInt();
			int verb = sc.nextInt();
			int object = sc.nextInt();
			
			String[] sub = new String[subject];
			String[] ver = new String[verb];
			String[] obj = new String[object];
			
			sc.nextLine();
			
			for (int i = 0; i<subject; i++) {
				sub[i] = sc.nextLine();
			}
			
			for (int i = 0; i<verb; i++) {
				ver[i] = sc.nextLine();
			}
		
			for (int i = 0; i<object; i++) {
				obj[i] = sc.nextLine();
			}
			
			for (int i = 0; i<subject; i++) {
				for (int j = 0; j<verb; j++) {
					for (int k = 0; k<object; k++ ) {
//						System.out.print(sub[i] + " " + ver[j] + " " + obj[k] + "\n");
						System.out.printf("%s %s %s. \n", sub[i], ver[j], obj[k]);
					}
				}
			}
		}
	}

}
