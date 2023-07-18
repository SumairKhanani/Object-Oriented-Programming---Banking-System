
import java.io.Serializable;
import java.util.ArrayList;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Dell
 */
public class Account extends Customer implements Serializable
{
    protected  static ArrayList<Account> accountlist=new ArrayList<>();
    protected String AccountNumber;
    protected float Balance;
    protected  String AccountType;
    protected static ArrayList<Integer> list=new ArrayList<>();
    public Account(String Name, String Email, String Address, String Number, String NIC, String AccountNumber, float Balance, String AccountType) 
    {
        super(Name, Email, Address, Number, NIC);
        this.AccountNumber = AccountNumber;
        this.Balance = Balance;
        this.AccountType = AccountType;
    
    }
    public void setAccountNumber(String AccountNumber)
    {
        this.AccountNumber = AccountNumber;
    }
    public void setBalance(float Balance)
    {
        this.Balance = Balance;
    }
    public void setAccountType(String AccountType)
    {
        this.AccountType = AccountType;
    }
   
    public String getAccountNumber()
    {
        return AccountNumber;
    }
    public float getBalance()
    {
        return Balance;
    }
    public String getAccountType()
    {
        return AccountType;
    }
    public int Withdraw(float Amount)
    { 
        if (Balance > Amount)
        {
            this.Balance -= Amount;
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public void Deposit(float Amount)
    {
         this.Balance += Amount;
    }
}
