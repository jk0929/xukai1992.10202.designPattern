package behavioralPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteSubject implements  Subject {
    List<Observer> mList =new ArrayList<Observer>();


    public void addObserver(Observer observer) {
        // 确保相同的观察者只含有一个
        if (observer == null) {
            throw new NullPointerException("observer == null");
        }

        if (!mList.contains(observer)) {
            mList.add(observer);
        }


    }

    public void removeObserver(Observer observer) {
        mList.remove(observer);

    }

    public void removeAll() {
        mList.clear();
    }



    public void notifyAllObserver(Object data) {
        for (Observer observer : mList) {
            observer.update(this,data);
        }

    }


    public void notify(Observer observer, Object data) {
        if(observer!=null){
            observer.update(this, data);
        }

    }
}
