package euni.start.test.from_deock;

public class Test01 {

			
			public static void main(String[] args){
			
		 	
		
		for(int i=1; i<10000/2; i= i+2){
			for(int j=1; j<10000/2; j=j+2){
			int output =i+j;
			int sum=0;
			sum+= output;
				if(sum == 10000)
				break;
				System.out.println(i+ "+" +j +"=" + sum);
			}}
			}		
		
	
}
