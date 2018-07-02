package creationPattern.staticFactoryPattern;

import creationPattern.staticFactoryPattern.senderImpl.MailSender;
import creationPattern.staticFactoryPattern.senderImpl.SmsSender;

public class SenderFactory {


    public static Sender produceMail(){
        return  new MailSender();
    }

    public static Sender produceSms(){
        return  new SmsSender();
    }

}
