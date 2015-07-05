import java.util.Scanner;


public class _1A_TheatreSquare {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int m = s.nextInt();
		int a = s.nextInt();
		int number = (int) Math.ceil((double)n/a)*(int)Math.ceil((double)m/a);
		
		System.out.println(number);
		
	}

}
