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
import java.io.File;
//import java.io.InputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileNotFoundException;

// Release (Final) Version - Reader from a file input (character array) stream.
class Reader implements IReader {
    private final static int EOF = -1;
    private File    file;
    private FileInputStream inputStream;
    public Reader(File file) {
        try {
            inputStream = new FileInputStream(file);
        } catch(FileNotFoundException e) {
            System.out.println("File not found");
        }
    }
    @Override  public int getEof() { return EOF; }
    @Override public int read(){ 
        int k1 = 0 ; 
        return k1;
       };
    public String ReadChar() throws IOException {
       
            int k = 0 ; 
            char chr1;
            while ( k != -1)  {
                chr1 = (char) k;// can add other statements if need 
                    // Add statements & return what need
                k = inputStream.read();
            }
            String str1 = "testing....temporary ";//should be removed later while covering next tasks for scanning, just for testing now
            return str1;//need to return string based on what need
    }
}

interface IReader {
    int getEof();
    int read();
}
