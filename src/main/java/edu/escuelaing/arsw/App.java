package edu.escuelaing.arsw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        FileReader fr = new FileReader(args[1]);
        BufferedReader bf = new BufferedReader(fr);
        String extension = args[0];
        lineCounter lc = new lineCounter();
        String sCadena = null;
        
        while ((sCadena = bf.readLine()) != null) {
            if (extension.equals("phy")) {
                lc.count(sCadena);
            }
            if (extension.equals("loc") && (!lc.commentLine(sCadena))){
                lc.count(sCadena);
            }
        }
        System.out.println("El archivo tiene: " + lc.getNumLineas() + " lineas");
    }
}
