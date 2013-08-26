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
public class Device
{

    private int cost, term, deviceID;
    private String brand, model, serialNumber, compName, location, assetTag;
    private Date start, end;

    public Device(int deviceID, String brand, String model, String serialNumber,
            String compName, String location, String assetTag, int cost, 
            Date start, Date end, int term)
    {
        this.deviceID = deviceID;
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.compName = compName;
        this.location = location;
        this.assetTag = assetTag;
        this.cost = cost;
        this.start = start;
        this.end = end;
        this.term = term;
    }
    
    public Device(String brand, String model, String serialNumber,
            String compName, String location, String assetTag, int cost, 
            Date start, Date end, int term)
    {
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.compName = compName;
        this.location = location;
        this.assetTag = assetTag;
        this.cost = cost;
        this.start = start;
        this.end = end;
        this.term = term;
    }

    public int getDeviceID()
    {
        return deviceID;
    }
    
    public void setBrand(String brand)
    {
        this.brand = brand;
    }

    public String getBrand()
    {
        return brand;
    }

    public void setModel(String model)
    {
        this.model = model;
    }

    public String getModel()
    {
        return model;
    }

    public void setSerialNumber(String serialNumber)
    {
        this.serialNumber = serialNumber;
    }

    public String getSerialNumber()
    {
        return serialNumber;
    }

    public void setComputerName(String computerName)
    {
        this.compName = computerName;
    }

    public String getComputerName()
    {
        return compName;
    }

    public void setLocation(String location)
    {
        this.location = location;
    }

    public String getLocation()
    {
        return location;
    }

    public void setAssetTag(String assetTag)
    {
        this.assetTag = assetTag;
    }

    public String getAssetTag()
    {
        return assetTag;
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
