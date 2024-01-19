public class ManitobaStore extends PizzaStore{
    @Override
    public Pizza createPizza() {
        return new ManitobaPizza();
    }
}
