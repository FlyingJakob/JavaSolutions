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

}
