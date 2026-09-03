public class BankAccount {
    //Variables
    private String bankHolderName;
    private int accountNumber;
    private double balance;
    //Getters
    public String getName(){
        return bankHolderName;
    }
    public int getNumber(){
        return accountNumber;
    }
    public double getBalance(){
        return balance;
    }
    //Setters
    public void setName(String Name){
        this.bankHolderName = Name;
    }
    public void setNumber(int Number){
        this.accountNumber = Number;
    }
    public void setBalance(double Balance){
        this.balance = Balance;
    }
    //Methods
    public void Deposit(double amount){
        if(amount>0){
            balance += amount;
        }
    }
    public void Withdraw(double amount){
        if(amount>0 && balance>=amount){
            balance = balance - amount;
        }
    }
    public void displayInfo(){
        String Name = this.getName();
        System.out.println(Name);
        int Number = this.getNumber();
        System.out.println(Number);
        double Balance = this.getBalance();
        System.out.println(Balance);
    }
    
    public static void main(String[] args){
        BankAccount A = new BankAccount();
        A.setName("Yugal Kaushik");
        A.setNumber(10867);
        A.setBalance(7000);
        A.displayInfo();
        A.Deposit(700);
        A.displayInfo();
        A.Withdraw(2200);
        A.displayInfo();
    }
}
