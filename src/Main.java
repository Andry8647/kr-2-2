

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import Task.*;

public class Main {

    private static final TaskService taskService = new TaskService();
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("Д.ММ.ГГГГ");
    private static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("ЧЧ.ММ");


//    Task task = new Task();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 0 ;
        while (menu!=3) {
            System.out.println("Выберите пункт меню: ");
            printMenu();
            menu = scanner.nextInt();

            switch (menu) {
                case 0:
                    addTask();


            }

        }

    }

    public static void printMenu(){
        System.out.println(" 0 - Занести задачу");
        System.out.println(" 1 - Удалить задачу");
        System.out.println(" 2 - Список задач");
        System.out.println(" 3 - Выход");

    }
    public static void addTask(){
        Scanner scanner = new Scanner(System.in);
        String title = readTitle("Введите Заголовок задачи: " , scanner);
        String description = readDescription("Введите описание задачи: " , scanner);
        LocalDateTime localDateTime = readDateTime(scanner);
        Type type = readType("Выберите тип задачи: " , scanner);




        System.out.println("Выберите периодичность Задачи: ");
            for (TaskTypeDay taskTypeDay : TaskTypeDay.values()){
            System.out.println(taskTypeDay);
        }
        TaskTypeDay typeTask = TaskTypeDay.valueOf(scanner.next().toUpperCase());
        System.out.println("Ваш выбор " + typeTask);
        System.out.println("Введите Описание задачи: ");
        String description = scanner.next();
        System.out.println("Описание задачи " + description);
        System.out.println("Введите Год ");
        int year = scanner.nextInt();
        System.out.println("Введите номер Месяца ");
        int month = scanner.nextInt();
        System.out.println("Введите номер Дня ");
        int day = scanner.nextInt();
        System.out.println("Введите час ");
        int house = scanner.nextInt();
        System.out.println("Введите минуты ");
        int min = scanner.nextInt();
        LocalDateTime localDateTime = LocalDateTime.of( year,month,day,house,min);
        System.out.println("Время занесения " + localDateTime);
        taskService.add(typeTask,type,title,description,localDateTime);



//        var typeTaskTypeDay = ReceptionTask.addTaskReception("Ваш выбор").toUpperCase();
//        var putTypeTaskTypeDay = TaskTypeDay.valueOf(typeTaskTypeDay);
//        taskService.add(putTypeTaskTypeDay);


    }

    private static LocalDateTime readDateTime(Scanner scanner) {
        LocalDate localDate = readDate(scanner);
        LocalTime localTime = readTime(scanner);
        return localDate.atTime(localTime);

    }

    private static LocalTime readTime(Scanner scanner) {

    }

    private static LocalDate readDate(Scanner scanner) {

    }


    public static String readDescription(String message, Scanner scanner){
        while (true) {
            System.out.println(message);
            String readDescription = scanner.next();
            if (readDescription == null || readDescription.isBlank()) {
                System.out.println("Вы велли пустое значение!");
            } else {
                return readDescription;
            }
        }
    }

    public static Type readType(String message, Scanner scanner){
        while (true) {
            System.out.println(message);
            for (Type type : Type.values()){
                System.out.println(type);
            }
            String readType = scanner.next().toUpperCase();
            if (readType == null || readType.isBlank()) {
                System.out.println("Вы велли пустое значение!");
            } else {
                return Type.valueOf(readType);
            }
        }
    }

    public static String readTitle(String message, Scanner scanner){
        while (true) {
            System.out.println(message);
            String readTitle = scanner.next();
            if (readTitle == null || readTitle.isBlank()) {
                System.out.println("Вы велли пустое значение!");
            } else {
                return readTitle;
            }
        }
    }
    public void writeTask(){

    }
}