import thirdPartyAPI.iciciBank.IciciBankAPI;

public class ICICIBankApiAdapter implements  BankAPIAdapter{
    /* it creates the object of Icici Bank class */
    private IciciBankAPI iciciBankAPI = new IciciBankAPI();
    @Override
    public double getBalance(String acct) {
        // Here it will call its own function that is written in Icici Bank API Class */
        double balance = 0.0;
        //balance = iciciBankAPI.getBalance(acct)
        return balance;
    }

    @Override
    public boolean sendMoney(String acc1, String acc2, double money) {
        // here also it will its own method that is written by ICICI bank API Class
        return false;
    }
}
