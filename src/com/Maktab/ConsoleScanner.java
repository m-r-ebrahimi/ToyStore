package com.Maktab;

import java.util.Scanner;

public class ConsoleScanner {
    static Scanner scanner = new Scanner(System.in);
    public String getConsole(){
        return scanner.nextLine();
    }
}
