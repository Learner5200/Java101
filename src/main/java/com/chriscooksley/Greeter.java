package com.chriscooksley;

public class Greeter {

    GreetingRecorder greetingRecorder;

    public Greeter(GreetingRecorder greetingRecorderArgument) {
        this.greetingRecorder = greetingRecorderArgument;
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
