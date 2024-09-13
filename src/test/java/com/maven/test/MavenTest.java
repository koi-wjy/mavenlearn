package com.maven.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MavenTest {

    @Test
    public void testAssert(){
        int a = 10;
        int b = 5;
        Assertions .assertEquals(a+b, 15);
    }
}
