package AdapterDesignPattern;

public class adaptDocuments implements Copyable {
    private Document d;
    public adaptDocuments(Document d){
        this.d=d;
    }

    @Override
    public boolean isCopyable() {

        return d.isValid();
    }
    public String getName(){
        return d.getName();
    }
}
