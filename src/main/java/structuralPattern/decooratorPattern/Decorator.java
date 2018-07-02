package structuralPattern.decooratorPattern;

public abstract class Decorator extends Coffee {

    protected Coffee mCoffee;

    /**
     * 通过组合的方式把Coffee对象传递进来
      * @param coffee
     */
    public Decorator(Coffee coffee){
        this.mCoffee =  coffee;
    }
}
