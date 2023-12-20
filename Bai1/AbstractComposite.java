package DesignPatern.Bai1;

import java.util.Collections;
import java.util.List;

/**yaya.*/
public abstract class AbstractComposite implements Composite {
    @Override
    public boolean isGroup() {
        return false;
    }

    @Override
    public boolean isMarried() {
        return false;
    }

    @Override
    public void addChild(Composite child) {
        throw new UnsupportedOperationException("Operation not supported for this type");
    }

    @Override
    public List<Person> getChildren() {
        return Collections.emptyList();
    }
}
