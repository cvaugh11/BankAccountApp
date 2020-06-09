public class Savings extends Account {
  private int safetyDepositBoxId, safetyDepositBoxKey;

  public Savings(String name, String ssn, double deposit) {
    super(name, ssn, deposit);
    accountNum = "2" + accountNum;
    setBoxNum();
  }

  @Override
  public void setRate() {
    rate = getBaseRate() - .25;
  }

  private void setBoxNum() {
    safetyDepositBoxId = (int) (Math.random() * Math.pow(10, 3));
    safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
  }

  public void showInfo() {
    System.out.println("Account Type: Savings");
    super.showInfo();
    System.out.println("Savings Account Details" + "\n  Safety Deposit Box ID: " + safetyDepositBoxId
        + "\n  Safety Deposit Box Key: " + safetyDepositBoxKey);
  }
}