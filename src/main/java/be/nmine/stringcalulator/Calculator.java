package be.nmine.stringcalulator;

public class Calculator {
    public int calculate(String string) {
        if(string.isEmpty())
            return 0;
        return Integer.valueOf(string);
    }
}
