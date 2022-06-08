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
        String extension = args[0];
        lineCounter lc = new lineCounter();
        lc.readFile(extension, fr);
        System.out.println("El archivo tiene: " + lc.getNumLineas() + " lineas");
    }
}
