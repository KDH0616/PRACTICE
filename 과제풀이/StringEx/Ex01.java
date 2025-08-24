import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		String s= scan.next();
		for(int i=0; i<s.length(); i++) {
			char ch= s.charAt(i);
			System.out.println( (char)(ch+1) ); 
		}
		

	}

}
