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
            
            String SQL = "INSERT INTO Device (Brand, Model, Serial Number, Computer Name, Location, Asset Tag, Lease) VALUES (?, ?, ?, ?, ?, ?, ?)";

            ps = connect.prepareStatement(SQL);
            ps.setString(1, dev.getBrand());
            ps.setString(2, dev.getModel());
            ps.setString(3, dev.getSerialNumber());
            ps.setString(4, dev.getComputerName());
            ps.setString(5, dev.getLocation());
            ps.setString(6, dev.getAssetTag());
            ps.setInt(7, dev.getLease());
            
            numRowsAffected = ps.executeUpdate();
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DeviceBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
                
        return numRowsAffected;
    }
}
