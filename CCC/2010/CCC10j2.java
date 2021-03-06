import java.util.Scanner;

public class CCC10j2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		
		//Sample 
		//a = 4, b = 2, c = 5, d = 3, s = 12
		//dsp1 = a-b = delta steps per cycle
		//dsp2 = c-d = delta steps per cycle
		
		//dsp1 = 4 - 2 = 2
		//dsp2 = 5 - 3 = 2
		//total steps person 1 = 4 + 2 = 6
		//total steps person 2 = 5 + 3 = 8
		
		//Person 1:
		//cycleNet = 12/tsp1 = 12 / 6 = 2 * dsp1 = 4
		//remainder = 12 % tsp1 = 0
		//if remainder < a, then remainder + cycleNet = 4
		//else remainder > a, then cycleNet - remainder + 2a
		
		//Person 2:
		//cycleNet = 12/tsp2 = 12 / 8 = 1 * dsp2 = 2 
		//remainder = 12 % tsp2 = 4
		//if remainder < c, then remainder + cycleNet = 6
		//else remainder > c, then cycleNet + c - (remainder - c)
		//(cycleNet + c - remainder + c)
		//(cycleNet - remainder + 2c)
		//therefore person 2 wins
		
		//6>4
		//person 2 wins
		
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int s = sc.nextInt();
		int dsp1 = a-b;
		int dsp2 = c-d;
		int tsp1 = a+b;
		int tsp2 = c+d;
		int cycleNet1 = (s/tsp1) * dsp1;
		int cycleNet2 = (s/tsp2) * dsp2;
		int nickyRemainder = s%tsp1;
		int bryonRemainder = s%tsp2;
		int nickyFinal = 0;
		int bryonFinal = 0;
		
		if (nickyRemainder < a) {
			cycleNet1 += nickyRemainder;
		} else if (nickyRemainder > a) {
			cycleNet2 += 2 * a - nickyRemainder;
		}

		if (bryonRemainder < c) {
			cycleNet2 += bryonRemainder;
		}else if (bryonRemainder > c) {
			cycleNet2 += 2 * c - bryonRemainder;
		}
		
		if (cycleNet1 > cycleNet2) {
			System.out.println("Nikky");
		}else if (cycleNet2 > cycleNet1) {
			System.out.println("Byron");
		}else {
			System.out.println("Tied");
		}
	}
}
