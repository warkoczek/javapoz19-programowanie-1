package pl.sdacademy.javapoz19programowanie1.recursive;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void iteration(){

        Factorial factor = new Factorial();

        Assert.assertEquals(1, factor.iteration(0));
        Assert.assertEquals(1, factor.iteration(1));
        Assert.assertEquals(2, factor.iteration(2));
        Assert.assertEquals(6, factor.iteration(3));
        Assert.assertEquals(24, factor.iteration(4));
        Assert.assertEquals(120, factor.iteration(5));
    }

    @Test
    public void recursive() {

        Factorial factor = new Factorial();

        Assert.assertEquals(1, factor.recursive(0));
        Assert.assertEquals(1, factor.recursive(1));
        Assert.assertEquals(2, factor.recursive(2));
        Assert.assertEquals(6, factor.recursive(3));
        Assert.assertEquals(24, factor.recursive(4));
        Assert.assertEquals(120, factor.recursive(5));
    }
}