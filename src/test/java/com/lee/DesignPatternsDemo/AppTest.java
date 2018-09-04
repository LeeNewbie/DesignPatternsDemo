package com.lee.DesignPatternsDemo;

import org.apache.http.impl.client.HttpClients;

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
    public static void main(String[] args) {
    	
        System.out.println("nowday ====> " + Weekday.SAT);
        System.out.println("nowday int ====> " + Weekday.SAT.ordinal());
        System.out.println("nextday ====> " + Weekday.getNextDay(Weekday.SAT)); // 输出 SUN

        //输出：
        //nowday ====> SAT
        //nowday int ====> 6
        //nextday ====> SUN
        
    }
}
