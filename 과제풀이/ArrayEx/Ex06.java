package kitesoft;

import java.util.Random;

public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Random���� ����� �ִ� ��ü ����
		Random rnd= new Random();
		
		int[] arr= new int[25];		
		
		for(int i=0; i<25; i++){
			arr[i]= rnd.nextInt(25)+1; //1~25
			
			//i�� �ε����� �迭��ҿ� ���Ե� ��������
			//�迭�� 0�� ���� ���� i��° ������ ������ ���� ���� �ִ��� üũ
			for(int j=0; j<i ;j++){
				
				if(arr[i]==arr[j]){//���� i��°�� ���� ���� ������ �������� �ִٸ�...
					i--; //�ݺ��� �ϸ� i������ �ڵ����� �����ǹǷ� ���� i��°�� �ٽ� �ϵ��� �̸� i�� ����
					break;
				}
			}			
		}
		
		int i=0;
		while(i<25){			
			//arr[i]���� �������� ����ϵ� �ڸ����� ������� ������ 4ĭ�� ������ �����ϵ��� ������� ����
			System.out.printf("%4d", arr[i]);
			
			i++;//i�� ����
			//5������ �ٹٲ�(5�� �������)
			if(i%5==0) System.out.println();			
		}

	}

}
