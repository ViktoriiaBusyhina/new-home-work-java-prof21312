public class Pensioner extends Person{
   private double pension;
    public Pensioner(String name, int years, int height, int weight, double pension) {
        super(name, years, height, weight);
        this.pension = pension;
    }

    @Override
    public void die() {
        System.out.println("и, что-то произошло....");
        super.die();
        System.out.println("Ага, вот так случилось!");
    }

    public void abc(int a) {
        System.out.println(a);
    }
    public double getPension() {
        return pension;
    }

    public void setPension(double pension) {
        this.pension = pension;
    }
}