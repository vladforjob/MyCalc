package mycalc;

import myexception.IncorrectInputStringException;

public class Calculator {
    Validator v = new Validator();
  
    public String calculate(String a, String b, String operand){
        
        if (v.isLegalOperand(operand) != true) throw new IncorrectInputStringException("Операция '" + operand + "' не является допустимой. Программа завершена");
        
        String checkNumer = "";
        
        if (v.isLegalRome(a)) checkNumer += "r";
        if (v.isLegalArabic(a)) checkNumer += "a";
        if (v.isLegalRome(b)) checkNumer += "r";
        if (v.isLegalArabic(b)) checkNumer += "a";    
        
        if (checkNumer.length() < 2) throw new IncorrectInputStringException("Введенные значения не являются ни римскими, ни арабскими числами из заданного интервала. Программа завершена");
        if (checkNumer.equals("ra")||checkNumer.equals("ar")) throw new IncorrectInputStringException("Введенные значения должны быть либо только римскими, либо только арабскими числами. \n "
                + "+Программа завершена");
        
        if (checkNumer.equals("rr")) return getRome(calculator(getArabic(a), getArabic(b), operand));
        if (checkNumer.equals("aa")) return String.valueOf(calculator(Integer.valueOf(a), Integer.valueOf(b), operand));

        return "";
    }
    
    private static int calculator(int a, int b, String operand){
        switch (operand) {
            case "+" : return a + b;
            case "-" : return a - b;
            case "*" : return a * b;
            case "/" : return a / b;
            default: return -1;            
        }        
    }
    
    private int getArabic(String chislo) {

        switch (chislo) {
            case "I":
                return 1;
            case "II":
                return 2;
            case "III":
                return 3;
            case "IV":
                return 4;
            case "V":
                return 5;
            case "VI":
                return 6;
            case "VII":
                return 7;
            case "VIII":
                return 8;
            case "IX":
                return 9;
            case "X":
                return 10;
            default:
                return -1;
        }
    }
    
    private String getRome(int arabic){
        String s = "";
        while (arabic >= 100){
            s += "C";
            arabic -= 100;
        } 
        while (arabic >= 90){
            s += "XC";
            arabic -= 90;
        }
        while (arabic >= 50){
            s += "L";
            arabic -= 50;
        }
        while (arabic >= 40){
            s += "XL";
            arabic -= 40;
        }
        while (arabic >= 10){
            s += "X";
            arabic -= 10;
        }
        while (arabic >= 9){
            s += "IX";
            arabic -= 9;
        }
        while (arabic >= 5){
            s += "V";
            arabic -= 5;
        }
        while (arabic >= 4){
            s += "IV";
            arabic -= 4;
        }
        while (arabic >= 1){
            s += "I";
            arabic -= 1;
        }
        return s;
    }
    
}
