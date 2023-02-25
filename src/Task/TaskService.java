package Task;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class TaskService {


    private Map<Integer,Task> taskMap = new HashMap<>();
    private Collection<Task> removedTask = new HashSet<>();


    public void add(TaskTypeDay taskTypeDay, Type type, String title, String description, LocalDateTime dateTime){



        switch (taskTypeDay){
            case ONETIME:
                OneTimeTask oneTimeTask = new OneTimeTask(title,type,description,dateTime);
            case DAILY:
                DailyTask dailyTask = new DailyTask(title,type,description,dateTime);
            case WEEKLY:
                WeeklyTask weeklyTask = new WeeklyTask(title,type,description,dateTime);
            case MONTHLY:
                MonthlyTask monthlyTask = new MonthlyTask(title,type,description,dateTime);
            case YEARLY:
                YearlyTask yearlyTask = new YearlyTask(title,type,description,dateTime);
        }



//        var putTaskType = taskTypeDay.createTask();
//        putTaskType.askDate();

//        Scanner scanner = new Scanner(System.in);
//        var putTaskType = taskTypeDay.createTask();
//        taskMap.putIfAbsent(putTaskType.getId(),putTaskType);
//        System.out.println("Введите Заголовок Задачи ");
//        putTaskType.setTitle(scanner.next());
//        System.out.println("Введите Описание Задачи ");
//        putTaskType.setDescription(scanner.next());
//        System.out.println("Введите Тип Задачи ");
//        for (Type type : Type.values()){
//            System.out.println(type);
//        }





    }

}
