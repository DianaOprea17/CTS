package ro.ase.acs.strategy;

import java.util.List;

public class SumOperation implements Operation{

    @Override
    public double doOperation(List<Integer> values) {
        int sum = 0;
        for(int v : values){
            sum+=v;
        }
        return (sum);
    }
}
