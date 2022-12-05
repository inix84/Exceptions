public class Main { // Напишем программу, которая проверяет корректность введенных данных логина и пароля.
    public static void main(String[] args) {
        boolean success = Data.validate("test","test","test");
    if (success) {
        System.out.println("данные валидны");
    } else {
        System.out.println("данные не валидны");
    }
    }
}