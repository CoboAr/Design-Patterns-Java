package ObserverDesignPattern;

public class DollarView extends Observer {
    @Override
    public void update_(Subject s) {
        System.out.println("Current Dollar view: ");
        if (s instanceof ItemsBought) {
            ItemsBought ib = (ItemsBought) s;
            for (int i = 0; i < ib.getNumberOfItems(); i++) {
                Item item1 = ib.getItemAt(i);
                System.out.println(item1.getName() + " : " + item1.getPrice());
            }
        }
    }
}
