package Printer;

public class PrinterService implements Printer {
    public void print(Object data, String message) {
        System.out.println(message + " " + data);
    }
}
