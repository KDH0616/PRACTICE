package kitesoft;

public class Ex10 {
	
	public static void main(String[] args) {
		
		int[][] buf= new int[5][5];
		
		int y=0, x=0; //�ε��� ��ȣ
		int dy=1, dx=0; //y,x �ε����� ��ȭ��(ó���� �Ʒ�������)
		int limit_y=0, limit_x=0; 
		
		for(int n=1; n<=25; n++){
			buf[y][x]= n;			
			
			y+=dy; //y�� ����
			x+=dx; //x�� ����			
			
			if(dy>0 && y==4-limit_y){ //y���� �����ɶ�				
				dy=0;
				dx=1;
			}
			if(dx>0 && x==4-limit_x){ //x���� �����ɶ�				
				dy=-1;
				dx=0;
			}
			if(dy<0 && y==limit_y){ //y���� ���ҵɶ�				
				dy=0;
				dx=-1;
				limit_x++;
			}
			if(dx<0 && x==limit_x){ //x���� ���ҵɶ�				
				dy=1;
				dx=0;
				limit_y++;
			}
		}
		
		for(int i=0; i<5; i++){
			for(int j=0; j<5; j++){
				System.out.printf("%3d \t", buf[i][j]);
			}
			System.out.println();
		}		
	}

}
