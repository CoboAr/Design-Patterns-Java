package AdapterDesignPattern;

public class Document {
    String name;
    public Document(String name){
        this.name = name;
    }
    public Boolean isValid(){
        System.out.println("Is valid to copy.");
        return true;
    }
    public String getName(){
        return name;
    }
}
