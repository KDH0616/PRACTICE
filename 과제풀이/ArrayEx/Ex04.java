package kitesoft;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		int[] seat=new int[10];
		
		//�ϴ� �¼��Է��� ���ѹݺ� 
		while(true){
			System.out.print("�¼��� �����Ͻðڽ��ϱ�(1(Y) �Ǵ� 0(N)? ");
			int a= s.nextInt();
			if(a==0){//���� ����
				System.out.println("������ �����մϴ�.");
				break;//���� �ݺ��� ����
			}
			
			//0�� �ƴϸ� ���ᰡ �ȵǾ����Ƿ� �����۾�����(0�� �ƴϸ� ��� Yes�� �Ǵ��� ����)
			System.out.println("������ ���� ���´� ������ �����ϴ�.          ");
			System.out.println("---------------------------------------");
			System.out.println("�¼���ȣ : 1  2  3  4  5  6  7  8  9  10 ");
			System.out.println("---------------------------------------");
			System.out.print("������� : ");
			for(int t : seat)
				System.out.print( t +"  ");
			System.out.println();
			System.out.println();
			
			int n;//�¼� ��ȣ
			while(true){
				System.out.print("���° �¼��� �����Ͻðڽ��ϱ�? ");
				n= s.nextInt();
				
				//�¼��� ����ִٸ� �¼���ȣ �Է� ����.
				if(seat[n-1]==0) break;
				
				//break�� �ȵǾ��ٸ�. �̹� ����� �¼��̹Ƿ� �ٽ� �Է���� ��
				System.out.println("�˼��մϴ�. �̹� ����� �¼��Դϴ�. �ٸ� �¼��� ������ �ּ���.\n");				
			}
			
			//������� �Դٸ� ����ִ� �¼��� ������ ������.
			seat[n-1]=1; //�ش� �¼���ȣ�� �迭�ε����� 1�� ����
			System.out.println(n+"�� �¼� ����Ǿ����ϴ�. \n");
		}

	}

}
