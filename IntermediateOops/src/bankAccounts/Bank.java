package bankAccounts;
class BankAccount{
    private String accountHolder;
    private double balance;
    public BankAccount(String accountHolder, double balance){
        this.accountHolder=accountHolder;
        this.balance=balance;
    }

    public double getBalance() {
        return balance;
    }
}
class SavingsAccount extends BankAccount{
    private double fixedDeposits;
    public SavingsAccount(String accountHolder, double balance, double fixedDeposits){
        super(accountHolder,balance);
        this.fixedDeposits = fixedDeposits;
    }
    @Override
    public double getBalance(){
        return super.getBalance()+ fixedDeposits;
    }
}
class CurrentAccount extends BankAccount{
    private double cashCredit;
    public CurrentAccount(String accountHolder, double balance, double cashCredit){
        super (accountHolder,balance);
        this.cashCredit=cashCredit;
    }
    @Override
    public double getBalance(){
        return super.getBalance()+cashCredit;
    }
}
public class Bank {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount("John deo",50000,10000);
        CurrentAccount currentAccount= new CurrentAccount("Ram Jain",60000,5000);

        double totalCash= calculateTotalCash(savingsAccount,currentAccount);
        System.out.println("Total Cash in bank : $"+totalCash);
    }
    public static double calculateTotalCash(BankAccount... accounts){
        double totalCash= 0;
        for (BankAccount account:accounts){
            totalCash += account.getBalance();
        }
        return totalCash;
    }
}
