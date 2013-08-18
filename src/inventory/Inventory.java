/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import Controller.DeviceController;
import java.sql.Date;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author WojG
 */
public class Inventory
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {        
        int year = 2013, month = 11, day = 12;
        
        DateTime dt = new DateTime(year, month, day, 12, 0, 0, 000);
        
        DateTimeFormatter fmt = DateTimeFormat.forPattern("YYYY/MM/dd");
        
        Date sqlDate = new Date(dt.getMillis());
        
        String brand = "HP";
        String model = "Compaq";
        String sn = "Test";
        String compName = "Test";
        String location = "TE1226";
        String assetTag = "Staff";
        int cost = 1126;
        Date start = sqlDate;
        Date end = sqlDate;
        int term = 36;
        
        DeviceController dc = new DeviceController();
       // dc.addDevice(brand, model, sn, compName, location, assetTag, cost, start, end, term);
        
       // String brandNew = "Lenovo";
        
       // dc.updateDevice(2, brandNew, model, sn, compName, location, assetTag, cost, start, end, term);
       dc.deleteDevice(2);
    }
}
