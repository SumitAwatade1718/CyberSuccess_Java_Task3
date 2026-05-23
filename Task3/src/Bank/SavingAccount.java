package Bank;
/**
 * Author: Sumit Vilas Awatade
 * Date: 23-May-2026
 */
public class SavingAccount extends Account {
   
    public SavingAccount(int id, String name, double balance) {
        super(id, name, balance);
    }
    
    @Override
    public void withdraw(double amount)throws InvalidBalanceException {
              if(balance - amount < 500) {

               new InvalidBalanceException("Minimum balance should be Rs 500");
        }
        balance = balance - amount;
        System.out.println(amount +" withdrawn from Saving Account");
    }
}
