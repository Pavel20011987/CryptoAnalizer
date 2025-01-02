package org.example;

import org.example.controllers.MainController;
import org.example.entity.Result;
import org.example.view.console.ConsoleApp;
import org.example.view.console.Menu;

import java.util.Arrays;
import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
        //encode data.txt encrypted.txt 12
        //build console app
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu(input);
        MainController mainController = new MainController();
        ConsoleApp application = new ConsoleApp(mainController, menu);
        //run console app
        application.run(args);
    }
}

//int key = 123; //<<<<args
//String text = "Привет медвед!";//<<<<args
//String result = ".............";//<<<<args
