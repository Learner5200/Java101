package com.chriscooksley;

import java.util.ArrayList;

public class ArrayListBackedGreetingRecorder implements GreetingRecorder {

    ArrayList<String> greetingLog = new ArrayList<>();

    public void record(String greeting) {
        greetingLog.add(greeting);
    }

    public ArrayList<String> getGreetingLog() {
        return greetingLog;
    }
}
