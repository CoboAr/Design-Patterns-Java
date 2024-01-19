package StateDesingPattern;

public abstract class State {
    public abstract void forward(Context c);
    public abstract void backward(Context c);

}
