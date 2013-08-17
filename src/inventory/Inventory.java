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
        DeviceBroker db = DeviceBroker.getDeviceBroker();
        
        int year = 2013, month = 11, day = 12;
        DateTime dt = new DateTime(year, month, day, 12, 0, 0, 000);
        
        
        Device d = new Device("HP","Compaq","Test","Test","TE1226","Staff",1126,"2013/11/12","2016/11/12",36);
        
        int a = db.addDevice(d);
        
        System.out.println("Rows affected: " + a);
    }
}
