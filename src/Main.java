import Input.InputService;
import Printer.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InputService inputService = new InputService(new Scanner(System.in));
        PrinterService printerService = new PrinterService();
        NumberProcessor numberProcessor = new NumberProcessor();

        Application application = new Application(inputService, printerService, numberProcessor);
        application.processNumbers();
    }
}
