package creationPattern.singletonPartten.singletonAdvance;

import java.util.Vector;

/**
 * 采用"影子实例"的办法为单例对象的属性同步更新
 */
public class SingletonSynchUpdate {

    private static SingletonSynchUpdate instance = null;
    private Vector properties = null;

    public Vector getProperties() {
        return properties;
    }

    private SingletonSynchUpdate() {
    }

    private static synchronized void syncInit() {
        if (instance == null) {
            instance = new SingletonSynchUpdate();
        }
    }

    public static SingletonSynchUpdate getSingleton() {
        if (instance == null) {
            syncInit();
        }
        return instance;
    }

    public void updateProperties() {
        SingletonSynchUpdate shadow = new SingletonSynchUpdate();
        properties = shadow.getProperties();
    }
}
