public abstract class Account implements IBaseRate {
  private String name, ssn;
  private double balance;

  private static int index = 1000;
  protected String accountNum;
  protected double rate;

  
  public Account(String name, String ssn, double deposit) {
    this.name = name;
    this.ssn = ssn;
    this.balance = deposit;
    index++;
    this.accountNum = setAccountNum();
    setRate();
  }

  public abstract void setRate();

  private String setAccountNum() {
    String lastTwoOfSsn = ssn.substring(ssn.length() - 2, ssn.length());
    int uniqueId = index;
    int randomNum = (int) (Math.random() * Math.pow(10, 3));
    return lastTwoOfSsn + uniqueId + randomNum;
  }

  public void compound() {
    double interest = balance * (rate / 100);
    balance = balance + interest;
    System.out.println("Accrued Interest: $" + interest);
    printBalance();
  }

  public void deposit(double amount) {
    balance = balance + amount;
    System.out.println("Depositing $ " + amount);
    printBalance();
  }

  public void withdraw(double amount) {
    balance = balance - amount;
    System.out.println("Withdrawing $ " + amount);
    printBalance();
  }

  public void transfer(String where, double amount) {
    balance = balance - amount;
    System.out.println("Transferring $" + amount + " to " + where);
    printBalance();
  }

  public void printBalance() {
    System.out.println("Your balance is now $" + balance);
  }

  public void showInfo() {
    System.out.println(
        "Name: " + name + "\nAccount Number: " + accountNum + "\nBalance: " + balance + "\nRate: " + rate + "%");
  }
}