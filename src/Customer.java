
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
public class Customer implements Serializable
{
   protected String Name;
   protected String Email; 
   protected String Address;
   protected String Number;
   protected String NIC;
    
    public Customer(String Name, String Email, String Address, String Number, String NIC)
    {
        this.Name = Name;
        this.Email = Email;
        this.Address = Address;
        this.Number = Number;
        this.NIC = NIC;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
    public void setEmail(String Email)
    {
        this.Email = Email;
    }
    public void setAddress(String Address)
    {
        this.Address = Address;
    }
    public void setNIC(String NIC)
    {
        this.NIC = NIC;
    }
    public String getName()
    {
        return Name;
    }
    public String getEmail()
    {
        return Email;
    }
    public String getAddress()
    {
        return Address;
    }
    public String getNIC()
    {
        return NIC;
    }    
}
