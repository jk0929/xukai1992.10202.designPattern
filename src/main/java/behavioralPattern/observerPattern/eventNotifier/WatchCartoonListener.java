package behavioralPattern.observerPattern.eventNotifier;

import java.util.Date;

public class WatchCartoonListener {

    WatchCartoonListener() {
        System.out.println(" 我是" + this.getClass().getName()+ " 我正在看漫画，开始时间是：" +
                new Date().toString());
    }
    public void stopPlayingGame(Date date){
        System.out.println("WatchingCartoonListener 老师来了，快收拾漫画 ， 结束时间是：" + date.toString());
    }
}
