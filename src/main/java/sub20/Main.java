package sub20;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd h/mm");
        String now = dateTimeFormatter.format(LocalDateTime.now());
        System.out.println("현재시간: " + now);
    }
}