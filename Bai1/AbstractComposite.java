package DesignPatern.Bai1;

import java.util.Collections;
import java.util.List;

public abstract class AbstractComposite implements Composite {
    /**yaya.*/
    @Override
    public boolean isGroup() {
        return false;
    }

    /**yaya.*/
    @Override
    public boolean isMarried() {
        return false;
    }

    /**yaya.*/
    @Override
    public void addChild(Composite child) {
        throw new UnsupportedOperationException("Operation not supported for this type");
    }

    /**yaya.*/
    @Override
    public List<Person> getChildren() {
        return Collections.emptyList();
    }
}
