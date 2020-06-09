public class Checking extends Account {
  // list specific properties
  private int debitCardNum, debitCardPin;

  // constructor
  Checking(String name, String ssn, double deposit) {
    super(name, ssn, deposit);
    accountNum = "1" + accountNum;
    setCard();
  }

  @Override
  public void setRate() {
    rate = getBaseRate() * .15;
  }

  // list specific methods
  private void setCard() {
    debitCardNum = (int) (Math.random() * Math.pow(10, 12));
    debitCardPin = (int) (Math.random() * Math.pow(10, 4));
  }

  public void showInfo() {
    System.out.println("Account Type: Checking");
    super.showInfo();
    System.out.println("Your Checking Account features" + "\n  Debit Card Number: " + debitCardNum
        + "\n  Debit Card PIN: " + debitCardPin);

  }
}