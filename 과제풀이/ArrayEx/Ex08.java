package kitesoft;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		System.out.print("String �迭���� �Է� : ");
		int num= s.nextInt();
		
		//�Էµ� ��(num) ������ String�� �迭��ü ����
		String[] arr= new String[num];
		
		for(int i=0; i<arr.length; i++){
			System.out.print("���ڿ� �Է� : ");
			arr[i]= s.next();
		}
		
		//foreach���� �̿��� �ݺ���
		for(String t: arr){
			System.out.println(t);
		}

	}

}
