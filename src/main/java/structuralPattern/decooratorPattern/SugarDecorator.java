package structuralPattern.decooratorPattern;

public class SugarDecorator extends Decorator {
    /**
     * 通过组合的方式把Coffee对象传递进来
     *
     * @param coffee
     */
    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    public int getPrice() {
        return mCoffee.getPrice()+2;
    }

    public String getName() {
        return mCoffee.getName()+" + addSugar";
    }
}
