package org.opentutorials.javatutorials.io;
import java.util.Scanner;
//미지의 영역으로 남겨두자
public class ScannerDemo {
 
    public static void main(String[] args) { //String[] args는 관심사가 아니다
        Scanner sc = new Scanner(System.in); 
        //java.util 속 Scanner를 사용하겠다! 'System.in:사용자가 입력한 값'을 Scan하겠다!, sc에 대입!
        int i = sc.nextInt(); //실행을 멈추고 기다릴 것임! 입력값을 저장하고 있다가 enter치면 실행이 다시 시작되어 i에 대입!
        System.out.println(i*1000);
        sc.close();
    }
 
}