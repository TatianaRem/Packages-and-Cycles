package ru.netology.sqr.packagesandcycles.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    //  @CsvSource({
    //      "3,200,300",
    //      "22,100,1000"
    //  })
    @CsvFileSource(files = "src/test/resources/Range.csv")
    public void testCalcExact(int expected, int startOfRange, int endOfRange) {
        SQRService service = new SQRService();

        //int expected = 22;
        int actual = service.determineNumberOfSquares(startOfRange, endOfRange);

        Assertions.assertEquals(expected, actual);
        System.out.println(+expected + " Количество квадратов в данном диапазоне " + actual);

    }


}
