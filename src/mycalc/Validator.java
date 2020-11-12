package mycalc;

public class Validator {
    
    String[] rimChislo = {"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};
    String[] operands = {"+", "-", "*", "/"};
    int[] arabicChislo = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    
    public boolean isLegalRome(String inputString){
        boolean flag = false;
        for (String chislo : rimChislo){
            if (inputString.equals(chislo)) flag = true;
        } 
        return flag;
    } 
    
    public boolean isLegalOperand(String inputString){
        boolean flag = false;
        for (String operand : operands){
            if (inputString.equals(operand)) flag = true;
        } 
        return flag;
    }
    
    public boolean isLegalArabic(String inputString){
        boolean flag = false;
        int chislo;
        try {
            chislo = Integer.valueOf(inputString);
            for (int arabic : arabicChislo){
                if (arabic == chislo) flag = true;               
            }
        } catch (NumberFormatException e) {
            flag = false;
        }                
        return flag;
    }  
    
}
