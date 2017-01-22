package com.mycompany.app;

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
     */
    public void testApp()
    {
        assertTrue( true );
    }
    public void testFound() {
      int[] array = new int[] {1, 2, 3, 4};
      assertTrue(new App().search(array, 4));
    }

    public void testNotFound() {
      int[] array = new int[] {1, 2, 3, 4};
      assertFalse(new App().search(array, 5));
    }

    public void testEmptyArray() {
      int[] array = new int[0];
      assertFalse(new App().search(array, 1));
    }

    public void testNull() {
      assertFalse(new App().search(null, 1));
    }
}
