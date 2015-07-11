import java.util.Scanner;


public class _7A_KalevitchAndChess {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] chess = new String[8];
		int[] r = new int[8];
		int[] c = new int[8];
		int i,j;
		int num = 0;
		
		for(i = 0;i < 8;i++)
			chess[i] = s.next();
		
		for(i = 0;i < 8;i++){
			for(j = 0;j < 8;j++){
				if(chess[i].charAt(j)=='W'){
					if(c[j]==0)c[j]=1;
					if(r[i]==0)r[i]=1;
				}
			}
		}
		for(i = 0;i < 8;i++){
			if(c[i]==0)num++;
			if(r[i]==0)num++;
		}
		if(num==16)num=8;
		System.out.print(num);
	}

}
