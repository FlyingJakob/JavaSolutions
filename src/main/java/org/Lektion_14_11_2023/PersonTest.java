package org.Lektion_14_11_2023;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PersonTest {


    @Test
    public void GetFullNameTest(){
        Person myPerson = new Person("Jakob","Forsbacka");

        String result = myPerson.getFullName();

        assertEquals("Jakob Forsbacka",result);



    }
}
