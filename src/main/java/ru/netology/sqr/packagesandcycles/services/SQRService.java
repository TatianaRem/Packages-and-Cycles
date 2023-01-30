package ru.netology.sqr.packagesandcycles.services;

public class SQRService {
    public int determineNumberOfSquares(int StartOfRange, int EndOfRange) {

        int NumberOfSqueres = 0;
        for (int i = 10; i <= 99; i++) {
            int SquareOfNumber = i * i;
            if (SquareOfNumber >= StartOfRange) {

                if (SquareOfNumber < EndOfRange) {
                    NumberOfSqueres = NumberOfSqueres + 1;
                } else ;
            } else ;

        }


        return NumberOfSqueres;
    }

}