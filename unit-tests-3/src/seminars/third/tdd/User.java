package seminars.third.tdd;

// HW_3
// Задание №6
// Разработайте класс User с методом аутентификации по логину и паролю. 
// Метод должен возвращать true, если введенные логин и пароль корректны, иначе false. 
// Протестируйте все методы


public class User {
    String name;
    String password;
    boolean isAdmin;
    boolean isAuthenticate;

    //    в конструктор передаём параметр isAdmin - является ли наш пользователь администратором или нет
    public User(String name, String password, boolean isAdmin) {
        this.name = name;
        this.password = password;
        this.isAdmin = isAdmin;
    }

    //    метод проверки зарегистрирован пользователь или нет
    public boolean isAuthenticateVerify(String name, String password) {
        if (name.equals(this.name) && password.equals(this.password)) {
            isAuthenticate = true;
            return true;
        } else {
            isAuthenticate = false;
            return false;
        }
    }

    //    метод разлогинивания пользователя
    public void logOut() {
        this.isAuthenticate = false;
    }
}