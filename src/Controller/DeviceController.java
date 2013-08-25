/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Broker.DeviceBroker;
import Container.Device;
import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Woj G
 */
public class DeviceController
{

    private String brand, model, serialNumber, compName, location, assetTag;
    private int cost, term;
    private Date start, end;
    
    public DeviceController()
    {
        // default constructor
    }
    
    public DeviceController(String brand, String model, String serialNumber,
            String compName, String location, String assetTag,
            int cost, Date start, Date end, int term)
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

    public void addDevice()
    {
        Device dev = new Device(brand, model, serialNumber, compName, location, 
                                assetTag, cost, start, end, term);
        
        DeviceBroker dBroker = DeviceBroker.getDeviceBroker();
        
        if (dBroker.addDevice(dev) > 0)
        {
            System.out.println("Row Added Successfully.");
        }
      /*  else
        {
            System.out.println("Error in add device broker.");
        }*/
    }

    public void updateDevice(int dID)
    {
        Device dev = new Device(brand, model, serialNumber, compName, location,
                assetTag, cost, start, end, term);

        DeviceBroker dBroker = DeviceBroker.getDeviceBroker();

        if (dBroker.updateDevice(dID, dev) > 0)
        {
            System.out.println("Row Updated Successfully.");
        }
        
     /*   else   
        {
            System.out.println("Error in update device broker");
        }*/

    }
    
    public void deleteDevice(int dID)
    {
        DeviceBroker dBroker = DeviceBroker.getDeviceBroker();

        if (dBroker.deleteDevice(dID) > 0)
        {
            System.out.println("Row Deleted Successfully.");
        }
        
    /*    else   
        {
            System.out.println("Error in delete device broker");
        }*/

    }
    
    public ArrayList<Device> getDevice()
    {        
        return DeviceBroker.getDeviceBroker().getDevice();
    }
}
