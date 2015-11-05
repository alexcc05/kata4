package kata4;

import java.io.IOException;
import java.util.ArrayList;



/**
 *
 * @author usuario
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        String name= "C:\\Users\\usuario\\Desktop\\emailsfilev1.txt";
        ArrayList<String> mailList= MailListReader.read(name);
        Histogram<String> histogram = MailHistogramBuilder.build(mailList);
        new HistogramDisplay(histogram).execute();
       
    }
 
    
}