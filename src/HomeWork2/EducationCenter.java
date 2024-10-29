package HomeWork2;

import java.time.LocalDate;

public abstract class EducationCenter {
    private String name;
    private String locatedCountry;
    private LocalDate localDate;
    private int foundationYear;

    public EducationCenter(String name, String locatedCountry, LocalDate localDate, int foundationYear) {
        this.name = name;
        this.locatedCountry = locatedCountry;
        this.localDate = localDate;
        this.foundationYear = foundationYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocatedCountry() {
        return locatedCountry;
    }

    public void setLocatedCountry(String locatedCountry) {
        this.locatedCountry = locatedCountry;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public int getFoundationYear() {
        return foundationYear;
    }

    public void setFoundationYear(int foundationYear) {
        this.foundationYear = foundationYear;
    }

    @Override
    public String toString() {
        return
                "\nName:" + name +
                "\nLocated country:" + locatedCountry +
                "\nLocal date:" + localDate +
                "\nFoundation year:" + foundationYear ;
    }
}
