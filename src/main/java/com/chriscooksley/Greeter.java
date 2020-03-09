package com.chriscooksley;

public class Greeter {

    private GreetingRecorder greetingRecorder;

    public Greeter(GreetingRecorder greetingRecorder) {
        this.greetingRecorder = greetingRecorder;
    }

    public String greet(String name) {
        String greeting = "Hello " + name;
        greetingRecorder.record(greeting);
        return greeting;
    }

    public String getGreetingHistory() {
        return String.join("\n", greetingRecorder.getGreetingLog());
    }
}
