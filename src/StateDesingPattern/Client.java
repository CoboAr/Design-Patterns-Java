package StateDesingPattern;

public class Client {
    public static void main(String[] args) {

        Context c1 = new Context();
        c1.forward();
        Context c2 = new Context();
        c2.backward();
        c1.setState(new Green());
        System.out.println(c1.getState());

    }
}