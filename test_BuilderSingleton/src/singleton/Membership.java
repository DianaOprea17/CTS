package singleton;

public class Membership implements AbstractMembership{

    private static Membership instance = null;
    private boolean active;
    private Membership(){}

    public static synchronized Membership getInstance(){
        if(instance == null){
            instance = new Membership();
        }
        return instance;
    }
    @Override
    public void activate() {
        active = true;
        System.out.println("Membership active");
    }

    @Override
    public void deactivate() {
        active = false;
        System.out.println("Membership deactivate");
    }
}
