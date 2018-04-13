package applepackage;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProfitCalculatorTest {

    private ProfitCalculator calculator;
    private int[] sampleArray = new int[]{10,7,5,11,8,9};
    private int[] sampleArray2 = new int[]{10,7,5,4,3,11,8,9};
    private int[] sampleArray3 = new int[]{7,10,6,9};
    private int[] sampleArray4 = new int[]{10,7,5,3};


    @Test
    public void whenGivenSampleArray_ReturnLowestNumberFive(){
        int expected = 5;
        calculator = new ProfitCalculator(sampleArray);
        int actual = calculator.getLowest();

        assertEquals(expected, actual);

    }

    @Test
    public void whenGivenSampleArray_ReturnProfitOfSix() {
        int expected = 6;
        calculator = new ProfitCalculator(sampleArray);
        int actual = calculator.getMaxProfit();

        assertEquals(expected, actual);
    }

    @Test
    public void whenGivenSampleArray2_ReturnProfitOfEight() {
        int expected = 8;
        calculator = new ProfitCalculator(sampleArray2);
        int actual = calculator.getMaxProfit();

        assertEquals(expected, actual);
    }

    @Test
    public void whenGivenSampleArray3_ReturnProfitOf3withCorrectPair() {
        int expected = 3;
        calculator = new ProfitCalculator(sampleArray3);
        int actual = calculator.getMaxProfit();

        assertEquals(expected, actual);
    }

    @Test
    public void whenGivenSampleArray4_ReturnNoProfit() {
        int expected = 0;
        calculator = new ProfitCalculator(sampleArray4);
        int actual = calculator.getMaxProfit();

        assertEquals(expected, actual);
    }

}