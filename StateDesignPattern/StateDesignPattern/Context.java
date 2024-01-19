package StateDesignPattern;

public class Context {
    private State myState = new Red();
    public void forward(){
        myState.forward(this);
    }
    public void backward(){
        myState.backward(this);
    }

    public void setState(State state){
        myState = state;
    }

    public State getState(){
        return myState;
    }
}
