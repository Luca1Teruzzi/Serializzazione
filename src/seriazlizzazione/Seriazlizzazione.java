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
        CreaStudenti cs=new CreaStudenti();
        Thread t=new Thread(cs);
        t.start();
//        Studente[] a=new Studente[3];
//        a[0]=new Studente("Luca", "Cognome",10);
//        a[1]=new Studente("A", "B",12);
//        a[2]=new Studente("AB", "CD",13);
//        try { 
//            FileOutputStream o=new FileOutputStream("test.ser");
//            ObjectOutputStream os=new ObjectOutputStream(o);
////            os.writeObject(9);
////            os.writeObject("Ciao");
////            os.writeObject((float)1.345);
////            os.writeObject(true);
////            os.writeObject('a');
////            os.flush();
////            os.close()
//            os.writeObject(a);
//            os.flush();
//            os.close();
//            
//            FileInputStream i=new FileInputStream("test.ser");
//            ObjectInputStream is =new ObjectInputStream(i);
//            Studente [] v1=(Studente[]) is.readObject();
//            
//            for(Studente s: v1){
//                System.out.println(s.toString());
//            }
//            is.close();
//        } catch (FileNotFoundException ex) {
//            System.err.println("Impossibile trovare il file");
//        } catch (IOException ex) {
//            System.err.println("Hai rotto java");
//        } 
//        catch (ClassNotFoundException ex) {
//            Logger.getLogger(Seriazlizzazione.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
  
        
    }

}
