package DesignPatern.Bai1;

public class Couple {
    private final Person husband;
    private final Person wife;

    /**yaya.*/
    public Couple(Person husband, Person wife) {
        this.husband = husband;
        this.wife = wife;
    }

    /**yaya.*/
    public Person getHusband() {
        return husband;
    }

    /**yaya.*/
    public Person getWife() {
        return wife;
    }

    /**yaya.*/
    @Override
    public String toString() {
        return String.format("%s - %s", husband.getName(), wife.getName());
    }
}
