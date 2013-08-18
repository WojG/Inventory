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
        Device dev = new Device(brand, model, serialNumber, compName,
                location, assetTag, cost, start, end, term);

        DeviceBroker dBroker = DeviceBroker.getDeviceBroker();

        if (dBroker.addDevice(dev) > 0)
        {
            System.out.println("Row Added Successfully.");
        }
        else
        {
            System.out.println("Error in add device broker.");
        }
    }

    public void updateDevice(int dID, String brand, String model, String serialNumber,
            String compName, String location, String assetTag,
            int cost, Date start, Date end, int term)
    {
        Device dev = new Device(brand, model, serialNumber, compName, location,
                assetTag, cost, start, end, term);

        DeviceBroker dBroker = DeviceBroker.getDeviceBroker();

        if (dBroker.updateDevice(dID, dev) > 0)
        {
            System.out.println("Row Updated Successfully.");
        }
        
        else   
        {
            System.out.println("Error in update device broker");
        }

    }
    
    public void deleteDevice(int dID)
    {
        DeviceBroker dBroker = DeviceBroker.getDeviceBroker();

        if (dBroker.deleteDevice(dID) > 0)
        {
            System.out.println("Row Deleted Successfully.");
        }
        
        else   
        {
            System.out.println("Error in delete device broker");
        }

    }
}
