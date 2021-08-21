package study.localDate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class localDateMain {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        LocalDateTime localDateTime = LocalDateTime.of(2020,4,25,11,20, 38);

        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일은 좋네!!");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("HH:mm:ss 이다!!");

        System.out.println("result = " + localDate.format(dateTimeFormatter1));
        System.out.println("result = " + localDateTime.format(dateTimeFormatter2));

    }

}
