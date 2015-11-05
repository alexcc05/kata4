package kata4;

import java.io.*;
import java.util.Date;


/**
 *
 * @author usuario
 */
public class Kata4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path ="C:\\Users\\usuario\\Documents";
         File file = new File(path);
        String[] fileList= file.list();
        
        for(String fileList1 : fileList){
            //System.out.print(fileList1);
        }
        
        //print(file.listFiles(),"");
        String from ="C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum.jpg";
        String to="C:\\Users\\Public\\Pictures\\Sample Pictures\\Chrysanthemum(1).jpg";
        
        BufferedInputStream  input=new BufferedInputStream(new FileInputStream(new File(from)));
        BufferedOutputStream  output=new BufferedOutputStream(new FileOutputStream(new File(to)));
        Date date = new Date();
        while(true){
            int read = input.read();
            if(read<0){
                break;
            }else{
                output.write(read);
            }
           
        }
        System.out.print(new Date().getTime() - date.getTime() + "msg");
        input.close();
        output.flush();
        output.close();
    }

    private static void print(File[] listFiles, String ident) {
        if( listFiles==null){
            return;
        }
        for(File listFile : listFiles){
            System.out.println(ident +(listFile.isDirectory()? "+": " ")+ listFile.getName());
            if(listFile.isFile() || listFile.isHidden()) continue;
            print(listFile.listFiles(), ident + "  " );
        }
    }
    
}
