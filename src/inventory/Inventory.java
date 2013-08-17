/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import Broker.DeviceBroker;
import Container.Device;
import com.sun.org.apache.xerces.internal.impl.dv.xs.MonthDV;
import com.sun.org.apache.xerces.internal.impl.dv.xs.YearDV;
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
        
        
        
      //  Device d = new Device("HP","Compaq","Test","Test","TE1226","Staff",1126,"2013/11/12","2016/11/12",36);
        
      //  int a = db.addDevice(d);
        
     //   System.out.println("Rows affected: " + a);
    }
}
