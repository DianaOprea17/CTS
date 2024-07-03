package ro.ase.acs.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeCode implements Code {
    private List<Code> children = new ArrayList<>();

    public void add(Code component) {
        children.add(component);
    }

    @Override
    public boolean containsUnsafeCode() {
        for (Code child : children) {
            if (child.containsUnsafeCode()) {
                return true;
            }
        }
        return false;
    }
}
