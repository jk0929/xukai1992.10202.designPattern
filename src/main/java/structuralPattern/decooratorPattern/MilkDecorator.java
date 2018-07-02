package structuralPattern.decooratorPattern;

public class MilkDecorator extends Decorator {

    /**
     * 通过组合的方式把Coffee对象传递进来
     *
     * @param coffee
     */
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    public int getPrice() {
        return mCoffee.getPrice()+10;
    }

    public String getName() {
        return mCoffee.getName()+ " + addMilk";
    }
}
