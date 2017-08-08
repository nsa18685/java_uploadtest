package euni.start.test.from_deock;

public class Example2_2 {

	public static void main(String[] args) {
		int x[][]=new int[5][];
		for (int i=0;i<x.length;i++){
			x[i]=new int[i+1];
			for(int j=0;j<x[i].length;j++){
				x[i][j]=j+1;
		
			System.out.print(x[i][j]+"");
			}System.out.println();
		}
	}

}
