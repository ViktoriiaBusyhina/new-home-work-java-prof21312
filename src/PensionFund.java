public class PensionFund {
    private static final double COEFFICIENT = 0.02;
    private static final int MIDDLE_SALARY = 1500;

    private String name;
    private boolean isState;

    private final String date;

    public PensionFund(String name, boolean isState, String date) {
        this.name = name;
        this.isState = isState;
        this.date = date;
    }

    public double calculatePension ( int year, int minSalary, int maxSalary) {
        if (isState) {
            double middleSalary = MiddleUtils.middleTwoNumbers(minSalary, maxSalary);
            return minSalary * year * COEFFICIENT;
        }
        else {
            double middleSalary = MiddleUtils.middleThreeNumbers(minSalary, maxSalary, MIDDLE_SALARY );
            return middleSalary * year * MIDDLE_SALARY;
        }


    }}
