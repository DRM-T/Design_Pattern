package DesignPatern.Bai1;

public class Couple {
    private final Person husband;
    private final Person wife;

    public Couple(Person husband, Person wife) {
        this.husband = husband;
        this.wife = wife;
    }

    public Person getHusband() {
        return husband;
    }

    public Person getWife() {
        return wife;
    }

    @Override
    public String toString() {
        return String.format("%s - %s", husband.getName(), wife.getName());
    }
}