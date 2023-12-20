package DesignPatern.Bai1;

import java.util.List;
import java.util.Collections;

public interface Composite {
    void print();

    boolean isGroup();

    boolean isMarried();

    void addChild(Composite child);

    List<Person> getChildren();
}
