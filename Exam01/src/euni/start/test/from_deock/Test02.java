package euni.start.test.from_deock;

public class Test02 {

	public static void main(String[] args) {
		
		int sum = 0;//�� ���� for�� �ȿ� ���� ��� ��� �ʱ�ȭ��!
		
		for(int i=1; i<=10000;i=i+2){
			
			sum += i;
			
			if(sum>=10000){
			
				System.out.print(i-2);
				break;
			
			}
			
		}
		
	}
		

}
	

