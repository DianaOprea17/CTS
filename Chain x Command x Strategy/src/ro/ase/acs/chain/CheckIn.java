package ro.ase.acs.chain;

public class CheckIn extends AirportHandler{

    private static final int MAXIMUM_WEIGHT = 20;
    private float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public boolean isWeight()
    {
        return MAXIMUM_WEIGHT>=weight;
    }

    @Override
    public void verify() throws Exception {
        if(isWeight()){
            System.out.println("Checked in");
            if(nextHandler!= null)
            {
                nextHandler.verify();
            }
        }
        else{
            System.out.println("Baggage too heavy");
        }
    }
}
