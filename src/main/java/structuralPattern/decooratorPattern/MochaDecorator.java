package structuralPattern.decooratorPattern;

public class MochaDecorator extends Decorator {

    /**
     * 通过组合的方式把Coffee对象传递进来
     *
     * @param coffee
     */
    public MochaDecorator(Coffee coffee) {
        super(coffee);
    }

    public int getPrice() {
        return mCoffee.getPrice()+20;
    }

    public String getName() {
        return mCoffee.getName()+ " + addMocha";
    }
}