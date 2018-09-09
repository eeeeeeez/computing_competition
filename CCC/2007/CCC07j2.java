import java.util.Scanner;

public class CCC07j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		Scanner sc = new Scanner(System.in);
		
		String[] shortForm = {"CU", ":-)",":-(",";-)",":-P","(~.~)","TA","CCC","CUZ","TY","YW","TTYL"};
		String[] translation = {"see you","I'm happy","I'm unhappy","wink","stick out my tongue", 
				"sleepy","totally awesome","Canadian Computing Competition","because","thank you",
				"you're welcome","talk to you later"};
		String input = "";
		String result = "";
		Boolean inList = false;
		while (!input.equals("TTYL")) {
			input = sc.nextLine();
			inList = false;
			for (int i = 0;i<shortForm.length;i++) {
				if (input.equals(shortForm[i])) {
					inList = true;
					result += translation[i] + '\n' ;
					break;
				}
				
			}
			if (!inList) {
				result += input + '\n';
			}
			
		}
		
		System.out.println(result);
	}

}
