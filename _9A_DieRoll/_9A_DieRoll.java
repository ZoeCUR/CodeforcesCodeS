import java.util.Scanner;


public class _9A_DieRoll {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int Y = s.nextInt();
		int W = s.nextInt();
		int theMax = Math.max(Y, W);
		int numOfWin = 6-theMax+1;
		if(numOfWin == 0){
			System.out.println("0/1");
			return;
		}
		if(numOfWin == 6){
			System.out.println("1/1");
			return;
		}
		if(numOfWin%2==0){
			System.out.println(numOfWin/2+"/3");
			return;
		}
		if(numOfWin%3==0){
			System.out.println(numOfWin/3+"/2");
			return;
		}
		System.out.println(numOfWin+"/6");
	}

}
