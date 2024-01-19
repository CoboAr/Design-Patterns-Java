public abstract class Abstraction {
    private Implementation imp;
    private String name;
    private int id;
    private String [] arr;
    public Abstraction(Implementation imp,String name, int id){
        this.imp = imp;
        this.name = name;
        this.id = id;
        this.arr = arr;
    }
    public Abstraction(Implementation imp, String[] arr){
        this.imp = imp;
        this. arr=arr;
    }
    public String getName(){
        return name;
    }
    public int getId(){
        return id;
    }
    public void print (){
        imp.encryption(this);
    }

    public String[] getArr(){
        return arr;
    }

    public void setEncryption(Implementation imp){
        this.imp=imp;
    }

}

