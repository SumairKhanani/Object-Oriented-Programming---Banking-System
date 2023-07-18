
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
public class SavingsAccount extends Account implements Serializable
{
    protected double Interest;
    protected float Total;
    
    public SavingsAccount(String Name, String Email, String Address, String Number, String NIC, String AccountNumber, float Balance, String AccountType)
    {
        super(Name, Email, Address, Number, NIC, AccountNumber, Balance, AccountType);
    }
    public void setInterest(double Interest)
    {
        this.Interest = Interest;
    }
    public double getInterest()
    {
        return Interest;
    }
    public float TotalAmount()
    {
        Total = (float) ((super.getBalance() * getInterest()) + super.Balance);
        return Total;
    }
}
