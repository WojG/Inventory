/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import Container.Device;
import Controller.DeviceController;
import Interface.Interface;
import java.sql.Date;
import javax.swing.SwingUtilities;
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
        
        String brand = "Asus";
        String model = "N53SV";
        String sn = "Test";
        String compName = "Test";
        String location = "TE1226";
        String assetTag = "Staff";
        int cost = 1126;
        Date start = sqlDate;
        Date end = sqlDate;
        int term = 36;
        
        String locationNew = "CB2014";
        
     /*   DeviceController dc = new DeviceController(brand, model, sn, compName, 
                                                   locationNew, assetTag, cost, 
                                                   start, end, term);*/
     //   dc.addDevice();
        
       // String brandNew = "Lenovo";
        
      //  dc.updateDevice(2);
   //    DeviceController dc = new DeviceController();
    //   dc.deleteDevice(2);
        
        SwingUtilities.invokeLater(new Runnable()
        {
            @Override
            public void run()
            {
                Interface i = new Interface();
                i.createAndShowGUI();
            }
        });
    }
}
