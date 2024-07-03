package ro.ase.acs.strategy;

import java.util.List;

public class ProductOperation implements Operation{
    @Override
    public double doOperation(List<Integer> values) {
        int product = 1;
        for(int v: values){
            product*=v;
        }
        return (product);
    }
}
