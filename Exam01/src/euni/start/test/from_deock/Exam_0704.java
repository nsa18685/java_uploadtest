package euni.start.test.from_deock;

public class Exam_0704 {

	public static void main(String[] args) {
		int sum=0;
		
		for(int i=1; i<=10000;i++){		
			
			if(i%3!=0)
				sum+=i;//거른 다음에 더해야지! 더한 다음에 거르면 무슨 소용이냐!
			
				continue;
		
		}for(int k=3*5;k<=10000;k=k+3*5){
			sum+=k;
		
		}System.out.print(sum);
		
	}

}
