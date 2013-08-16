/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Broker;

import Container.Device;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

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

    public int addDevice(Object o)
    {
        PreparedStatement ps = null;
        int numRowsAffected = 0;
        try
        {
            Connection connect = conn.use();
            Device dev = (Device) o;
            
            String SQL = "INSERT INTO device(deviceID, Brand, Model, Serial_Number, Computer_Name, Location, Asset_Tag, Cost, Start_Date, End_Date, Term) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            ps = connect.prepareStatement(SQL);
            ps.setInt(1, dev.getDeviceID());
            ps.setString(2, dev.getBrand());
            ps.setString(3, dev.getModel());
            ps.setString(4, dev.getSerialNumber());
            ps.setString(5, dev.getComputerName());
            ps.setString(6, dev.getLocation());
            ps.setString(7, dev.getAssetTag());
            ps.setInt(8, dev.getCost());
            ps.setString(9, dev.getStartDate());
            ps.setString(10, dev.getEndDate());
            ps.setInt(11, dev.getTerm());
            
            numRowsAffected = ps.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DeviceBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return numRowsAffected;
    }
}
