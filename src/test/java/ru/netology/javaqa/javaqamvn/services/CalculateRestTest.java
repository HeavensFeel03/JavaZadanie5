package ru.netology.javaqa.javaqamvn.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;


public class CalculateRestTest {

    @ParameterizedTest
    //   @CsvSource({
    //         "3,10000,3000,20000",
    //          "2,100000,60000,150000"
    //  })
    @CsvFileSource(files = "src/test/resources/Rest.csv")
    public void test1(int expected, int income, int expenses, int threshold) {
        CalculateRest service = new CalculateRest();
        int actual = service.CalculateRest(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    /* @Test
    public void test2(){
        CalculateRest service = new CalculateRest();
        int expected=2;
        int actual = service.CalculateRest(100_000,60_000,150_000);

        Assertions.assertEquals(expected,actual);
    }
       */
}
