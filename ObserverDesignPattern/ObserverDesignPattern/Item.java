package ObserverDesignPattern;

public class Item {
    private String name;
    private double price;
    public Item(String s, double p){
        name =s;
        price =p;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
}
