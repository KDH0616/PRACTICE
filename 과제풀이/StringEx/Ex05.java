import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		String s1, s2, s3;
		
		while(true) {
			System.out.print("ù��° �ڸ� �Է�(3�ڸ�) : ");
			s1= scan.next();
			
			int i;
			for(i=0; i<s1.length(); i++) {
				char ch= s1.charAt(i);
				if( ch<'0' || ch>'9') break;				
			}
			
			if(i==3) break;			
			else System.out.println("[�߸� �Է��ϼ̽��ϴ�. 3�ڸ��� ���ڸ� �Է°����մϴ�.");
		}
		
		while(true) {
			System.out.print("�ι�° �ڸ� �Է�(3~4�ڸ�) : ");
			s2= scan.next();
			int i;
			for(i=0; i<s2.length(); i++) {
				char ch= s2.charAt(i);
				if( ch<'0' || ch>'9') break;				
			}
			
			if(i==3 || i==4) break;
			else System.out.println("[�߸� �Է��ϼ̽��ϴ�. 3~4�ڸ��� ���ڸ� �Է°����մϴ�.");
		}
		
		while(true) {
			System.out.print("����° �ڸ� �Է�(4�ڸ�) : ");
			s3= scan.next();
			int i;
			for(i=0; i<s3.length(); i++) {
				char ch= s3.charAt(i);
				if( ch<'0' || ch>'9') break;				
			}
			
			if(i==4) break;
			else System.out.println("[�߸� �Է��ϼ̽��ϴ�. 4�ڸ��� ���ڸ� �Է°����մϴ�.");
		}
		
		String s= s1+"-"+s2+"-"+s3;
		System.out.println("�Էµ� ��ȭ��ȣ�� ["+ s + "]�Դϴ�.");

	}

}
