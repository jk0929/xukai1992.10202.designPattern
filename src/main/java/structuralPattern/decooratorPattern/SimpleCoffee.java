package structuralPattern.decooratorPattern;

public class SimpleCoffee extends Coffee {
    @Override
    public int getPrice() {
        return 30;
    }

    @Override
    public String getName() {
        return "SimpleCoffee";
    }
}
