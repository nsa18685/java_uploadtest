package euni.start.test.from_deock;

public class Exam_0727 {

	public static void main(String[] args) {
		int a[]={2,5,7,3,1};
		int b=0;
		
		for(int i=0;i<a.length;i++){
			for(int j=i+1; j<a.length;j++){
				if(a[i]>a[j]){
					b=a[i];
					a[i]=a[j];
					a[j]=b;					
				}
			}System.out.print(a[i]);
		}
		
	}

}
