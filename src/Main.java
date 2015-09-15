import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

/**
 * Created by eugeny on 15.09.2015.
 */
public class Main {
    public static void main(String[] args) {
        new Main().run();
    }

    private void run() {
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println(dateTime.getDayOfMonth());
        System.out.println(dateTime.getMonth());

        LocalDateTime independenceDay = LocalDateTime.of(2014,8,24,0,0,0);
        System.out.println(independenceDay.getDayOfMonth()+" "
                + independenceDay.getMonth().getDisplayName(TextStyle.FULL, Locale.getDefault()));
        LocalDateTime dateTime1 = independenceDay.plusWeeks(1).plusMonths(1);
        System.out.println(dateTime1);
    }
}
