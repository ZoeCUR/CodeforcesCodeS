import java.util.HashMap;
import java.util.Scanner;

public class _2A_Winner {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		String[] name  = new String[n];
		int[] score = new int[n];
		HashMap map1 = new HashMap();
		HashMap map2 = new HashMap();
		
		for(int i = 0;i < n;i++){
			name[i] = s.next();
			score[i] = s.nextInt();
			if(map1.get(name[i])==null)
				map1.put(name[i], score[i]);
			else
				map1.put(name[i], (int)map1.get(name[i])+score[i]);
			
		}
		int max = 0;
		for(int i = 0;i < n;i++){
			if((int)map1.get(name[i])>max){
				max = (int)map1.get(name[i]);
			}
		}
		
		for(int i = 0;i < n;i++){
			if(map2.get(name[i])==null)
				map2.put(name[i], score[i]);
			else
				map2.put(name[i], (int)map2.get(name[i])+score[i]);
			if((int)map2.get(name[i])>=max&&(int)map1.get(name[i])==max){
				System.out.println(name[i]);
				break;
			}
		}
	}

}
