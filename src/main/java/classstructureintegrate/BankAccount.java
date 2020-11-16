package classstructureintegrate;

public class BankAccount {

    private String accountNumber;
    private String owner;
    private int balace;

    public BankAccount(String accountNumber, String owner, int balace) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.balace = balace;
    }

    public void deposit(int amount) {
        balace += amount;
    }

    public void withdraw(int amount) {
        balace -= amount;
    }

    public void transfer(String BankAccount, int amount) {


    }

    public String getInfo() {
         String coolectInfo = getOwner() + " (" + getAccountNumber() + "): " + getBalace();
         return coolectInfo;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getBalace() {
        return balace;
    }

    public void setBalace(int balace) {
        this.balace = balace;
    }
}


