package eu.sig.training.ch04;

public class Transfer {
    CheckingAccount counterAccount;

    public Transfer(CheckingAccount acct1, CheckingAccount acct2, Money m) {}

    public Transfer(SavingsAccount acct1, CheckingAccount acct2, Money m) {}

    public CheckingAccount getCounterAccount() {
        return this.counterAccount;
    }
}
