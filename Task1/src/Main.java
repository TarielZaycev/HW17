import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        //todo создайте класс Wine. Протестируйте его работу в этом методе.
        Wine wine = new Wine("ddd","ddd","dddd", "05-07-2020","test");

        wine.wineAgingCalculation();

    }
}