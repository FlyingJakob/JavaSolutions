package org.Lektion_15_11_2023;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChatBotTest {


    @Test
    public void testReply(){

        ChatBot chatBot = new ChatBot();

        assertEquals("Hi!",chatBot.reply("Hello!"));

        assertEquals("Don't go",chatBot.reply("Goodbye!"));
        assertEquals("I dont understand",chatBot.reply("fthrhrthrtghgfh"));



    }
}
