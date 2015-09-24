/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyhelp;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author The Rivers Family
 */
public class factDB {
     ArrayList<Facts> factList = new ArrayList<>();
     Facts fct = new Facts();
     public void add(Facts newFct){
         factList.add(newFct);
     }
     
     public int size(){
         return factList.size();
     }
     
     public String get(int x){
         fct = factList.get(x);
         
         return fct.getInfo();
     }
     
    public Facts getFct(int x){
        
        return factList.get(x);
    }
     
}
