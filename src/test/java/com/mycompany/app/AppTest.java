package com.mycompany.app;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.Test;
import org.junit.After;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
    public void testAppConstructor() {
        try {
            new App();
        } catch (Exception e) {
            fail("Construction failed.");
        }
    }

    @Test
    public void testAppMain()
    {
        App.main(null);
        try {
            assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
        } catch (AssertionError e) {
            fail("\"message\" is not \"Hello World!\"");
        }
    }

    @Test
    public void testConsolidationRun() {
        assertTrue(true);
    }

    @Test
    public void testCons2Run() {
        assertTrue(false);
    }

    @Test
    public void testImportRun() {
        assertTrue(false);
    }

    @Test
    public void someTest1() { assertTrue(true); }

    @Test
    public void someTest2() { assertTrue(true); }

    @Test
    public void someTest3() { assertTrue(true); }

    @Test
    public void someTest4() { assertTrue(true); }

    @Test
    public void someTest5() { assertTrue(true); }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
