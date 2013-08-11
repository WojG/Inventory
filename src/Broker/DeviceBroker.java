/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Broker;

import Container.Device;
import java.sql.Connection;

/**
 *
 * @author Woj G
 */
public class DeviceBroker
{

    private static DeviceBroker dBroker = null;
    DatabaseBroker conn = new DatabaseBroker();

    private DeviceBroker()
    {
    }

    public static DeviceBroker getDeviceBroker()
    {
        if (dBroker == null)
        {
            dBroker = new DeviceBroker();
        }
        return dBroker;
    }

    public void addDevice(Object o)
    {
        Connection connect = conn.use();
        Device dev = (Device) o;
        
        
    }
}
