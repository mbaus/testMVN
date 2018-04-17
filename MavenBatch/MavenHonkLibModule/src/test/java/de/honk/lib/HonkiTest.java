==========++++++++++==========
./MavenBatch/MavenHonkLibModule/src/test/java/de/honk/lib/HonkiTest.java
package de.honk.lib;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class HonkiTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public HonkiTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( HonkiTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testHonkiTest()
    {
        assertTrue( true );
    }
}

