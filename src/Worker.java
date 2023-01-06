public class Worker extends Person {
    double minSalary;
    double maxSalary;

    @Override
    public void die() {
        System.out.println("Этот человек не дожил до пенсии");
    }}