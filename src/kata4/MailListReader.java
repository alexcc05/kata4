/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class MailListReader {
    
    public static ArrayList<String> read(String nameFile) throws FileNotFoundException, IOException{
        ArrayList<String> mailList = new ArrayList<>();
        
        BufferedReader reader = new BufferedReader(new FileReader(new File(nameFile)));
        String mail;
        while((mail=reader.readLine())!=null){
            if(!mail.contains("@")){
                continue;
            }
                mailList.add(mail);
        }
        return mailList;
    }
    
}
