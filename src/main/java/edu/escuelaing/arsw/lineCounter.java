package edu.escuelaing.arsw;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class lineCounter {

    private long lNumeroLineas = 0;

    public void readFile(String extension, FileReader file) throws IOException {
        String sCadena = null;
        BufferedReader bf = new BufferedReader(file);
        while ((sCadena = bf.readLine()) != null) {
            if (extension.equals("phy")) {
                count(sCadena);
            }
            if (extension.equals("loc") && (!commentLine(sCadena))) {
                count(sCadena);
            }
        }
    }

    public void count(String scadena) {
        lNumeroLineas++;
    }

    public long getNumLineas() {
        return lNumeroLineas;
    }

    public boolean commentLine(String scadena){
        boolean comment = false;
        if (scadena.contains("/*") || scadena.contains("/**") || scadena.contains("*/") || scadena.contains("//") || scadena.isBlank()) {
            comment = true;
        }
        return comment;
    }
}