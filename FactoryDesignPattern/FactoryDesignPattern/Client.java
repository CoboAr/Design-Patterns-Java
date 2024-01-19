public class Client {
    public static void main(String[] args) {

        PizzaStore ps1 = new TorontoStore();
        ps1.orderPizza();
        PizzaStore ps2 = new ManitobaStore();
        ps2.orderPizza();

    }

}
