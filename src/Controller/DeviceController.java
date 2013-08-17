/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Broker.DeviceBroker;

/**
 *
 * @author Woj G
 */
public class DeviceController
{
    public DeviceController()
    {
        
    }
    
    public void addDevice(Object o) 
    {
        DeviceBroker dBroker = DeviceBroker.getDeviceBroker();
        
        if (dBroker.addDevice(o) > 0) 
        {
            System.out.println("Row Added Successfully.");
        }
        
        else
            System.out.println("Error in device broker.");        
    }
}
