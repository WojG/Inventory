/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import Broker.DeviceBroker;
import Container.Device;

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
        
        Device d = new Device(0,"HP","Compaq","Test","Test","TE1226","Staff",1126,"2013/11/12","2016/11/12",36);
        
        int a = db.addDevice(d);
        
        System.out.println("Rows affected: " + a);
    }
}
