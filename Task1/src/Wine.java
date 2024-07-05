import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.logging.SimpleFormatter;

public class Wine {
    private String nameWine;
    private String markWine;
    private String countryWine;
    private LocalDate dateBottlingWine;
    private String descriptionWine;

    public Wine(String nameWine, String markWine, String countryWine, String dateBottlingWine, String descriptionWine) {
        this.nameWine = nameWine;
        this.markWine = markWine;
        this.countryWine = countryWine;
        this.dateBottlingWine = LocalDate.parse(dateBottlingWine,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        this.descriptionWine = descriptionWine;
    }

    public void wineAgingCalculation(){
        System.out.println("Выдержка вина составляет " + Period.between(dateBottlingWine, LocalDate.now()).getYears() + " лет");
    }

    public String getNameWine() {
        return nameWine;
    }

    public void setNameWine(String nameWine) {
        this.nameWine = nameWine;
    }

    public String getMarkWine() {
        return markWine;
    }

    public void setMarkWine(String markWine) {
        this.markWine = markWine;
    }

    public String getCountryWine() {
        return countryWine;
    }

    public void setCountryWine(String countryWine) {
        this.countryWine = countryWine;
    }

    public LocalDate getDateBottlingWine() {
        return dateBottlingWine;
    }

    public void setDateBottlingWine(String dateBottlingWine) {
        this.dateBottlingWine = LocalDate.parse(dateBottlingWine,DateTimeFormatter.ofPattern("dd-MM-yyyy"));
    }

    public String getDescriptionWine() {
        return descriptionWine;
    }

    public void setDescriptionWine(String descriptionWine) {
        this.descriptionWine = descriptionWine;
    }
}
