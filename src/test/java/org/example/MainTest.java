package org.example;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class MainTest {


    @Test
    public void testMain() {
        int expected = 20;
        Main main = new Main();
        int actual = main.multTen(2);
        Assert.assertEquals(actual, expected);
    }

}