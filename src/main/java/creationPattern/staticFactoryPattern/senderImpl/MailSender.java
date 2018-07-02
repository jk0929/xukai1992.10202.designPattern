package creationPattern.staticFactoryPattern.senderImpl;


import creationPattern.staticFactoryPattern.Sender;

public class MailSender implements Sender {
    @Override
    public void Send() {
        System.out.println("this is mailsender!");
    }


}
