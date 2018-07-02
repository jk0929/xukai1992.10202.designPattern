package creationPattern.abstractFactoryPartten.senderImpl;

import creationPattern.abstractFactoryPartten.Sender;

public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is mailsender!");
    }
}
