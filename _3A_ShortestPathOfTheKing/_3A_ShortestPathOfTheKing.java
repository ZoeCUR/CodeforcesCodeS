import java.util.Scanner;


public class _3A_ShortestPathOfTheKing {
	public static void main(String[] args){
		Scanner  s = new Scanner(System.in);
		char[] source = s.next().toCharArray();
		char[] target  = s.next().toCharArray();
		int rDis = target[0] - source[0];
		int cDis = target[1] - source[1];
		int steps = (Math.abs(rDis)>Math.abs(cDis)?Math.abs(cDis):Math.abs(rDis))+Math.abs(Math.abs(rDis)-Math.abs(cDis));
		System.out.println(steps);
		
		if(rDis>=0&&cDis>=0){
			if(rDis>cDis){
				move("RU",cDis);
				move("R",rDis-cDis);
			}else{
				move("RU",rDis);
				move("U",cDis-rDis);
			}
		}else if(rDis>=0&&cDis<0){
			if(rDis>Math.abs(cDis)){
				move("RD",Math.abs(cDis));
				move("R",rDis-Math.abs(cDis));
			}else{
				move("RD",rDis);
				move("D",Math.abs(cDis)-rDis);
			}
		}else if(rDis<0&&cDis>=0){
			if(Math.abs(rDis)>cDis){
				move("LU",cDis);
				move("L",Math.abs(rDis)-cDis);
			}else{
				move("LU",Math.abs(rDis));
				move("U",cDis-Math.abs(rDis));
			}
		}else{
			if(rDis-cDis<0){
				move("LD",Math.abs(cDis));
				move("L",Math.abs(rDis-cDis));
			}else{
				move("LD",Math.abs(rDis));
				move("D",Math.abs(rDis-cDis));
			}
		}
		
	}
	public static void move(String direction,int steps){
		for(int i = 0;i < steps;i++)
			System.out.println(direction);
		
	}
}
