
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
public class CurrentAccount extends Account implements Serializable
{
    //protected float MinBal;
    
    public CurrentAccount(String Name, String Email, String Address, String Number, String NIC, String AccountNumber, float Balance, String AccountType)
    {
        super(Name, Email, Address, Number, NIC, AccountNumber, Balance, AccountType);
    }
}
