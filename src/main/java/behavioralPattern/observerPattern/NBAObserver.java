package behavioralPattern.observerPattern;

public class NBAObserver implements Observer {

    public void update(Subject subject, Object data) {
        System.out.println( " 我是"+this.getClass().
                getSimpleName()+"，  "+data+"别看NBA了");

    }

}
