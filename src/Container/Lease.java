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
public class Lease
{
    private int leaseID, cost, term;
    private Date start, end;
    
    public Lease(int leaseID, int cost, Date start, Date end, int term)
    {
        this.leaseID = leaseID;
        this.cost = cost;
        this.start = start;
        this.end = end;
        this.term = term;
    }
    
    public void setLeaseID(int leaseID)
    {
        this.leaseID = leaseID;
    }
    
    public int getLeaseID()
    {
        return leaseID;
    }
    
    public void setCost(int cost)
    {
        this.cost = cost;
    }
    
    public int getCost()
    {
        return cost;
    }
    
    public void setStartDate(Date start)
    {
        this.start = start;
    }
    
    public Date getStartDate()
    {
        return start;
    }
    
    public void setEndDate(Date end)
    {
        this.end = end;
    }
    
    public Date getEndDate()
    {
        return end;
    }
    
    public void setTerm(int term)
    {
        this.term = term;
    }
    
    public int getTerm()
    {
        return term;
    }
}
