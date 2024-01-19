package StateDesingPattern;

public class Green extends State {
    public void forward(Context c) {
        c.setState(new Red());
        System.out.println("We are moving forward to Red state now.");
    }
    @Override
    public void backward(Context c) {
        c.setState(new Yellow());
        System.out.println("We are moving backwards to Yellow state now.");
    }
}
