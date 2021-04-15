/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriazlizzazione;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teruzzi.luca
 */
public class Seriazlizzazione {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Studente a=new Studente("Luca", "Teruzzi", 30);
        try { 
//            FileOutputStream o=new FileOutputStream("test.ser");
//            ObjectOutputStream os=new ObjectOutputStream(o);
//            os.writeObject(9);
//            os.writeObject("Ciao");
//            os.writeObject(1.345);
//            os.writeObject(true);
//            os.writeObject('a');
//            os.flush();
//            os.close();
            FileInputStream i=new FileInputStream("test.ser");
            ObjectInputStream is =new ObjectInputStream(i);
            Integer v1=(Integer) is.readObject();
            System.out.println("v1:"+v1);
            String v2=(String) is.readObject();
            System.out.println("v2:"+v2);
            Double v3=(Double) is.readObject();
            System.out.println("v3:"+v3);
            
        } catch (FileNotFoundException ex) {
            System.err.println("Impossibile trovare il file");
        } catch (IOException ex) {
            System.err.println("Hai rotto java");
        } 
        catch (ClassNotFoundException ex) {
            Logger.getLogger(Seriazlizzazione.class.getName()).log(Level.SEVERE, null, ex);
        } 
        
    }

}
