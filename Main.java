import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Main{

public static void main(String[] args) throws FileNotFoundException, IOException {
        Filewalker max = new Filewalker();
		//System.out.println(max.walk("/Users/max", args[0]));
	String doc =  max.walk("/Users/max", args[0]);
	  // System.out.println( doc);
	   PrintWriter writer = new PrintWriter("temp.txt");
	writer.println(doc);
	writer.close();
    }
}
