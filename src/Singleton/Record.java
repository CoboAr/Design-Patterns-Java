package Singleton;

import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

/**
 *
 * @author acobo
 */
public class Record {

    // Name of the associated file
    private String filename;
    private static Record instance;
    private Record(String n) {

        filename = n;
    }
    public static Record getInstance (){
        if ( instance == null )
            instance = new Record("record.txt");
        return instance;
    }
    // Effects: Reads and prints the contents of the associated
    // file to the standard output.
    public void read() {
        try {
            // Write the code here

            FileReader file_read = new FileReader(filename);
            Scanner s = new Scanner (file_read);
            while (s.hasNextLine()){
                System.out.println(s.nextLine());
            }
            file_read.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Effects: Appends the specified message, msg, to the
    // associated file.
    public void write(String msg) {
        try {
            // Write the code here

            FileWriter file_write = new FileWriter(filename, true);
            file_write.write(msg);
            file_write.close();

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        // Fill the blank below that obtains the sole instance
        // of the Record class.
        // (You should not invoke the Record constructor here.)
        Record r = getInstance();
        // Do not modify the code below

        r.write("Hello-1\n");
        r.write("Hello-2\n");
        System.out.println("Currently the file record.txt " +
                "contains the following lines:");
        r.read();
    }

}
