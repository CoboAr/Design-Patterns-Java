package StateDesignPattern;

public class Red extends State{

    @Override
    public void forward(Context c) {
        c.setState(new Yellow());
        System.out.println("We are moving forward to Yellow state now.");

    }
    @Override
    public void backward(Context c) {
        c.setState(new Green());
        System.out.println("We are moving backwards to Green state now.");
    }
}
