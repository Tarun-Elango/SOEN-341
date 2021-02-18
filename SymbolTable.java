/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;
import java.util.*;
import java.util.Map.Entry;
/**
 *
 * @author aida_kor
 */
public class SymbolTable {
    
    public HashMap<String, Symbol> symbolTable;//value,key
    Symbol symbl1;
    public SymbolTable() {
        symbolTable = new HashMap<>();
  
        
    }
  //Put Method to add new pairs - in progress
   public boolean AddPair(String key1, Symbol sym1) {
        if (HasKey(key1)) {
            symbolTable.put(key1, sym1);
            return true;
        }
        return false;
    }
    

   public boolean HasKey(String key1) {
        return symbolTable.containsKey(key1);
    }


}
