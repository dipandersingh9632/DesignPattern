public class Inventory implements Subsriber{

    public Inventory(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.register(this);
    }
    @Override
    public void notification() {
        System.out.println("Updating Inventory");
    }
}
