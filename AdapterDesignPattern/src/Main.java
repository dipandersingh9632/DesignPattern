public class Main {
    public static void main(String[] args) throws InterruptedException {
        // Creating an object of YesBankAPI Adapter that I will pass in PhonePe Constructor
        BankAPIAdapter yesbankAPIAdapter = new YesBankApiAdapter();
        PhonePe obj = new PhonePe(yesbankAPIAdapter);
        double money = obj.moneyDouble();
        System.out.println(money);

    }
}