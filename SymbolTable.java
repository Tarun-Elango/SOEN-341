/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

import java.util.*;
//import java.util.Map.Entry;
/**
 *
 * @author aida_kor
 */
public class SymbolTable {
    
    public HashMap<String, String> symbolTable;// key (mnemonic), value(opcode)
    OpCode addr1;
    public SymbolTable() {
        symbolTable = new HashMap<>();
  
        
    }
  //Put Method to add new pairs - in progress
   public boolean AddPair(String key1, String op1) {
        if (HasKey(key1)) {
            symbolTable.put(key1, op1);
            return true;
        }
        return false;
    }
   public  void putm(String key1, String op1) {
        
            symbolTable.put(key1, op1);
         
    }
    
   
   public boolean HasKey(String key1) {
        return symbolTable.containsKey(key1);
    }

   public String getSymbol(String mnem) {
      // System.out.println("address in method : " + symbolTable.get(mnem));
        return symbolTable.get(mnem);
    }

}
