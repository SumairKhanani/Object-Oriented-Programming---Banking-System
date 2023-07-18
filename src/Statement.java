
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dell
 */
public class Statement extends Account implements Serializable
{
    private String Date;
    public Statement(String Name, String Email, String Address, String Number, String NIC, String AccountNumber, float Balance, String AccountType, String Date)
    {
        super(Name, Email, Address, Number, NIC, AccountNumber, Balance, AccountType);
        this.Date = Date;
    }
    public void setDate(String Date)
    {
        this.Date = Date;
    }
    public String getDate()
    {
        return Date;
    }
    public String Show()
    {
        return "Name: " + this.Name + "\n" + "Email: " + super.Email + "\n" + "Address: " + super.Address + "\n" + "Number: " + super.Number + "\n" + "Date: " + Date + "\n" + "NIC: " + super.NIC + "\n" + "Account Number: " + super.getAccountNumber() + "\n" + "Balance: " + super.getBalance() + "\n" + "Account Type: " + super.getAccountType();
    }
}
