package org.Lektion_15_11_2023;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TextUtillityTest {


    @ParameterizedTest
    @ValueSource(strings = {"anna","apa","Madam"," ---Apa","Tor Enerot"})
    public void testIsPalindrome(String str){
        TextUtillity textUtillity = new TextUtillity();
        assertTrue(textUtillity.isPalindrome(str));
    }
    @ParameterizedTest
    @ValueSource(strings = {"jakob","kalle","lisa"})
    public void testIsNotPalindrome(String str){
        TextUtillity textUtillity = new TextUtillity();
        assertFalse(textUtillity.isPalindrome(str));
    }
}
