package kitesoft;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.print("�л��� ���� �Է��ϼ��� : ");
		int num= s.nextInt();
		
		//�Էµ� ��(num) ������ int�� �迭��ü ����
		int[] arr= new int[num];
		
		System.out.println();//���� ���
		
		int sum=0;		
		for(int i=0; i<arr.length; i++){
			System.out.print("�л� "+(i+1)+"�� ������ �Է��ϼ��� : ");
			arr[i]= s.nextInt();
			
			//�Էµ� ������ 0���� �۰ų� 100���� ũ�� �߸��Է����� �Ǵ�
			if(arr[i]<0 || arr[i]>100){
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��Ͻÿ�.");
				i--; //�ݺ����� �������� i���� �����ϹǷ� �̸� i���� 1���� ���� ��°�� �ٽ� �ϵ��� ��.
				continue; //�߸� �Էµ� ���̹Ƿ� �Ʒ��� sum������ ���� �ʵ��� ��.
			}
			
			sum+= arr[i]; //�Էµ� �������� ����
		}
		
		//��հ��� �Ҽ����� �������� ����ȯ
		System.out.println("���� ����� "+ (double)(sum/num) +" �Դϴ�.");
		
	}

}
