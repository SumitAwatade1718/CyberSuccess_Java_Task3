package Bank;

/**
 * Author: Sumit Vilas Awatade
 * Date: 23-May-2026
 */
public class SalaryAccount extends Account {

    public SalaryAccount(int id,String name,double balance) {
        super(id, name, balance);
    }

    @Override
    public void withdraw(double amount)throws InvalidBalanceException {
        if(balance - amount < 0) {
            throw new InvalidBalanceException(
                    "Salary Account balance cannot be negative");
        }
        balance = balance - amount;
        System.out.println(amount +" withdrawn from Salary Account");
    }
}
