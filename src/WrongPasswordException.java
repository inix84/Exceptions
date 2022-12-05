public class WrongPasswordException extends Exception{// создали исключения

    public WrongPasswordException() { // конструктор
    }

    public WrongPasswordException(String message) { // конструктор
        super(message);
    }
}