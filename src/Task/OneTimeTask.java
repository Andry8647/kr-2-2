package Task;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class OneTimeTask extends Task {


    public OneTimeTask(String title, Type type, String description, LocalDateTime dateTime) {
        super(title, type, description,dateTime);
    }

    @Override
    public boolean appearsIn(LocalDate localDate) {
        return localDate.equals(getDateTime().toLocalDate());
    }
}
