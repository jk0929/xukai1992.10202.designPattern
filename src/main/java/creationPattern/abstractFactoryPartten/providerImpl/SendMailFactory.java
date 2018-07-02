package creationPattern.abstractFactoryPartten.providerImpl;

import creationPattern.abstractFactoryPartten.Provider;
import creationPattern.abstractFactoryPartten.Sender;
import creationPattern.abstractFactoryPartten.senderImpl.MailSender;

public class SendMailFactory implements Provider {

    @Override
    public Sender produce(){
        return new MailSender();
    }
}