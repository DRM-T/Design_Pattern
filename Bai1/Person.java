package DesignPatern.Bai1;

import java.util.ArrayList;
import java.util.List;

public class Person extends AbstractComposite {
    private String name;
    private Date birthDate;
    private Gender gender;
    private List<Person> children;

    /**yaya.*/
    public Person(String name, Date birthDate, Gender gender) {
        this.name = name;
        this.birthDate = birthDate;
        this.gender = gender;
        this.children = new ArrayList<>();
    }

    /**yaya.*/
    public String getName() {
        return name;
    }

    /**yaya.*/
    public void setName(String name) {
        this.name = name;
    }

    /**yaya.*/
    public Date getBirthDate() {
        return birthDate;
    }

    /**yaya.*/
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**yaya.*/
    public Gender getGender() {
        return gender;
    }

    /**yaya.*/
    public void setGender(Gender gender) {
        this.gender = gender;
    }

    /**yaya.*/
    public List<Person> getChildren() {
        return children;
    }

    /**yaya.*/
    public void addChild(Person child) {
        this.children.add(child);
    }

    /**yaya.*/
    @Override
    public void print() {
        System.out.println(this.name);
        for (Person child : this.children) {
            child.print();
        }
    }

    /**yaya.*/
    public List<Person> findUnmarriedPeople() {
        List<Person> unmarriedPeople = new ArrayList<>();
        for (Person person : this.children) {
            if (!person.isMarried()) {
                unmarriedPeople.add(person);
            }

            unmarriedPeople.addAll(person.findUnmarriedPeople());
        }

        return unmarriedPeople;
    }

    /**yaya.*/
    public List<Couple> findCouplesWithTwoChildren() {
        List<Couple> couplesWithTwoChildren = new ArrayList<>();
        for (Person person : this.children) {
            if (person.getChildren().size() == 2) {
                Couple couple1 = new Couple(person, person.getChildren().get(0));
                couplesWithTwoChildren.add(couple1);
                Couple couple2 = new Couple(person, person.getChildren().get(1));
                couplesWithTwoChildren.add(couple2);
            } else if (!person.isGroup()) {
                couplesWithTwoChildren.addAll(person.findCouplesWithTwoChildren());
            }
        }
        return couplesWithTwoChildren;
    }
}
