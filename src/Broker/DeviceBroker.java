/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Broker;

import Container.Device;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

    protected DeviceBroker()
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
        int rowsAdded = 0;
        try
        {
            Connection connect = conn.use();
           
            Device dev = (Device) o;
            
            String SQL = "INSERT INTO device(Brand, Model, Serial_Number, Computer_Name, Location, Asset_Tag, Cost, Start_Date, End_Date, Term) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement ps = connect.prepareStatement(SQL);
            
            ps.setString(1, dev.getBrand());
            ps.setString(2, dev.getModel());
            ps.setString(3, dev.getSerialNumber());
            ps.setString(4, dev.getComputerName());
            ps.setString(5, dev.getLocation());
            ps.setString(6, dev.getAssetTag());
            ps.setInt(7, dev.getCost());
            ps.setDate(8, dev.getStartDate());
            ps.setDate(9, dev.getEndDate());
            ps.setInt(10, dev.getTerm());
            
            rowsAdded = ps.executeUpdate();
            
            ps.close();
            conn.release(connect);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DeviceBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rowsAdded;
    }
    
    public int updateDevice(int dID)
    {
        int rowsUpdated = 0;
        try
        {
            Connection connect = conn.use();
            
            Device dev = (Device) o;
            
            String SQL = "UPDATE device SET Brand = ?, Model = ?, Serial_Number = ?,"
                       + "Computer_Name = ?, Location = ?, Asset_Tag = ?, Cost = ?, "
                       + "Start_Date = ?, End_Date = ?, Term = ?"
                       + "WHERE deviceID = " + dID + ""; 
            
            CallableStatement csUpdate = connect.prepareCall(SQL);
            
            csUpdate.setString(1, dev.getBrand());
            csUpdate.setString(2, dev.getModel());
            csUpdate.setString(3, dev.getSerialNumber());
            csUpdate.setString(4, dev.getComputerName());
            csUpdate.setString(5, dev.getLocation());
            csUpdate.setString(6, dev.getAssetTag());
            csUpdate.setInt(7, dev.getCost());
            csUpdate.setDate(8, dev.getStartDate());
            csUpdate.setDate(9, dev.getEndDate());
            csUpdate.setInt(10, dev.getTerm());
            
            rowsUpdated = csUpdate.executeUpdate();
            
            csUpdate.close();
            conn.release(connect);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DeviceBroker.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return rowsUpdated;
    }
}
