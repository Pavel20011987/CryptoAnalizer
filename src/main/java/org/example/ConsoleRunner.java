package org.example;

import org.example.entity.Result;

import java.util.Arrays;

public class ConsoleRunner {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        Application application = new Application();
        Result result = application.run(args);
        System.out.println(result);
    }
}

//int key = 123; //<<<<args
//String text = "Привет медвед!";//<<<<args
//String result = ".............";//<<<<args
