import java.util.ArrayList;

public class EncryptionTwo extends Implementation{
    @Override
    public void encryption(Abstraction ab) {
        if(ab instanceof UserProfile){
            String name = ab.getName();
            int id = ab.getId();

            name="2"+name+"2";
            id = (id*3)+2;
            System.out.println("\n"+name+" "+id);
        }

        ArrayList<String>temp = new ArrayList<>();
        if(ab instanceof Message){
            String [] strings = ab.getArr();
            for(int i=0;i<strings.length;i++){
                temp.add("2"+strings[i]+"2");
            }
            for(int j=0;j<temp.size();j++){
                System.out.print(temp.get(j)+" ");
            }
        }


    }
}