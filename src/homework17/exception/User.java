package homework17.exception;

public class User {

    public static void validate(String login, String password, String confirmPassword) {
        try {
            validateLogin(login);
            validatePassword(password, confirmPassword);
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void validateLogin(String login) throws WrongLoginException {
        if (login.length() > 20 || !login.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongLoginException("Логин содержит недопустимые символы или его длина превышает 20 символов.");
        }
    }

    private static void validatePassword(String password, String confirmPassword) throws WrongPasswordException {
        if (password.length() > 20 || !password.matches("^[a-zA-Z0-9_]+$")) {
            throw new WrongPasswordException("Пароль содержит недопустимые символы или его длина превышает 20 символов.");
        }
        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают.");
        }
    }
}