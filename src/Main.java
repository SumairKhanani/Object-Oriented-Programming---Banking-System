
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
public class Main implements Serializable
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        /*
        //Bank b = new Bank("Sumair Khanani", "IBA", "0321-2442121");
        //Customer c = new Customer("Sumair Khanani", "m.sumair.22995@khi.iba.edu.pk", "IBA", "0321-2442121", "42201-48757832");
        //Account a = new Account("Sumair Khanani", "m.sumair.22995@khi.iba.edu.pk", "IBA", "0321-2442121", "42201-48757832", "001", 55675, "Current");
        CurrentAccount ca = new CurrentAccount("Sumair Khanani", "m.sumair.22995@khi.iba.edu.pk", "IBA", "0321-2442121", "42201-48757832", "001", 55675, "Current", 1000);
        Statement s1 = new Statement("Sumair Khanani", "m.sumair.22995@khi.iba.edu.pk", "IBA", "0321-2442121", "42201-48757832", "001", 55675, "Current", "11 May 2021");
        
        System.out.println("Balance: " + s1.getBalance());
        System.out.println(s1.Show());
        ca.Withdraw(40000);
        ca.Deposit(75698);
        
        System.out.println("\n");
        
        SavingsAccount sa = new SavingsAccount("Usman Tirmizi", "usman.tirmizi@khi.iba.edu.pk", "IBA", "0333-2351347", "42201-56945012", "002", 78900, "Savings");
        Statement s2 = new Statement("Usman Tirmizi", "usman.tirmizi@khi.iba.edu.pk", "IBA", "0333-2351347", "42201-56945012", "002", 78900, "Savings", "11 May 2021");
        
        sa.setInterest(0.02);
        System.out.println(s2.Show());
        System.out.println("Total Amount after Interest: " + sa.TotalAmount());
*/
        AccountOpen o = new AccountOpen();
        o.show();
        
    }
    
    
}
