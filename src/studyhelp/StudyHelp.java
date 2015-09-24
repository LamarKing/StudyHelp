/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studyhelp;
import java.io.*;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author The Rivers Family
 */
public class StudyHelp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        boolean menu = true;
        factDB db = new factDB();
        ArrayList<String> scores = new ArrayList<>();
        
        while(menu == true){
        int choice = Integer.parseInt(JOptionPane.showInputDialog("Enter a number for your choice\n"
         + "1: creat a fact \n2: show facts\n3:Word up study\n4:Definition up study\n5:View old Scores\n6:Exit"));
        
            switch(choice){
                case 1://creat fact
                    Facts newFct = new Facts();
        
                    newFct.setPhrase();
                    newFct.setDef();
        
                    db.add(newFct);
                break;
                
                case 2://show study facts
                    for (int x =0;x < db.size();x++){
                        String outFct = db.get(x);
                        JOptionPane.showMessageDialog(null, outFct);
                    }
                break;
                    
                case 3://word up
                    int rite = 0;
                    int wrg = 0;
                    
                    for (int x =0;x < db.size();x++){
                        String outFct = db.getFct(x).getKey();
                        String ansr = JOptionPane.showInputDialog(outFct);
                        
                        if (ansr.equalsIgnoreCase(db.getFct(x).getAns())){
                            rite++;
                        }else{
                            wrg++;
                        }
                    }
                    String correct = " " + rite;
                    String wrong = " " + wrg;
                    String saveScr = "Corretct: " + correct + " .......... Wrong: " + wrong;
                    JOptionPane.showMessageDialog(null, "Corretct: " + correct + " .......... Wrong: " + wrong);
                    
                    scores.add(saveScr);
                    
                break;
                        
                case 4://definition up
                    rite = 0;
                    wrg = 0;
                    
                    for (int x =0;x < db.size();x++){
                        String outFct = db.getFct(x).getAns();
                        String ansr = JOptionPane.showInputDialog(outFct);
                        
                        if (ansr.equalsIgnoreCase(db.getFct(x).getKey())){
                            rite++;
                        }else{
                            wrg++;
                        }
                    }
                    correct = " " + rite;
                    wrong = " " + wrg;
                    saveScr = "Corretct: " + correct + " .......... Wrong: " + wrong;
                    JOptionPane.showMessageDialog(null, "Corretct: " + correct + " .......... Wrong: " + wrong + "\n");
                    
                    scores.add(saveScr);
                    
                break;
                    
                case 5://view saved scores
                    FileWriter writer = new FileWriter("output.txt");
                    
                     for (String temp : scores){
                       writer.write(temp);
                    }
                     writer.close();
                     
                     try (BufferedReader br = new BufferedReader(new FileReader("output.txt"))) {
                            String line = null;
                        while ((line = br.readLine()) != null) {
                        JOptionPane.showMessageDialog(null, line);
                    }
}
                     
                break;
                
                case 6://exit
                   menu = false;
                break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Enter a valid choice!");
                break;
                    
            }
        }
        
        
        
        
        
    }
    
}
