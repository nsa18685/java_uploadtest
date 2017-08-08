package euni.start.test.from_lecture;


class Calculator{
		int[] oprands;
	
	public Calculator(int[]oprands){
		this. oprands=oprands;
	}
	public void sum(){
		int total=0;
		for(int value: this.oprands){
			total+=value;
		}//for(타입 e:배열이름)구문!
		System.out.println(total);
	}
	
}	
public class For_each {
	public static void main(String[] args) {
		Calculator c1=new Calculator(new int[] {2,3,4,5});
		c1.sum();

		Calculator c2=new Calculator(new int[] {1,2,3,4,5,6,7,8,9});
		c2.sum();

	}

}
