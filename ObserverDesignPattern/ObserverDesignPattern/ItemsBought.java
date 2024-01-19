package ObserverDesignPattern;

import java.util.ArrayList;

public class ItemsBought extends Subject {
    private ArrayList<Item> items = new ArrayList<Item>();

    public void buyItem(String s, double p){
        items.add(new Item(s,p));
        notify_();
    }

    public Item getItemAt(int i){return items.get(i);}
    public int getNumberOfItems(){return items.size();}
}
