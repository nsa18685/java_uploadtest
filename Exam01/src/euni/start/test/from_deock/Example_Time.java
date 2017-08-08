package euni.start.test.from_deock;

import java.util.Scanner;

public class Example_Time {

	public static void main(String[] args) {
		System.out.println("초를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		
			int sec=i%60;
			int min=i/60%60;
			int hour=i/60/60%24;
			int day=i/60/60/24;
	
				System.out.printf("%d일 %d시 %d분 %d초",day,hour,min,sec);
	}

}
