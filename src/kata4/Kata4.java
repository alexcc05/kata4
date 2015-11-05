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
        String from ="C:\\Users\\usuario\\Downloads\\jfreechart-1.0.19.zip";
        String to="C:\\Users\\usuario\\Downloads\\jfreechart-1.0.19(1).zip";
        
        BufferedInputStream  input=new BufferedInputStream(new FileInputStream(new File(from)));
        BufferedOutputStream  output=new BufferedOutputStream(new FileOutputStream(new File(to)));
        byte[] buffer = new byte[1024];
        Date date = new Date();
        while(true){
            int read = input.read(buffer);
            if(read<0){
                break;
            }else{
                output.write(buffer);
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
