package StateDesingPattern;

public class Yellow extends State {
    @Override
    public void forward(Context c) {
        c.setState(new Green());
        System.out.println("We are moving forward to Green state now.");
    }
    @Override
    public void backward(Context c) {
        c.setState(new Red());
        System.out.println("We are moving backwards to Red state now.");
    }
}
