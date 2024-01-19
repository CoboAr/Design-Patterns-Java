import java.util.ArrayList;

public class EncryptionOne extends Implementation{
    @Override
    public  void encryption(Abstraction ab) {
        if (ab instanceof UserProfile){
            String name = ab.getName();
            String reversed = "";
            char ch;
            for (int i=0;i<name.length();i++){
                ch = name.charAt(i);
                reversed= ch+reversed;
            }
            int id = ab.getId();
            id = (id*2)+1;
            System.out.println(reversed+" "+id);

        }



        if(ab instanceof Message){

            String [] temp = ab.getArr();
            ArrayList<String> reversed = new ArrayList<String>();

            char ch;

            for(int i=0; i<temp.length;i++){
                String reversed_string ="";
                String s1 = temp[i];
                for(int j =0; j<s1.length();j++){
                    ch = s1.charAt(j);
                    reversed_string= ch + reversed_string;
                }
                reversed.add(reversed_string);
            }
            for(String s: reversed ){
                System.out.print(s+" ");
            }




        }

    }
}
