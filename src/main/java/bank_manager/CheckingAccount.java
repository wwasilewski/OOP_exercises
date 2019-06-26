package bank_manager;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.06.2019
 */
public class CheckingAccount extends BankAccount {

    private double limit;

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        this.limit = limit;
    }
}
