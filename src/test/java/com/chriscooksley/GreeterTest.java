package com.chriscooksley;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreeterTest {

    @Test
    void greet_whenPassedName_returnsGreetingForThatName() {
        GreetingRecorder greetingRecorder1 = new ArrayListBackedGreetingRecorder();
        Greeter greeter = new Greeter(greetingRecorder1);
        String greeting = greeter.greet("Chris");
        assertEquals("Hello Chris", greeting);
    }

    @Test
    void getGreetingHistory_returnsAllPastGreetings() {
        LinkedListBackedGreetingRecorder greetingRecorder2 = new LinkedListBackedGreetingRecorder();
        Greeter greeter = new Greeter(greetingRecorder2);
        greeter.greet("Chris");
        greeter.greet("Henry");
        String greetingHistory = greeter.getGreetingHistory();
        assertEquals("Hello Chris\nHello Henry", greetingHistory);
    }
}
