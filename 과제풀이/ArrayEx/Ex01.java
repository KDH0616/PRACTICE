package kitesoft;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner s= new Scanner(System.in);
		
		//���̰� 5�� int�� �迭��ü ����
		int[] arr= new int[5];
		
		int sum=0; //����
		int max, min; //�ִ밪, �ּҰ�
		
		//�迭�� ù��° ��ҿ� ���� �Է¹ް�
		//�̰��� �ִ밪,�ּҰ� ������ ����
		//ó�� �Էµ� ���̹Ƿ� �񱳴���� ���⿡ �ּҰ��̸鼭 �ִ밪
		System.out.print("input : ");
		arr[0]= s.nextInt();
		max= min = arr[0];
		
		//�迭�� 1�� �ε������� ������ ���� �Է¹ް�
		//�ִ밪�� �ּҰ� ������ ���ϸ鼭 �� ��ü
		for(int i=1; i<arr.length ; i++){
			System.out.print("input : ");
			arr[i]= s.nextInt();
			sum+= arr[i];
			if(arr[i]>max) max=arr[i]; //���� �Էµ� ���� max������ ����� ������ ũ�� ���簪���� max�� ����
			if(arr[i]<min) min=arr[i]; //���� �Էµ� ���� min������ ����� ������ ������ ���簪���� min�� ����
		}
		
		System.out.println("max : "+max);
		System.out.println("min : "+min);
		System.out.println("sum : "+sum);		

	}

}
