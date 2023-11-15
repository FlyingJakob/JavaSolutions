package org.Lektion_15_11_2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class LoginTest {


    @Test
    public void testLogin(){
        Database databaseMock = mock(Database.class);

        when(databaseMock.login("jakob","123")).thenReturn(true);

        LoginPage loginPage = new LoginPage(databaseMock);

        String result = loginPage.login("jakob","123");

        assertEquals("Inloggad!",result);

    }
}
