package ObserverDesignPattern;

public class PercentView extends Observer{
    @Override
    public void update_(Subject s) {
        System.out.println("Current Percent view:");
        double listPrice = 0;
        if(s instanceof ItemsBought){
            ItemsBought ib = (ItemsBought) s;
            for (int i = 0; i < ib.getNumberOfItems(); i++) {
                Item item1 = ib.getItemAt(i);
                listPrice=listPrice+ item1.getPrice();
            }
            for(int i =0;i<ib.getNumberOfItems();i++){
                Item items = ib.getItemAt(i);
                System.out.println(items.getName() + " : " + (items.getPrice()/listPrice)*100+"%");
            }
        }
    }
}
