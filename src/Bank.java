
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
public class Bank implements Serializable
{
    private String Name;
    private String Address;
    private String Number;
    
    public Bank(String Name, String Address, String Number)
    {
        this.Name = Name;
        this.Address = Address;
        this.Number = Number;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }
    public void setAddress(String Address)
    {
        this.Address = Address;
    }
    public void setNumber(String Number)
    {
        this.Number = Number;
    }
    public String getName()
    {
        return Name;
    }
    public String getAddress()
    {
        return Address;
    }
    public String getNumber()
    {
        return Number;
    }
}
