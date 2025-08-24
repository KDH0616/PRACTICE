import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		String s;
		while(true){
			System.out.print("메일주소 입력(@포함) : ");
			s= scan.next();			
			if(s.contains("@")) break;
			else System.out.println("[잘못 입력하셨습니다. @포함 메일서버주소까지 모두 입력하셔야 합니다.]");
		}
		
		String[] arr= s.split("@");
		System.out.println("입력된 메일주소명 : " + arr[0]);
		System.out.println("메일서버 이름 : " + arr[1]);
		 		

	}

}
