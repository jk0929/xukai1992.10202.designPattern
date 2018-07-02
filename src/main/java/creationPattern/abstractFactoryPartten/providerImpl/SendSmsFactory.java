package creationPattern.abstractFactoryPartten.providerImpl;

import creationPattern.abstractFactoryPartten.Provider;
import creationPattern.abstractFactoryPartten.Sender;
import creationPattern.abstractFactoryPartten.senderImpl.SmsSender;

public class SendSmsFactory implements Provider {

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}