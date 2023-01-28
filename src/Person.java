import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public abstract class Person {
   private String name;
   private int age;
    private int growth;
    private int weight;

    private Person mom;

    private Person dad;

    private Person[] children;

    private Sex sex;

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    private List <String> kids;


    public void setKids(List<String> kids) {
        this.kids = kids;
    }

    public List<String> getKids() {
        return kids;
    }

    public Person(String name, int age, int growth, int weight) {
        this.name = name;
        this.age = age;
        this.growth = growth;
        this.weight = weight;
    }
    public Person(){
    }

    public void getInfo() {
        System.out.println(name + growth + weight + age);
    }

    public void goToWork() {
        System.out.println("Я иду на работу");
    }

    public void die() {
        System.out.println("Непонятно что произошло, но кто-то умер");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGrowth() {
        return growth;
    }
    public void setGrowth(int growth) {
        this.growth = growth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (age != person.age) return false;
        if (growth!= person.growth) return false;
        if (Double.compare(person.weight, weight) != 0) return false;
        return Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        result = 31 * result + growth;
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", years=" + age +
                ", height=" + growth +
                ", weight=" + weight +
                '}';
    }


}
