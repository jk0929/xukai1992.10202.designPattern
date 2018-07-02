package behavioralPattern.observerPattern.eventNotifier;

import java.util.Date;

public class WatchingNBAListener {

    public  WatchingNBAListener() {
        System.out.println(" 我是" + this.getClass().getName()+ " 我正在看NBA，开始时间是：" +
                new Date().toString());
    }
    public void stopWatchingTV(Date date){
        System.out.println("WatchingNBAListener 老师来了，快关闭NBA直播 ， 结束时间是：" + date.toString());
    }
}
