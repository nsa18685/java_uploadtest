package euni.start.test.from_deock;

public class ExampleDan_1 {
	
	public static void dan(int a){
		for(int i=a ; i<=a;i++){
			for(int j=1; j<=9;j++){
		
	            System.out.printf("%d*%d=%d\t", i,j, i*j);	         
	            System.out.println();
			}
		}
		
   }
	   
	   public static void main(String[] args) {
	      dan(19);
	   }
}
