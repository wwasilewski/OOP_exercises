package bank_manager;

import java.util.Date;

/**
 * @author Wojciech Wasilewski
 * @date Created on 26.06.2019
 */
public class CertificateOfDeposit extends BankAccount {

    private Date expiry;

    public Date getExpiry() {
        return expiry;
    }

    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }
}
