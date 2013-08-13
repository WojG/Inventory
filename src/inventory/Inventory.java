/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import Broker.DatabaseBroker;
import Broker.DeviceBroker;
import Container.Device;
import com.mysql.jdbc.exceptions.DeadlockTimeoutRollbackMarker;
import java.sql.Connection;

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
        
        Device d = new Device(0,"HP", "Compaq","CAC","TE1226-01PC","TE1226","Staff",2010);
        
        int a = db.addDevice(d);
        
        System.out.println("Rows affected: " + a);
    }
}
