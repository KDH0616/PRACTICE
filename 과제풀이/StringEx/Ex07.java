import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		String s;
		while(true){
			System.out.print("패스워드 입력 : ");
			s= scan.next();
			
			int engCnt=0; //영문자 개수
			int numCnt=0; //숫자 개수
			int spCnt=0;  //특수문자 개수
			
			for(int i=0; i<s.length(); i++) {
				char ch= s.charAt(i);
				
				if( ch>='0' && ch<='9') numCnt++;
				else if( ch>='A' && ch<='Z') engCnt++;
				else if( ch>='a' && ch<='z') engCnt++;
				else spCnt++;				
			}
			
			
			if(s.length()<8) {
				System.out.println("최소한 8자 이상이어야 함");
				continue;
			}
			
			//규칙 1.영문자, 숫자, 특수문자 혼용하여 8자 이상검사			
			if( !(engCnt!=0 && numCnt!=0 && spCnt!=0 && s.length()>=8)) continue;
			
			
			
			//규칙 2.영문자, 숫자만 사용시  10자리 검사
			if(spCnt==0 && (engCnt+numCnt)<10  ) {
				System.out.println("영문자, 숫자만 사용시  최소 10자리 이상이어야 함");
				continue;
			}					
			
			
			//규칙 3.영문자 또는 숫자 또는 특수문자 단독 사용 불가
			boolean isOnly= false;
			if(engCnt+numCnt==0) isOnly= true;
			if(engCnt+spCnt==0) isOnly= true;
			if(numCnt+spCnt==0) isOnly= true;
			
			if(isOnly) {
				System.out.println("영문자 또는 숫자 또는 특수문자 단독 사용 불가");
				continue;
			}
			
			//위의 모든 상황에 걸리지 않으면 정상 패스워드
			break;
		}
		
		System.out.println("패스워드가 올바르게 만들어 졌습니다.");		 		

	}

}
