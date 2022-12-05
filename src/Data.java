public class Data { //Создайте новый класс
    // у нас есть разрешенные символы(латинские буквы, цифры и __, поэтому давайте вот так вот сделаем
    private static final String VALID_CHARACTERS=
            "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789_";
private Data() { // так как у него будет статический метод, не предполагающий создание объектов, объекты должны быть созданы через класс
}

    public static boolean validate(String login, //и в нем — статический метод (ДОЛЖЕН ВОЗВ. ТРУ или ФОЛС, отлавливает,
                                   // значит фолс, иначе тру)
                                String password, //который принимает на вход три параметра
                                String confirmPassword) { //: login, password и confirmPassword (подтверждение пароля)
    try { // должен быть код, который выкидывает искл, и код который отлавливает искл.
        check(login,password,confirmPassword); // этот публичный метод вызывает ЧЕК
    } catch (WrongLoginException | WrongPasswordException e) {
        System.out.println(e.getMessage()); // выводит информацию через констр.
        return false; // валидация не успешна
    }
    return true; // ничего не было выкинуто, значит валидация прошла успешно
    }
    private static void check (String login, // метод будет выкидывать исключения
                                  String password, // о неправильном логине и пароле
                                  String confirmPassword) throws WrongLoginException,WrongPasswordException{
    if (!validate(login)) { // если логин не корректный
        throw new WrongLoginException("логин не валидный!");
    }
        if (!validate(password)) { // если пароль не корректный
            throw new WrongPasswordException("пароль не валидный!");
        }
        if (!password.equals(confirmPassword)) { // если пароли не единые
            throw new WrongPasswordException("пароли должны совпадать!");
        }
    }

    // логика одинакова, что Логин, что Пароль очень похожи валидация одна и та же
    public static boolean validate (String s) { // метод, который будет принимать либо логин, либо пароль в виде строки
    if (s.length()>20) {
        return false;
    }
        for (int i = 0; i < s.length(); i++) { // будем идти до длины строки в цикле
            if (!VALID_CHARACTERS.contains(String.valueOf(s.charAt(i)))){ //эти символы не содержат эти символы,
                return false; // то мы сразу возращаем фолс
            }
        }
        return true; // а иначе возвращаем тру.
    }
}
