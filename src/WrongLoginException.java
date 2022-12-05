public class WrongLoginException extends Exception{ // создали исключения

    public WrongLoginException() { // конструктор
    }

    public WrongLoginException(String message) {
        super(message);
    } // конструктор
}
