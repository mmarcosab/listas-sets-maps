package datas;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class TestandoDatas {

    public static void main(String[] args) {
        LocalDate hoje = LocalDate.now();
//        System.out.println(hoje);
        LocalDate worldCupDate = LocalDate.of(2018, Month.JUNE, 5);
        int anos = worldCupDate.getYear() - hoje.getYear();
//        System.out.println(anos + " years");


        Period periodo = Period.between(hoje, worldCupDate);
//        System.out.println(periodo);


//        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        System.out.println(hoje.format(dateTimeFormatter));


        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        LocalDateTime now = LocalDateTime.now();
//        System.out.println(now.format(dateTimeFormatter));


        LocalTime horariojogo = LocalTime.of(16, 30);
        System.out.println(horariojogo);

    }

}
