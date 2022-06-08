package edu.escuelaing.arsw;

public class lineCounter {
    private long lNumeroLineas = 0;

    public void count(String scadena) {
        lNumeroLineas++;
    }

    public long getNumLineas() {
        return lNumeroLineas;
    }

    public boolean commentLine(String scadena){
        boolean comment = false;
        if (scadena.contains("/*") || scadena.contains("/**") || scadena.contains("*/") || scadena.contains("//")) {
            comment = true;
        }
        return comment;
    }
}
