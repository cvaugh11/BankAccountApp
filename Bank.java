import java.util.LinkedList;
import java.util.List;

public class Bank {
  public static void main(String[] args) {

    List<Account> accounts = new LinkedList<Account>();

    String file = "original.csv";
    List<String[]> newAccountHolders = utilities.CSV.read(file);
    for (String[] accountHolder : newAccountHolders) {
      String name = accountHolder[0];
      String ssn = accountHolder[1];
      String accountType = accountHolder[2];
      double deposit = Double.parseDouble(accountHolder[3]);
      if (accountType.equals("Checking")) {
        accounts.add(new Checking(name, ssn, deposit));
      } else if (accountType.equals("Savings")) {
        accounts.add(new Savings(name, ssn, deposit));
      } else {
        System.out.println("Invalid account type.");
      }
      for (Account acc : accounts) {
        acc.showInfo();
        System.out.println("\n");
      }
    }

  }
}