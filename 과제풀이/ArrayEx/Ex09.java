package kitesoft;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		//3������ ���� 2���� �迭��ü ����
		//�� ���� ȣ�Ǽ��� ���� ����
		int[][] arr=new int[3][];
		
		int studentNum=0;//��ü �л���
		
		//2���� �迭 arr�� ����(lenth : 3)��ŭ �ݺ�
		for(int i=0; i<arr.length; i++){
			//���� �ش� ���� �ο��� �Է�
			System.out.print("["+(i+1)+"��] �ο��� �Է� : ");			
			int num= s.nextInt();
			//�Էµ� �ο���(num)��ŭ�� 1���� �迭 ��ü ����
			//������ 1���� �迭��ü�� 2���� �迭��ü�� 3���� ���������� ���ʷ� ����
			arr[i]= new int[num];
			
			//õü �л����� �л��� ����
			studentNum+=num;
			
			//�Էµ� �л� ��(num) ��ŭ ���� �Է�
			for(int k=0; k<num; k++){
				System.out.print( "["+(i+1)+"�� "+(k+1)+"��] : ");
				arr[i][k]= s.nextInt();
			}
			
			System.out.println();			
		}
		
		//��� �Է��� �������Ƿ� �迭 �� ���
		System.out.println("---Java Programming ����ǥ----");
		
		int total=0; //õü ��տ�		
		double max=0; //�ֿ���� ������
		int maxBan=1; //�ֿ���� ��ȣ(�⺻ 1��)
		for(int i=0; i<arr.length; i++){//3�� �ݺ�
			
			System.out.print("["+(i+1)+"��]"); //�������
			
			int sum=0; //��� ����� ���� �հ贩���� ����
			for(int k=0; k<arr[i].length; k++){//�� ���� �л��� ��ŭ �ݺ�
				System.out.print( arr[i][k]+" ");
				sum+=arr[i][k]; //(i+1)�� �л� ���� ����
				total+=arr[i][k]; //��ü ��տ� ���� ����
			}
			
			//��� : ����/�л���
			double aver= (double)sum/(double)arr[i].length;
			System.out.println("[��� : "+ aver+"]");
						
			//�� ����� ����
			if(aver>max){
				max=aver;
				maxBan=(i+1);
			}
		}
		
		System.out.println("-----------------------------");
		
		//��ü ��� : ��ü �л� ����/��ü �л���
		float total_aver= (float)total/studentNum;
		
		// %.2f => �Ҽ��� ������ 2�ڸ����� �Ǽ����� ����ض�.(�ݿø���)
		System.out.printf("��ü��� : %.2f \n", total_aver);
		
		System.out.println("�� �����["+maxBan+"]");		

	}

}
