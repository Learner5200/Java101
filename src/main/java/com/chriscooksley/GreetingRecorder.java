package com.chriscooksley;

import java.util.List;

public interface GreetingRecorder {

    void record(String greeting);

    List<String> getGreetingLog();

}
