/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication41;

/**
 *
 * @author a_kor
 */
public class Symbol {
  	
    public String Keystr;
    public Symbol(String Keystr) {
      	Keystr = Keystr;
    }

    public String getKeystr() { //retrieve key
       	return Keystr;
    }
    public void addKeystr(String Keystr1) { //add key address
      	Keystr = Keystr1;
    }

	
}


