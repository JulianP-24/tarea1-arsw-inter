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

        long lNumeroLineas = 0;
        String sCadena;
        
        while ((sCadena = bf.readLine())!=null) {
            if(extension == "phy"){
                lNumeroLineas++;
            }
        }
        System.out.println("El archivo tiene: " + lNumeroLineas + " lineas");
    }
}
