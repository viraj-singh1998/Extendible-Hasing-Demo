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

public class DirectoryField {
    int[] df = new int[4];
    Bucket b;   //Points to bucket.
    
    DirectoryField(int a,int b,int c,int d)
    {
        df[0] = a;          //LSB
        df[1] = b;
        df[2] = c;
        df[3] = d;
    }
    
}
