package euni.start.test.from_deock;

public class ExempleDan2_1 {
	   public static int[] dan() {
	        int[] numbers = { 1,2,3,4,5,6,7,8,9 };
	        return numbers;
	    }

	    public static void main(String[] args) {
	    	 int[] numbers =  dan();
	          for(int e: numbers) {
	        	  for(int j=1;j<10;j++){
	    	System.out.println(e*j);
	          }
	    
	    }}
}
