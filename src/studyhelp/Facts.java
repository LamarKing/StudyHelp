/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyhelp;
import javax.swing.*;
/**
 *
 * @author The Rivers Family
 */
public class Facts {
    String keyPhrase;
    String fact;
    
    public void setPhrase(){
        keyPhrase = JOptionPane.showInputDialog("Whats the word you'd like to study?");
        
    }
    
    public void setDef(){
        fact = JOptionPane.showInputDialog("Whats the definition?");
        
    }
    
    public String getInfo(){
        
        return fact + "\n " + keyPhrase;
    }
    
    public String getKey(){
        
        return keyPhrase;
    }
    
    public String getAns(){
        
        return fact;
    }
    
}
