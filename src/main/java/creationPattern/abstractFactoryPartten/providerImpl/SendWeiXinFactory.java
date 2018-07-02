package creationPattern.abstractFactoryPartten.providerImpl;

import creationPattern.abstractFactoryPartten.Provider;
import creationPattern.abstractFactoryPartten.Sender;
import creationPattern.abstractFactoryPartten.senderImpl.WeiXinSender;

public class SendWeiXinFactory implements Provider {
    @Override
    public Sender produce() {
        return new WeiXinSender();
    }
}
