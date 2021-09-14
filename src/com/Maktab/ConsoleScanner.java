package com.Maktab;

import java.util.Scanner;

public class ConsoleScanner {
    Scanner scanner = new Scanner(System.in);
    public String getConsole(){
        return scanner.nextLine();
    }
}
