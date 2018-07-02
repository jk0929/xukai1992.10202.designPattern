package structuralPattern.decooratorPattern;

public class CoffeeTest {
   public static void main(String[] args) {

       Coffee mCoffee= new SimpleCoffee();
       System.out.println(" Name1 : "+ mCoffee.getName());

       mCoffee = new SugarDecorator(mCoffee);
       System.out.println(" Name1 : "+ mCoffee.getName());

       mCoffee = new MilkDecorator(mCoffee);
       System.out.println(" Name1 : "+ mCoffee.getName());

       mCoffee = new MilkFoamDecorator(mCoffee);

       mCoffee = new MochaDecorator(mCoffee);

       int price1 = mCoffee.getPrice();
       System.out.println("price1 = " + price1 );
   }
}
