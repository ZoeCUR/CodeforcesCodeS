import java.util.Scanner;


public class _8A_TrainAndPeter {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String flags = s.next();
		String first = s.next();
		String second = s.next();
		char[] c1 = flags.toCharArray();
		char[] c2 = new char[flags.length()];
		for( int i = 0;i < flags.length();i++ ){
			c2[i]=c1[flags.length()-i-1];
		}
		String returnFlags = String.valueOf(c2);
		boolean fflag = false;
		boolean bflag = false;
		
		if(flags.indexOf(first)!=-1){
			String subStr = flags.substring(flags.indexOf(first)+first.length());
			if(subStr.indexOf(second)!=-1)
				fflag = true;
		}
		
		if(returnFlags.indexOf(first)!=-1){
			String subStr = returnFlags.substring(returnFlags.indexOf(first)+first.length());
			if(subStr.indexOf(second)!=-1)
				bflag = true;
		}
		
		if(fflag&&bflag)System.out.println("both");
		if(fflag&&!bflag)System.out.println("forward");
		if(!fflag&&bflag)System.out.println("backward");
		if(!fflag&&!bflag)System.out.println("fantasy");
			
		
	}
	
}
