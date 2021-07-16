package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("!!!Enter 0 for exit ");
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter expression: ");
            String str = in.nextLine();
            double res = 0;
            str = str.replaceAll("\\s", "");
            if(str.equals("0")){
                break;
            }

            char sign = ' ';
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '.') {
                    i++;
                }
                if (!Character.isDigit(str.charAt(i))) {
                    sign = str.charAt(i);
                }
            }

            if (sign == '+') {
                String[] numbers = str.split("\\+");
                for (String number : numbers) {
                    res += Double.parseDouble(number);
                }
            }
            if (sign == '-') {
                String[] numbers = str.split("-");
                res = Double.parseDouble(numbers[0]) - Double.parseDouble(numbers[1]);
            }
            if (sign == '*') {
                String[] numbers = str.split("\\*");
                res = 1;
                for (String number : numbers) {
                    res *= Double.parseDouble(number);
                }
            }
            if (sign == '/') {
                String[] numbers = str.split("/");
                for (String number : numbers) {
                    if (Integer.parseInt(numbers[1]) == 0) {
                        System.out.println("УРАА!!! ДАВАААЙ!!! ДАВАЙ!! ДЕЛИ НА 0");
                        break;
                    }
                    res = Double.parseDouble(numbers[0]) / Double.parseDouble(numbers[1]);
                }
            }
            System.out.printf("%.2f", res);
            System.out.println();
        }
    }
}