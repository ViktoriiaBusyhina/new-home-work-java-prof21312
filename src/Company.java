import java.util.Objects;

public class Company {
    private String company;

    public Company(String name) {
        this.company = name;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Company company = (Company) o;
        return Objects.equals(this.company, company.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(company);
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + company + '\'' +
                '}';
    }
}

