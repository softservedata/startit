package com.softserve.edu;

import org.junit.jupiter.api.*;

public class SimpleJUnit5 {

    @BeforeAll
    public static void setup() {
        System.out.println("@BeforeAll executed");
    }

    @AfterAll
    public static void tear() {
        System.out.println("@AfterAll executed");
    }

    @BeforeEach
    public void setupThis() {
        System.out.println("\t@BeforeEach executed");
    }

    @AfterEach
    public void tearThis(TestInfo testInfo) {
        System.out.println("\t\t\tgetTestMethod = " + testInfo.getTestMethod());
        System.out.println("\t\t\tgetDisplayName = " + testInfo.getDisplayName());
        //
        System.out.println("\t@AfterEach executed");
    }

    @Test
    public void testOne() {
        System.out.println("\t\t@Test testOne()");
        Assertions.assertEquals(4, 2 + 2);
    }

    @Test
    public void testTwo() {
        System.out.println("\t\t@Test testTwo()");
        Assertions.assertTrue(6 == 2 + 4);
    }

}
