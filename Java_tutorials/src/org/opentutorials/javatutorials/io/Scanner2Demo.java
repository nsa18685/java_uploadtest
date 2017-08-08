package org.opentutorials.javatutorials.io;
import java.util.Scanner;

public class Scanner2Demo {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) { //반복문을 사용하여 연속적으로 값을 입력할 수 있게 됨.
            System.out.println(sc.nextInt()*1000); 
        }
        sc.close();
    }
 
}