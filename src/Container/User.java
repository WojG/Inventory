/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Container;

import java.sql.Date;

/**
 *
 * @author Woj G
 */
public class User
{
    private String userID, fname, lname, address;
    private Date dob;
    private int device;
    
    public User(String userID, String fname, String lname, 
                  Date dob, String address, int device)
    {
        this.userID = userID;
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.address = address;
        this.device = device;
    }
    
    public void setUserID(String userID)
    {
        this.userID = userID;
    }
    
    public String getUserID()
    {
        return userID;
    }
    
    public void setFname(String fname)
    {
        this.fname = fname;
    }
    
    public String getFname()
    {
        return fname;
    }
    
    public void setLname(String lname)
    {
        this.lname = lname;
    }
    
    public String getLname()
    {
        return lname;
    }
    
    public void setDob(Date dob)
    {
        this.dob = dob;
    }
    
    public Date getDob()
    {
        return dob;
    }
    
    public void setAddress(String address)
    {
        this.address = address;
    }
    
    public String getAddress()
    {
        return address;
    }
    
    public void setDevice(int device)
    {
        this.device = device;
    }
    
    public int getDevice()
    {
        return device;
    }
}
