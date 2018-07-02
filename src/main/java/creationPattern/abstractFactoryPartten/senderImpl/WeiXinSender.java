package creationPattern.abstractFactoryPartten.senderImpl;

import creationPattern.abstractFactoryPartten.Sender;

public class WeiXinSender implements Sender {
    @Override
    public void send() {
        System.out.println("this is WeiXin sender!");
    }
}
