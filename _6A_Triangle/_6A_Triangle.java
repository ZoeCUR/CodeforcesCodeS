import java.util.Scanner;


public class _6A_Triangle {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] sticks = new int[4];
		int i;
		boolean flagSeg = false;
		for(i=0;i<4;i++)
			sticks[i] = s.nextInt();
		//0为triangle
		//1为segment
		//-1为impossible
		int result = test(sticks[0],sticks[1],sticks[2]);
		if(result==0){
			System.out.println("TRIANGLE");
			return;
		}else if(result==1)flagSeg=true;
		
		result = test(sticks[0],sticks[1],sticks[3]);
		if(result==0){
			System.out.println("TRIANGLE");
			return;
		}else if(result==1)flagSeg=true;
		
		result = test(sticks[0],sticks[2],sticks[3]);
		if(result==0){
			System.out.println("TRIANGLE");
			return;
		}else if(result==1)flagSeg=true;
		
		result = test(sticks[1],sticks[2],sticks[3]);
		if(result==0){
			System.out.println("TRIANGLE");
			return;
		}else if(result==1)flagSeg=true;
		
		if(flagSeg)System.out.println("SEGMENT");
		else System.out.println("IMPOSSIBLE");
	}
	public static int test(int a,int b,int c){
		if(a+b>c&&b+c>a&&a+c>b){
			return 0;
		}
		if(a+b==c||b+c==a||a+c==b){
			return 1;
		}else
			return -1;
	}

}
