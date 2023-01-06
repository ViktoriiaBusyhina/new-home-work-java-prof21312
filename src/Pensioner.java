public class Pensioner extends Person{
    double pension;

    double x = (age-50)*pension;

    @Override
    public void die() {
        System.out.println("Этот пенсионер умер, он заработал:" + x );
    }
}