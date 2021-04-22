/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seriazlizzazione;

import java.io.Serializable;

/**
 *
 * @author teruzzi.luca
 */
public class Studente implements Serializable{
    private String nome;
    private String cognome;
    private int nReg;

    public Studente(String nome, String cognome, int nReg) {
        this.nome = nome;
        this.cognome = cognome;
        this.nReg = nReg;
        
    }
    public String toString(){
        return "Studente: "+nReg+" Nome: "+nome+" Cognome: "+cognome; 
    }
    
    
    
}
