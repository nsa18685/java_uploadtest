package euni.start.test.from_lecture;

public class MainArgs {

	public static void main(String[] args) {
		int i =0, sum=0;
		int n=args.length;
		while(i<n&&n>0)
		{
			System.out.println("args["+i+"]:"+args[i]);
			sum +=Integer.parseInt(args[i]);
			i++;
		}
		if(n==0)
			System.out.println("�Ű������� �����ϴ�.");
		else
			System.out.println("\t�հ�:"+sum);
	}

}
