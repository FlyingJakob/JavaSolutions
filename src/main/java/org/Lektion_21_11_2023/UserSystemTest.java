package org.Lektion_21_11_2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserSystemTest {

    @Test
    public void TestLogin(){
        UserSystem.CreateDatabase();
        UserSystem.register("Test1","Test");

        assertFalse(UserSystem.login("Test1","dfgyhdghjfgyjfhjghj"));

        assertTrue(UserSystem.login("Test1","Test"));
    }

    @Test
    public void TestChangePassword(){
        UserSystem.changePassword("Test1","NewPass");

        assertTrue(UserSystem.login("Test1","NewPass"));
        assertFalse(UserSystem.login("Test1","Test"));

        UserSystem.changePassword("Test1","Test");
        assertTrue(UserSystem.login("Test1","Test"));

    }


}
