package com.chriscooksley;

public class HelloWorld {

    public static void main(String[] args) {
        GreetingRecorder recorder = new ArrayListBackedGreetingRecorder();
        Greeter greeter = new Greeter(recorder);
        greeter.greet("Chris");
        greeter.greet("Henry");
        greeter.greet("Everyone!");
        System.out.println(greeter.getGreetingHistory());
        System.out.println("Hello World!");
    }
}
