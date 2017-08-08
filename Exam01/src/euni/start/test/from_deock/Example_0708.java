package euni.start.test.from_deock;
public class Example_0708 {
	
	public static void main(String[] args) {
		String alpabets[]= {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"," "};
		
		int k=0;
		
			for(int i=0; i<alpabets.length/3;i++){
			
				for(int j=0;j<3;j++){
					String alpabet=alpabets[k];
					k+=1;
					
					System.out.print(alpabet+" ");
				}System.out.println();
						
			}	
			
		
	}

}
