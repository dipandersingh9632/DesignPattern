public interface BankAPIAdapter {
    double getBalance(String acct);
    boolean sendMoney(String acc1, String acc2, double money);

}
