public class User {
    private String username;
    private boolean isAdmin;

    // конструктор, геттеры, сеттеры и другие методы

    public boolean isAdmin() {
        return isAdmin;
    }
}

public class UserRepository {
    private List<User> users;

    // конструктор, добавление пользователей и другие методы

    public void logoutNonAdminUsers() {
        // Разлогинивание всех пользователей, кроме администраторов
        users.removeIf(user -> !user.isAdmin());
    }
}
