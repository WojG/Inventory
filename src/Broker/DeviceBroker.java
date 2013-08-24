/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Broker;

import Container.Device;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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

    public int updateDevice(int dID, Object o)
    {
        int rowsUpdated = 0;
        try
        {
            Connection connect = conn.use();

            Device dev = (Device) o;

            String SQL = "UPDATE device SET Brand = ?, "
                                         + "Model = ?, "
                                         + "Serial_Number = ?, "
                                         + "Computer_Name = ?, "
                                         + "Location = ?, "
                                         + "Asset_Tag = ?, "
                                         + "Cost = ?, "
                                         + "Start_Date = ?, "
                                         + "End_Date = ?, "
                                         + "Term = ? "
                       + "WHERE deviceID = " + dID + ";";

            PreparedStatement psUpdate = connect.prepareCall(SQL);

            psUpdate.setString(1, dev.getBrand());
            psUpdate.setString(2, dev.getModel());
            psUpdate.setString(3, dev.getSerialNumber());
            psUpdate.setString(4, dev.getComputerName());
            psUpdate.setString(5, dev.getLocation());
            psUpdate.setString(6, dev.getAssetTag());
            psUpdate.setInt(7, dev.getCost());
            psUpdate.setDate(8, dev.getStartDate());
            psUpdate.setDate(9, dev.getEndDate());
            psUpdate.setInt(10, dev.getTerm());

            rowsUpdated = psUpdate.executeUpdate();

            psUpdate.close();
            conn.release(connect);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DeviceBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowsUpdated;
    }
    
    public int deleteDevice(int dID)
    {
        int rowsDeleted = 0;
        try
        {
            Connection connect = conn.use();

            String SQL = "DELETE FROM device WHERE deviceID = " + dID + ";";

            PreparedStatement psDelete = connect.prepareCall(SQL);

            rowsDeleted = psDelete.executeUpdate();

            psDelete.close();
            conn.release(connect);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DeviceBroker.class.getName()).log(Level.SEVERE, null, ex);
        }

        return rowsDeleted;
    }
    
    public ArrayList<Device> getDevice()
    {
        ArrayList<Device> devs = new ArrayList();        
        try
        {
            Connection connect = conn.use();
            Statement stmt = connect.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM device");

            while (rs.next())
            {
                devs.add(new Device(rs.getString(2), rs.getString(3), 
                                    rs.getString(4), rs.getString(5), 
                                    rs.getString(6), rs.getString(7), 
                                    rs.getInt(8), rs.getDate(9), rs.getDate(10), 
                                    rs.getInt(11)));
            }

            conn.release(connect);
        }
        catch (SQLException ex)
        {
            Logger.getLogger(DeviceBroker.class.getName()).log(Level.SEVERE, null, ex);
        }       
        
        return devs;
    }
}
