package seminars.five.user;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserRepositoryTest {
    @Test
    void testGetUserName(){
        UserRepository userRepository = new UserRepository();
        UserService userService = new UserService(userRepository);

        String result = userService.getUserName(1);
        assertEquals("User 1", result);
    }




}
