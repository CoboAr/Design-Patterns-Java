public abstract class PizzaStore {
    public void orderPizza(){
        Pizza p = createPizza();
        p.orderPizza();
        System.out.println("Pizza ordered");
    }
    public abstract Pizza createPizza();

}
