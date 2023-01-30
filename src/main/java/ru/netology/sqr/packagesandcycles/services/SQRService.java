package ru.netology.sqr.packagesandcycles.services;

public class SQRService {
    public int determineNumberOfSquares(int startOfRange, int endOfRange) {

        int numberOfSqueres = 0;
        for (int i = 10; i <= 99; i++) {
            int squareOfNumber = i * i;
            if (squareOfNumber >= startOfRange) {

                if (squareOfNumber < endOfRange) {
                    numberOfSqueres = numberOfSqueres + 1;
                }
            }

        }


        return numberOfSqueres;
    }

}