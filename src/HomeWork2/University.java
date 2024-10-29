package HomeWork2;

import java.time.LocalDate;

public class University extends EducationCenter{
    public University(String name, String locatedCountry, LocalDate localDate, int foundationYear) {
        super(name, locatedCountry, localDate, foundationYear);
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
