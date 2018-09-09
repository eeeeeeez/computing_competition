import java.util.Scanner;

public class CCC08j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		char[] playlist = {'A','B','C','D','E'};
		int a = sc.nextInt();
		int b = sc.nextInt();

//		int[] input = new int[10];
		
//		System.out.print(a);
//		if (a==4) {
//			System.out.println(count);
//		}

		while (a!=4) {
			 for (int i=0;i<b;i++) {
				 if (a == 1) {
					 char temp;
					 temp = playlist[0];
					 for (int x = 0;x<4;x++) {
						 playlist[x] = playlist[x+1];
					 }
					 playlist[4] = temp;
					 
				 } else if (a == 2) {
					 char temp = playlist[4];
					 for (int x = 4;x>0;x--) {
						 playlist[x] = playlist[x-1];
					 }
					 playlist[0] = temp;
				 }else if (a == 3) {
					 char temp = playlist[0];
					 playlist[0] = playlist[1];
					 playlist[1] = temp;
				 }
				 
				
			 }
			 
			 a = sc.nextInt();
			 b = sc.nextInt();
		}
		
		for (int i=0;i<5;i++) {
			System.out.print(playlist[i] + " ");
		}
		
		
		
//		while (a!=4) {
//			count++;
//			
//		}
//		
//		if (a==4) {
//			System.out.println(count);
//		}
		
	}

}
 