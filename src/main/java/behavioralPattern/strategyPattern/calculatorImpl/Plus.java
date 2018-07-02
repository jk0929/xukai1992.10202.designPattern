package behavioralPattern.strategyPattern.calculatorImpl;

import behavioralPattern.strategyPattern.AbstractCalculator;
import behavioralPattern.strategyPattern.ICalculator;

public class Plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}
