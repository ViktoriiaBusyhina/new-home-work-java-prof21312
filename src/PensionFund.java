import java.util.Objects;

public class PensionFund {
    private static final double COEFFICIENT = 0.02;
    private static final int MIDDLE_SALARY = 1500;

    private String name;
    private Fund isState;

    private final String date;

    public PensionFund(String name, Fund isState, String date) {
        this.name = name;
        this.isState = isState;
        this.date = date;
    }

    public double calculatePension(int year, double minSalary, double maxSalary) {
        switch (isState) {
            case STATE:
                double middleSalary = MiddleUtils.middlenumbers(minSalary, maxSalary);
                break;
            case NON_STATE:
                double middleSalary = MiddleUtils.middlenumbers(minSalary, maxSalary, MIDDLE_SALARY);
                break;
           case SCAMMERS -> middleSalary = 0;
           break;
        }
        return minSalary * year * COEFFICIENT;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PensionFund that = (PensionFund) o;
        return Objects.equals(name, that.name) && isState == that.isState && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, isState, date);
    }

    @Override
    public String toString() {
        return "PensionFund{" +
                "name='" + name + '\'' +
                ", isState=" + isState +
                ", date='" + date + '\'' +
                '}';
    }

    public Fund getIsState() {
        return isState;
    }
}

