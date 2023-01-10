import thirdPartyAPI.iciciBank.IciciBankAPI;
import thirdPartyAPI.yesBank.YesBankAPI;

public class YesBankApiAdapter implements  BankAPIAdapter{
    /* it creates the object of Icici Bank class */
    private YesBankAPI yesBankAPI = new YesBankAPI();
    @Override
    public double getBalance(String acct) {
        // Here it will call its own function that is written in Yes Bank API Class */
        double balance = 0.0;
        //balance = yesBankAPI.getBalance(acct)
        return balance;
    }

    @Override
    public boolean sendMoney(String acc1, String acc2, double money) {
        // here also it will its own method that is written by Yes bank API Class
        return false;
    }
}
