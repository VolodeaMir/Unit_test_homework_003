Unit-тесты (семинары)

Урок 3. Качество тестов
Задание 0. (необязательное) \*Попробовать самостоятельно решить задачи, которые не успели решить на семинаре. Сдавать решение не нужно.

Условия к ДЗ (архив)

\*Задание 1.

Напишите тесты, покрывающие на 100% метод evenOddNumber, который проверяет, является ли переданное число четным или нечетным. (код приложен в презентации)

Задание 2.

Разработайте и протестируйте метод numberInInterval, который проверяет, попадает ли переданное число в интервал (25;100). (код приложен в презентации)

Задание 3. (необязательное)

Добавьте функцию в класс UserRepository, которая разлогинивает всех пользователей, кроме администраторов. Для этого, вам потребуется расширить класс User новым свойством, указывающим, обладает ли пользователь админскими правами. Протестируйте данную функцию.

*Формат сдачи: *воспользуйтесь одним из вариантов: Ссылка на репозиторий Git или Прикрепленный архив

## Давайте начнем с написания тестов для заданий 1 и 2.

Напишим примеры тестов на языке Java с использованием библиотеки JUnit.

# Задание 1. Тесты для метода evenOddNumber:

```java
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class YourTestClassTest {

    @Test
    public void testEvenOddNumberEven() {
        YourTestClass yourObject = new YourTestClass();
        boolean result = yourObject.evenOddNumber(4);
        assertTrue(result);
    }

    @Test
    public void testEvenOddNumberOdd() {
        YourTestClass yourObject = new YourTestClass();
        boolean result = yourObject.evenOddNumber(7);
        assertFalse(result);
    }

    // Другие тесты, например, проверка на 0, отрицательные числа и т.д.

}
```

# Задание 2. Тесты для метода numberInInterval:

```java Copy code
import org.junit.Test;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class YourTestClassTest {

    @Test
    public void testNumberInIntervalInside() {
        YourTestClass yourObject = new YourTestClass();
        boolean result = yourObject.numberInInterval(50);
        assertTrue(result);
    }

    @Test
    public void testNumberInIntervalOutside() {
        YourTestClass yourObject = new YourTestClass();
        boolean result = yourObject.numberInInterval(20);
        assertFalse(result);
    }

    // Другие тесты, например, граничные значения интервала и т.д.

}
```

# Теперь перейдем к заданию 3.

## Предположим, что у вас есть класс UserRepository и вы хотите добавить функцию разлогинивания всех пользователей, кроме администраторов. Вам нужно расширить класс User новым свойством isAdmin и добавить метод logoutNonAdminUsers в класс UserRepository.

```java Copy code
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
```

## Теперь напишем тесты:

```java Copy code
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class UserRepositoryTest {

    @Test
    public void testLogoutNonAdminUsers() {
        UserRepository userRepository = new UserRepository();
        User adminUser = new User("admin", true);
        User nonAdminUser1 = new User("user1", false);
        User nonAdminUser2 = new User("user2", false);

        userRepository.addUser(adminUser);
        userRepository.addUser(nonAdminUser1);
        userRepository.addUser(nonAdminUser2);

        assertEquals(3, userRepository.getUsers().size()); // Проверяем, что изначально есть 3 пользователя

        userRepository.logoutNonAdminUsers();

        assertEquals(1, userRepository.getUsers().size()); // Проверяем, что остался только администратор
        assertEquals(adminUser, userRepository.getUsers().get(0)); // Проверяем, что администратор остался
    }

}
```

## Обратите внимание, что это примеры тестов, и вы можете расширить их в зависимости от ваших конкретных требований и условий.

<script>
    function copyCode() {
        var codeElement = document.querySelector('code'); // Adjust this selector based on your HTML structure
        var textArea = document.createElement('textarea');
        textArea.value = codeElement.textContent;
        document.body.appendChild(textArea);
        textArea.select();
        document.execCommand('copy');
        document.body.removeChild(textArea);
        alert('Code copied to clipboard!');
    }
</script>
