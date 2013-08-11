/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory;

import Broker.DatabaseBroker;
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
        DatabaseBroker dbB = new DatabaseBroker();
        Connection connect = dbB.use();
        dbB.release(connect);
    }
}
