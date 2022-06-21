package sub18;

import java.io.FileOutputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int number = 10;
        int result;

        for (int i = 10; i >= 0; i--) {
            try {
                result = number / i;
                System.out.println(result);
            } catch (Exception e) {
                System.out.println("Exception발생: " + e.getMessage());
            } finally {
                System.out.println("항상 실행되는 finally 구문");
            }
        }

        try (FileOutputStream out = new FileOutputStream("test.txt")) {
            // test.txt file 에 Hello Sparta 를 출력
            out.write("Hello Sparta".getBytes());
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}