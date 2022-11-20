package com.test;
import com.main.Average;
import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AverageTest {
    @Test
    public void kZeroListNull() {
        int k = 0;
        int[] list = null;
        Average avg = new Average();
        assertEquals((Integer)null, avg.average(k, list));
    }

    @Test
    public void kZeroListEmpty() {
        int k = 0;
        int[] list = new int[] {};
        Average avg = new Average();
        assertEquals((Integer)null, avg.average(k, list));
    }

    @Test
    public void kZeroListNotEmpty() {
        int k = 0;
        int[] list = new int[] {1};
        Average avg = new Average();
        assertEquals((Integer)null, avg.average(k, list));
    }

    @Test
    public void kOneListNull() {
        int k = 1;
        int[] list = null;
        Average avg = new Average();
        assertEquals((Integer)null, avg.average(k, list));
    }

    @Test
    public void kOneListEmpty() {
        int k = 1;
        int[] list = new int[] {};
        Average avg = new Average();
        assertEquals((Integer)null, avg.average(k, list));
    }

    @Test
    public void kOneListNotEmpty() {
        int k = 1;
        int[] list = new int[] {1};
        Average avg = new Average();
        assertEquals(1, avg.average(k, list));
    }

    @Test
    public void kMinusListNull() {
        int k = -1;
        int[] list = null;
        Average avg = new Average();
        assertEquals((Integer)null, avg.average(k, list));
    }

    @Test
    public void kMinusListEmpty() {
        int k = -1;
        int[] list = new int[] {};
        Average avg = new Average();
        assertEquals((Integer)null, avg.average(k, list));
    }

    @Test
    public void kMinusListNotEmpty() {
        int k = -1;
        int[] list = new int[] {1};
        Average avg = new Average();
        assertEquals((Integer)null, avg.average(k, list));
    }

    @Test
    public void kGreaterThanListLengthTest() {
        int k = 3;
        float ans= 1.5f;
        int[] list = new int[] {1,2};
        Average avg = new Average();
        assertEquals(ans, avg.average(k, list));
    }

    @Test
    public void kEqualToListLengthTest() {
        int k = 3;
        int[] list = new int[] {1,2,3};
        Average avg = new Average();
        assertEquals(2, avg.average(k, list));
    }

    @Test
    public void kLessThanListLengthTest() {
        int k = 3;
        int[] list = new int[] {1,2,3,4};
        Average avg = new Average();
        assertEquals(2, avg.average(k, list));
    }
}
