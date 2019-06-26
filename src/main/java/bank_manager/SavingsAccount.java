package bank_manager;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.06.2019
 */
public class SavingsAccount extends BankAccount {

    private int transfers;

    public int getTransfers() {
        return transfers;
    }

    public void setTransfers(int transfers) {
        this.transfers = transfers;
    }
}
