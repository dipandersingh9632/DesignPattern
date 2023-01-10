public class Main {
    public static void main(String[] args) {
        Flipkart flipkart = Flipkart.getInstance();
        GenerateInvoice generateInvoice = new GenerateInvoice();
        Inventory inventory = new Inventory();
        SendEmail sendEmail = new SendEmail();

        flipkart.orderPlaced();
    }
}