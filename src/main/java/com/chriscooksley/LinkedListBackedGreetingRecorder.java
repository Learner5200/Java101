package com.chriscooksley;

import java.util.LinkedList;

public class LinkedListBackedGreetingRecorder implements GreetingRecorder {

    LinkedList<String> greetingLog = new LinkedList<>();

    public void record(String greeting) {
        greetingLog.add(greeting);
    }

    public LinkedList<String> getGreetingLog() {
        return greetingLog;
    }
}
