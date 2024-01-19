package ObserverDesignPattern;

public class ObserverPattern {
    public static void main(String[] args) {
        ItemsBought a = new ItemsBought ();
        a.attach( new DollarView() );
        a.attach( new PercentView() );
        a.buyItem("book", 2.00);
        System.out.println("-----------------------------");
        a.buyItem("cup", 3.00);
        System.out.println("-----------------------------");
        a.buyItem("bottle" , 5.00);
        System.out.println("-----------------------------");
    }
}