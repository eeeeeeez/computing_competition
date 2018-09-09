import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine().toLowerCase();
		int countA = 0;
		int countE = 0;
		int countI = 0;
		int countO = 0;
		int countU = 0;;
		for (int i=0; i<name.length();i++) {
			if (name.charAt(i) == 'a') {
				countA+=1;
			}else if(name.charAt(i) == 'e') {
				countE+=1;
			}else if (name.charAt(i) == 'i') {
				countI+=1;
			}else if (name.charAt(i) == 'o') {
				countO+=1;
			}else if (name.charAt(i) == 'u') {
				countU+=1;
			}
		}
		
		if ((countA > countE) && (countA > countI)&&(countA > countO)&&(countA > countU)) {
			System.out.println("Advance to next round");
		}else {
			System.out.println("Does not advance to next round");
		}
	}

}
