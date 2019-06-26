package bank_manager;

import java.sql.Date;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.06.2019
 */
public class Main {

    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.setAccountNumber("123-456");
        ba.setBalance(1000d);
        System.out.println("Account number: " + ba.getAccountNumber());
        System.out.println("Balance: " + ba.getBalance());

        CertificateOfDeposit cod = new CertificateOfDeposit();
        cod.setExpiry(Date.valueOf("2020-2-2"));
        System.out.println("COD expiration date: " + cod.getExpiry());

        CheckingAccount ca = new CheckingAccount();
        ca.setLimit(50d);
        System.out.println("Limit: " + ca.getLimit());

        SavingsAccount sa = new SavingsAccount();
        sa.setTransfers(12);
        System.out.println("Transfers: " + sa.getTransfers());
    }
}
