import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan= new Scanner(System.in);
		
		String s;
		while(true){
			System.out.print("�����ּ� �Է�(@����) : ");
			s= scan.next();			
			if(s.contains("@")) break;
			else System.out.println("[�߸� �Է��ϼ̽��ϴ�. @���� ���ϼ����ּұ��� ��� �Է��ϼž� �մϴ�.]");
		}
		
		String[] arr= s.split("@");
		System.out.println("�Էµ� �����ּҸ� : " + arr[0]);
		System.out.println("���ϼ��� �̸� : " + arr[1]);
		 		

	}

}
