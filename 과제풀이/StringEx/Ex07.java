import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		String s;
		while(true){
			System.out.print("�н����� �Է� : ");
			s= scan.next();
			
			int engCnt=0; //������ ����
			int numCnt=0; //���� ����
			int spCnt=0;  //Ư������ ����
			
			for(int i=0; i<s.length(); i++) {
				char ch= s.charAt(i);
				
				if( ch>='0' && ch<='9') numCnt++;
				else if( ch>='A' && ch<='Z') engCnt++;
				else if( ch>='a' && ch<='z') engCnt++;
				else spCnt++;				
			}
			
			
			if(s.length()<8) {
				System.out.println("�ּ��� 8�� �̻��̾�� ��");
				continue;
			}
			
			//��Ģ 1.������, ����, Ư������ ȥ���Ͽ� 8�� �̻�˻�			
			if( !(engCnt!=0 && numCnt!=0 && spCnt!=0 && s.length()>=8)) continue;
			
			
			
			//��Ģ 2.������, ���ڸ� ����  10�ڸ� �˻�
			if(spCnt==0 && (engCnt+numCnt)<10  ) {
				System.out.println("������, ���ڸ� ����  �ּ� 10�ڸ� �̻��̾�� ��");
				continue;
			}					
			
			
			//��Ģ 3.������ �Ǵ� ���� �Ǵ� Ư������ �ܵ� ��� �Ұ�
			boolean isOnly= false;
			if(engCnt+numCnt==0) isOnly= true;
			if(engCnt+spCnt==0) isOnly= true;
			if(numCnt+spCnt==0) isOnly= true;
			
			if(isOnly) {
				System.out.println("������ �Ǵ� ���� �Ǵ� Ư������ �ܵ� ��� �Ұ�");
				continue;
			}
			
			//���� ��� ��Ȳ�� �ɸ��� ������ ���� �н�����
			break;
		}
		
		System.out.println("�н����尡 �ùٸ��� ����� �����ϴ�.");		 		

	}

}
