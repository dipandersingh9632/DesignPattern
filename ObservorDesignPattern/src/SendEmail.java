public class SendEmail implements Subsriber{

    public SendEmail() {
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.register(this);
    }
    @Override
    public void notification() {
        System.out.println("Sending Email");
    }
}
