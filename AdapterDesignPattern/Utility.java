package AdapterDesignPattern;

import java.util.ArrayList;

public class Utility {
    private ArrayList<Copyable> documents = new ArrayList<Copyable>();
    public ArrayList<Copyable> copy() {
        ArrayList<Copyable>copyTheseDocuments=new ArrayList<Copyable>();
        for (Copyable c : documents) {
            if(true==c.isCopyable()){
                copyTheseDocuments.add(c);
            }

        }
        return copyTheseDocuments;
    }

    public void addDocuments( Copyable c){
        documents.add(c);
    }

}
