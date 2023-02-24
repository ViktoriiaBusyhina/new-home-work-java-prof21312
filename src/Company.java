import java.util.Map;
import java.util.Objects;

public class Company {
    private String name;

    private Map<String, String> holidays;

    public Company(String name) {
        
        this.name = name;
    }

    public Map<String, String> getHolidays() {
        return holidays;
    }

    public void setHolidays(Map<String, String> holidays) {
        this.holidays = holidays;
    }

    public String getName() {

        
        return name;
    }

    public void setName(String company) {
        
        this.name = company;
    }


    public int compareTo(Company o) {
        return name.compareTo(o.name);


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(this.name, company.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                '}';
    }
}

