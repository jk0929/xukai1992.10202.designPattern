package creationPattern.abstractFactoryPartten.senderImpl;

import creationPattern.abstractFactoryPartten.Sender;

public class SmsSender implements Sender {

    @Override
    public void send() {
        System.out.println("this is sms sender!");
    }
}
