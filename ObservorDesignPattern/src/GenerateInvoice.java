public class GenerateInvoice implements Subsriber{

    public GenerateInvoice(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.register(this);
    }
    @Override
    public void notification() {
        System.out.println("Generating invoice");
    }
}
