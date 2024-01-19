package CompositeDesign;

/**
 *
 * @author acobo
 */
public class FoodItem extends FoodComponent{
    private String name;
    private double price;

    public FoodItem(String name, double price){
        this.name = name;
        this.price = price;
    }

    @Override
    //getprice method Overriden
    public double getPrice(){
        return this.price;
    }

    @Override
    //print method Overriden
    public void print(int level){
        for (int i =0; i<level; i++){
            System.out.print("\t");
        }
        System.out.println("FoodItem: " + name + ", " + price);
    }
}

