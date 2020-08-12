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

public class Bucket {
    
    int bfr = 4;
    int LD;      
    ArrayList<Integer> records = new ArrayList<Integer>(4);
    
    Bucket(int LD)
    {
        this.LD = LD;
    }
   public int add(int a)
   {
       if(records.size() == bfr)
       {
           System.out.println("Overflow!");
           JOptionPane.showMessageDialog(null,"Overflow! Splitting buckets.");
           return 1;
       }
       records.add(a);
       JOptionPane.showMessageDialog(null,"Record added : " + a);
       return 0;
   }
   
   public String contents()
   {
       if(records.size()==0)
           return "EMPTY BUCKET";
       String s = "";
       for(int i=0;i<records.size();i++)
       {
           s = s + records.get(i) + " ";
       }
       return s;
   }
}
