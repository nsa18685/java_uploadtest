package euni.start.test.from_deock;
public class ExampleDan2 {

   public static int[] dan() {
        int[] numbers = { 1,2,3,4,5,6,7,8,9 };
        return numbers;
    }

    public static void main(String[] args) {
       int[] numbers =  dan();
       for(int i=numbers.length;i<10;i++){
          for(int j=1;j<10;j++)
          System.out.println(numbers[4]*j);
       }//�迭�� ������ 1, #����# 1�� 0�Է½� ���
}}