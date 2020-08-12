/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extendible_hasing;

/**
 *
 * @author viraj
 */
import java.io.*; 
import java.util.*;
import javax.swing.JOptionPane;


public class Extendible_Hasing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       int GD = 1,LD = 1;   // initial global and local depths
       ArrayList<DirectoryField> directory = new ArrayList<DirectoryField>(16);  
       directory.add(new DirectoryField(0,0,0,0));
       directory.add(new DirectoryField(0,0,0,1));
       directory.add(new DirectoryField(0,0,1,0));
       directory.add(new DirectoryField(0,0,1,1));
       directory.add(new DirectoryField(0,1,0,0));
       directory.add(new DirectoryField(0,1,0,1));
       directory.add(new DirectoryField(0,1,1,0));
       directory.add(new DirectoryField(0,1,1,1));
       directory.add(new DirectoryField(1,0,0,0));
       directory.add(new DirectoryField(1,0,0,1));
       directory.add(new DirectoryField(1,0,1,0));
       directory.add(new DirectoryField(1,0,1,1));
       directory.add(new DirectoryField(1,1,0,0));
       directory.add(new DirectoryField(1,1,0,1));
       directory.add(new DirectoryField(1,1,1,0));
       directory.add(new DirectoryField(1,1,1,1));
       
       
       double partition = Math.pow(2,4-GD);
       Bucket buck = new Bucket(LD);  //initialised to remove error in line 50.
       for(int i=0;i<16;i++)
       {
           if(i%partition==0)
           {
                buck = new Bucket(LD);
           }
           directory.get(i).b = buck;
       }
       
       new Driver(directory,GD).setVisible(true);
        // TODO code application logic here
    }
    
}
