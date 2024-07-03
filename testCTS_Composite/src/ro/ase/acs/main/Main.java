package ro.ase.acs.main;

import ro.ase.acs.composite.CompositeCode;
import ro.ase.acs.composite.SimpleCodeUnit;

public class Main {
    public static void main(String[] args) {
        CompositeCode root = new CompositeCode();
        SimpleCodeUnit function = new SimpleCodeUnit("void unsafeFunction() { strcpy(dest, src); }");
        CompositeCode classCode = new CompositeCode();
        classCode.add(function);

        root.add(classCode);
        System.out.println("Contains unsafe code: " + root.containsUnsafeCode());


    }
}