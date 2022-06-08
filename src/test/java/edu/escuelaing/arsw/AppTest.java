package edu.escuelaing.arsw;


import java.io.FileReader;
import java.io.IOException;
import edu.escuelaing.arsw.lineCounter;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     * @throws IOException
     */
    public void firstTestFileByCasePhy() throws IOException
    {
        FileReader fr = new FileReader("src/test/java/edu/escuelaing/arsw/prueba.java");
        String extension = "phy";
        lineCounter lc = new lineCounter();
        lc.readFile(extension, fr);
        assertTrue(5 == lc.getNumLineas());
    }

    /**
     * Rigourous Test :-)
     * 
     * @throws IOException
     */
    public void secondtTestFileByCasePhy() throws IOException {
        FileReader fr = new FileReader("src/test/java/edu/escuelaing/arsw/prueba1.java");
        String extension = "phy";
        lineCounter lc = new lineCounter();
        lc.readFile(extension, fr);
        System.out.println(lc.getNumLineas());
        assertFalse(12 == lc.getNumLineas());
    }

    /**
     * Rigourous Test :-)
     * 
     * @throws IOException
     */
    public void firstTestFileByCaseLoc() throws IOException {
        FileReader fr = new FileReader("src/test/java/edu/escuelaing/arsw/prueba.java");
        String extension = "loc";
        lineCounter lc = new lineCounter();
        lc.readFile(extension, fr);
        System.out.println(lc.getNumLineas());
        assertFalse(4 == lc.getNumLineas());
    }

    /**
     * Rigourous Test :-)
     * 
     * @throws IOException
     */
    public void secondTestFileByCaseLoc() throws IOException {
        FileReader fr = new FileReader("src/test/java/edu/escuelaing/arsw/prueba1.java");
        String extension = "loc";
        lineCounter lc = new lineCounter();
        lc.readFile(extension, fr);
        System.out.println(lc.getNumLineas());
        assertFalse(10 == lc.getNumLineas());
    }
    
}
