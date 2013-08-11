/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Container;

/**
 *
 * @author Woj G
 */
public class Device
{
    private int deviceID, lease;
    private String brand, model, serialNumber, compName, location, assetTag;
    
    public Device(int deviceID, String brand, String model, String serialNumber, 
                  String compName, String location, String assetTag, int lease)
    {
        this.deviceID = deviceID;
        this.brand = brand;
        this.model = model;
        this.serialNumber = serialNumber;
        this.compName = compName;
        this.location = location;
        this.assetTag = assetTag;
        this.lease = lease;
    }
    
    public void setDeviceID(int deviceID)
    {
        this.deviceID = deviceID;
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
    
    public void setLease(int lease)
    {
        this.lease = lease;
    }
    
    public int getLease()
    {
        return lease;
    }
}
