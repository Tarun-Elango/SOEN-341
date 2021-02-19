/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

/**
 *
 * @author aida_kor
 */
import java.io.File;
import java.util.*;
//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class CrossAssembler {

 public static void main(String[] args)  throws FileNotFoundException, IOException { 

    SymbolTable symtb1 = new SymbolTable();
    
    AddMnemonics(symtb1);
    System.out.print("address  is :  " + symtb1.getSymbol("xor"));//verifying added Mnemonics
    System.out.println(" ");
    File InFile = new File("C:\\Users\\Test.asm");
    Reader reader1 = new Reader(InFile);
   /* File InFile = new File("c:\\users\\asmprog.txt ");
    try (FileInputStream instr = new FileInputStream(InFile)) {//moved this to a separate reader class as requested
           int k = 0 ; 
            char chr1;
            while ( k != -1)  {
                    chr1 = (char) k;// can add other statements if need 
                    k = instr.read();
            }  
        }     */   
        
    }
 private static void AddMnemonics(SymbolTable symtb1){
     
          
    symtb1.putm("halt", "00");
    symtb1.putm("pop","01");
    symtb1.putm("dup", "02");
    symtb1.putm("EXIT", "03");
    symtb1.putm("ret", "04");
    symtb1.putm("not", "0C");
    symtb1.putm("and", "0D");
    symtb1.putm("or", "0E");
    symtb1.putm("xor", "0F");
    symtb1.putm("neg", "10");
    symtb1.putm("inc", "11");
    symtb1.putm("dec", "12");
    symtb1.putm("add", "13");
    symtb1.putm("sub", "14");
    symtb1.putm("mul", "15");
    symtb1.putm("div", "16");
    symtb1.putm("rem", "17");
    symtb1.putm("shl", "18");
    symtb1.putm("shr", "19");
    symtb1.putm("teq", "1A");
    symtb1.putm("tne", "1B");
    symtb1.putm("tlt", "1C");
    symtb1.putm("tgt", "1D");
    symtb1.putm("tle", "1E");
    symtb1.putm("tge", "1F");
 }
}
