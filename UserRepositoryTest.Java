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
