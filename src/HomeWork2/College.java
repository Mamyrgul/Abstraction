package HomeWork2;

import java.time.LocalDate;

public class College extends EducationCenter{
    public College(String name, String locatedCountry, LocalDate localDate, int foundationYear) {
        super(name, locatedCountry, localDate, foundationYear);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
