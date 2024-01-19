public class TorontoStore extends PizzaStore{
    @Override
    public Pizza createPizza() {
        return new TorontoPizza();
    }
}
