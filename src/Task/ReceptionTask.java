package Task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ReceptionTask {
    public static final String DATE_FORMAT = "ДД.ММ.ГГГГ";
    public static final DateTimeFormatter DATE_FORMATTER  = DateTimeFormatter.ofPattern(DATE_FORMAT);
    public static final String DATE_TIME_FORMAT = "ДД.ММ.ГГГГ ЧЧ:ММ";
    public static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern(DATE_TIME_FORMAT);
    public static final Scanner scanner =new Scanner(System.in).useDelimiter("\\n");

    public static String addTaskReception(String message){
        System.out.println(message + ": ");
        return scanner.next();
    }

    public static LocalDate askDate(String message){
        System.out.println(message + DATE_FORMAT );
        var strDate = scanner.next();
        return LocalDate.parse(strDate,DATE_FORMATTER);
    }

}
