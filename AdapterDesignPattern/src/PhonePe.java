public class PhonePe {
    BankAPIAdapter bankApi;
    /* so here in constructor we define that wether the bankApi is of yesbank or of Icici
    and PhonePe don't even need to know he just have to call the function written in BankApi
    and if BankApi is of yesBank object type then yesBank ApiAdapter class methods get called and
    this is all we want
     */

    public PhonePe(BankAPIAdapter bankApi){
        this.bankApi = bankApi;
    }

    public double moneyDouble() throws InterruptedException {
        // 25 din me paisa double
        double currBalance = bankApi.getBalance("acct number");
        Thread.sleep(25L * 24 * 60 * 60 * 1000);
        return currBalance * 2;
    }
}
