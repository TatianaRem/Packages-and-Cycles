import ru.netology.sqr.packagesandcycles.services.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();

        int StartOfRange = 100;
        int EndOfRange = 1000;
        int expected = 22;
        int actual = service.determineNumberOfSquares(100, 1000);

        System.out.println(+expected + " Количество квадратов в данном диапазоне " + actual);

    }
}