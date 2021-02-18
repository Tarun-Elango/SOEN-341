/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication41;

/**
 *
 * @author aida_kor
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CrossAssembler {

 public static void main(String[] args)  throws FileNotFoundException, IOException { 

    SymbolTable symtb1 = new SymbolTable();
   
    File InFile = new File("c:\\users\\asmprog.txt ");
    try (FileInputStream instr = new FileInputStream(InFile)) {
           int k = 0 ; 
            char chr1;
            while ( k != -1)  {
                    chr1 = (char) k;// can add other statements if need 
                    k = instr.read();
            }  
        }        
        
    }
}
