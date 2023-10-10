package Input;

import Constants.Input;

import java.util.Scanner;

public class InputService {
    private final Scanner scanner;

    public InputService(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getIntInput(String promptMessage) {
        System.out.print(promptMessage);

        while (!scanner.hasNextInt()) {
            System.out.println(Input.INVALID_INPUT_MESSAGE);
            System.out.print(promptMessage);
            scanner.next();
        }

        return scanner.nextInt();
    }
}
