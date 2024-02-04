public class InterfaceMethods {
    public static void main(String[] args) {
        Printer printer1 = new PrinterImpl();
        printer1.print("Hello");
        Printer.doSomethingStatically();
        printer1.printSomething("");
        printer1.printSomethingElse("dataa");
    }
}

interface Printer {
    void print(String data);

    default void printSomething(String data) {

    }

    default void printSomethingElse(String data) {

    }

    static void doSomethingStatically() {

    }
}

class PrinterImpl implements Printer {
    @Override
    public void print(String data) {
        System.out.println(data);
    }
}