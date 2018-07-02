package behavioralPattern.observerPattern;

public class TestObserver {

    public static void main(String[] args) {
        Subject concreteSubject = new ConcreteSubject();
        Observer cartoonObserver = new CartoonObserver();
        Observer nbaObserver = new NBAObserver();

        concreteSubject.addObserver(cartoonObserver);
        concreteSubject.addObserver(nbaObserver);

        concreteSubject.notifyAllObserver("老师来了");
        concreteSubject.notify(cartoonObserver,"老师来了，看卡通书会没收！");

    }

}
