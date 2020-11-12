package mycalc;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import myexception.IncorrectInputStringException;

public class MyCalc {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputString;
        
        Calculator c = new Calculator();
        
        System.out.println("================ Калькулятор ==================");
        System.out.println("Введите выражение вида a + b, где a и b либо арабские, либо римские целые числа из интервала от 1 до 10");

        while ((inputString = br.readLine()) != null) {

            String[] tokens = inputString.split(" ");

            if (tokens.length != 3) {
                throw new IncorrectInputStringException("Введенное выражение не соответствует виду: a + b. \n Программа завершена");
            } else {
                               
                System.out.println(c.calculate(tokens[0], tokens[2], tokens[1]));
                
            }
        }
    }
}
    

