package creationPattern.abstractFactoryPartten;

import creationPattern.abstractFactoryPartten.providerImpl.SendMailFactory;
import creationPattern.abstractFactoryPartten.providerImpl.SendSmsFactory;
import creationPattern.abstractFactoryPartten.providerImpl.SendWeiXinFactory;
import org.junit.Test;


/**
 * 其实这个模式的好处就是，如果你现在想增加一个功能：
 * 发及时信息，则只需做一个实现类，实现Sender接口，
 * 同时做一个工厂类，实现Provider接口，就OK了，
 * 无需去改动现成的代码(如weiXin这个实现)。这样做，拓展性较好！
 */

public class AbstractFactoryTest {

    @Test
    public  void abstractFactoryTest() {
        Provider provider = new SendMailFactory();
        Sender sender = provider.produce();
        sender.send();

        Provider provider1 = new SendSmsFactory();
        Sender sender1 = provider1.produce();
        sender1.send();

        Provider provider2 = new SendWeiXinFactory();
        Sender sender2 = provider2.produce();
        sender2.send();

    }

}
