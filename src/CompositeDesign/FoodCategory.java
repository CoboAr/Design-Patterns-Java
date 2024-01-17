package CompositeDesign;

import java.util.Vector;

/**
 *
 * @author acobo
 */
public class FoodCategory extends FoodComponent{

    private String name;
    private Vector<FoodComponent> components;

    public FoodCategory (String name){
        this.name = name;
        components = new Vector<FoodComponent>();
    }

    //add element
    public void add (FoodComponent c){
        components.addElement(c);
    }

    //remove element
    public void remove (FoodComponent c){
        components.removeElement(c);
    }

    @Override
    //getprice method Overriden
    public double getPrice(){
        double sum = 0;
        for (int i = 0; i<components.size(); i++){
            sum = sum + components.get(i).getPrice();
        }
        return sum;
    }

    @Override
    //print method Overriden
    public void print(int level){
        for (int i = 0; i < level;i++ ){
            System.out.print("\t");
        }
        System.out.print("FoodCategory (" + name + "," + getPrice() + ") contains:\n");
        for (int j = 0; j< components.size(); j++){
            components.get(j).print(level+1);
        }
    }

}

