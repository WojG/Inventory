/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Broker.DeviceBroker;
import Container.Device;
import java.sql.Date;

/**
 *
 * @author Woj G
 */
public class DeviceController
{
    public DeviceController()
    {
        
    }
    
    public void addDevice(String brand, String model, String serialNumber, 
                          String compName, String location, String assetTag,
                          int cost, Date start, Date end, int term) 
    {
        Device dev = new Device(brand, model, serialNumber,compName,
                                location,assetTag,cost,start,end,term);
        
        DeviceBroker dBroker = DeviceBroker.getDeviceBroker();
        
        if (dBroker.addDevice(dev) > 0) 
        {
            System.out.println("Row Added Successfully.");
        }
        
        else
            System.out.println("Error in device broker.");        
    }
}
