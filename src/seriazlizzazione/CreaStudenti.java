/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriazlizzazione;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author teruzzi.luca
 */
public class CreaStudenti implements Runnable {
    ArrayList<Studente> a=new ArrayList();
    String[]a1={"Luca", "Franco", "Marco", "Francesco", "Martino", "Federico", "Edoardo"};
    String[]a2={"Bianchi", "Rossi", "Viola", "Teruzzi", "Verdi"};
    @Override
    public void run() {
        while(true){
            int i= (int) (Math.random()*7);
            int i1= (int) (Math.random()*7);
            int i2= (int) (Math.random()*4);
            String cognome=a2[i2];
            String nome=a1[i1];
            
            Studente s=new Studente(nome,cognome,i);
            a.add(s);
            System.out.println(s.toString());
            
        }
    }
    
}
