package Bank;

/**
 * Author: Sumit Vilas Awatade
 * Date: 23-May-2026
 */
import java.util.ArrayList;

public class Client {

    public static void main(String[] args) {

        try {

            SavingAccount s1 = new SavingAccount(1, "Sumit", 5000);

            SalaryAccount s2 = new SalaryAccount(2, "Rahul", 3000);

            System.out.println("===== Saving Account =====");

            s1.showBalance();

            s1.deposit(1000);

            s1.withdraw(4000);

            s1.showBalance();

            System.out.println("\n===== Salary Account =====");

            s2.showBalance();

            s2.deposit(2000);

            s2.withdraw(4000);

            s2.showBalance();

            ArrayList<SalaryAccount> list = new ArrayList<>();

            list.add(new SalaryAccount(101, "A", 10000));

            list.add(new SalaryAccount(102, "B", 15000));

            list.add(new SalaryAccount(103, "C", 12000));

            list.add(new SalaryAccount(104, "D", 18000));

            list.add(new SalaryAccount(105, "E", 20000));

            double totalBalance = 0;

            for(SalaryAccount acc : list) {
                totalBalance = totalBalance + acc.getBalance();
            }
            System.out.println("\nTotal Balance of all salaried people = " + totalBalance);
        }catch (InvalidBalanceException e) {
            System.out.println("Exception : " + e.getMessage());
        }
    }
}