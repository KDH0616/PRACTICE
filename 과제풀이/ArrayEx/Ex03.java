package kitesoft;

import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		//1�ڸ�,10�ڸ�,20�ڸ�..90�ڸ������� ������ �����ϱ� ���� �迭����
		//0�� �ε����� 1�ڸ��� ����, 1�� �ε����� 10�ڸ��� ����...9���ε����� 90�ڸ��� ����
		int[] range= new int[10];
		
		for(int i=0; i<10; i++){
			System.out.print("1~100������ ���� �Է� : ");
			int n= s.nextInt(); //���� �Է�
			
			//n�� ���� ������ �Ǻ��ϱ� ���� �ݺ���////////
			for(int k=0; k<10; k++){
				//k�� 0,1,2..�ݺ��Ҷ� ���� 10,20,30..���� ������ �Ǻ� 
				if( n< ((k+1)*10) ){
					range[k]++; //�ش� ��°�� ī��Ʈ�� ����
					break; //���� �Ǻ��� ����
				}
			}///////////////////////////////////////			
		}
		System.out.println(Arrays.toString(range));
		//������ ��� �Ǻ��Ǿ��ٸ� �̸� *������ ǥ��
		for(int i=0; i<10; i++){
			
			System.out.print( (10*i+1)+" - "+((i+1)*10)+ " : " ); //����� ���
			//range[]��ü�� �� ��ҿ� ����� ������ �̿��Ͽ� *���� ǥ��
			for(int k=0; k<range[i]; k++){
				System.out.print("*");
			}
			
			//�ٹٲٱ�
			System.out.println();			
		}

	}

}
