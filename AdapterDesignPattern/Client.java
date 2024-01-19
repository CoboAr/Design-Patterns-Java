package AdapterDesignPattern;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        Utility u = new Utility();
        adaptDocuments d1 = new adaptDocuments(new Document("a"));
        adaptDocuments d2 = new adaptDocuments(new Document("b"));


        u.addDocuments(d1);
        ArrayList<Copyable> aaa = u.copy();


        System.out.println(aaa.get(0).getName());
    }
}