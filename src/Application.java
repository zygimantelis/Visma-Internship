import java.util.InputMismatchException;

import Constants.Input;
import Constants.Output;
import Input.InputService;
import Printer.PrinterService;

public class
Application {
    private final InputService inputService;
    private final PrinterService printerService;
    private final NumberProcessor numberProcessor;

    public Application(
            InputService inputService,
            PrinterService printerService,
            NumberProcessor numberProcessor
    ) {
        this.inputService = inputService;
        this.printerService = printerService;
        this.numberProcessor = numberProcessor;
    }

    public void processNumbers() {
        try {
            int number = inputService.getIntInput(Input.INPUT_MESSAGE);

            while (number != 0) {
                numberProcessor.addNumber(number);
                number = inputService.getIntInput(Input.INPUT_MESSAGE);
            }

            printerService.print(numberProcessor.calculateSum(), Output.AMOUNT_OUTPUT_MESSAGE);
            printerService.print(numberProcessor.getNumbers(), Output.NUMBER_OUTPUT_MESSAGE);
            printerService.print(numberProcessor.calculateSumDividedByWeekday(), Output.WEEKDAY_OUTPUT_MESSAGE);
        } catch (InputMismatchException exception) {
            System.out.println(Input.INPUT_EXCEPTION_MESSAGE);
        }
    }
}
