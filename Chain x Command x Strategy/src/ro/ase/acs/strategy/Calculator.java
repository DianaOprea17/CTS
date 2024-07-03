package ro.ase.acs.strategy;

import java.util.List;

public class Calculator {

    private Operation operation;

    public void setOperation(Operation operation) {
        this.operation = operation;
    }

    public double compute(Integer... values){
        if(this.operation != null){
            List<Integer> val = List.of(values);
            return this.operation.doOperation(val);
        }
        else{
            throw new RuntimeException();
        }
    }
}
