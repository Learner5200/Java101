package com.chriscooksley;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreeterTest {

    @Test
    public void greet_whenPassedName_returnsGreetingForThatName() {
        Greeter greeter = new Greeter(new LinkedListBackedGreetingRecorder());
        assertEquals("Hello Chris", greeter.greet("Chris"));
    }

    @Test
    public void getGreetingHistory_returnsAllPastGreetingsOnSeparateLines() {
        Greeter greeter = new Greeter(new LinkedListBackedGreetingRecorder());
        greeter.greet("Chris");
        greeter.greet("Henry");
        String expected = "Hello Chris\nHello Henry";
        assertEquals(expected, greeter.getGreetingHistory());
    }
}
