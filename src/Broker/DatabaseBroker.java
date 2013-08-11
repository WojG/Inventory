/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Broker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author WojG
 */
public class DatabaseBroker
{

    private String host = "jdbc:mysql://localhost:3306/asset management";
    private String username = "root";
    private String password = "P@$$w0rd";
    private final int MAX_POOL = 5;
    private boolean connected;
    private Queue<Connection> connectionPool = new LinkedList();

    public DatabaseBroker()
    {
        createNewConnection();
        createConnectionPool();
    }

    // establish connection with database
    private Connection createNewConnection()
    {
        Connection connect = null;
        try
        {
            connect = DriverManager.getConnection(host, username, password);
            connected = true;
        }
        catch (SQLException err)
        {
            System.out.println("Error trying to establish connection with db: " + err.getMessage());
            connected = false;
        }
        return connect;
    }

    // create specified number of connections
    private void createConnectionPool()
    {
        if (connected)
        {
            while (connectionPool.size() < MAX_POOL)
            {
                connectionPool.add(createNewConnection());
            }
            System.out.println("Connection pool created: " + connectionPool.size());
        }
        else
        {
            System.out.println("Pool allocation: " + connectionPool.size());
        }
    }

    // use connection
    public Connection use()
    {
        Connection connect = null;
        if (connectionPool.size() > 0) 
        {
             connect = connectionPool.poll();
             System.out.println("Use: " + connectionPool.size());
        }                
        else 
            System.out.println("Connection pool is empty. Check database.");        
        return connect;
    }

    // put back connection
    public void release(Connection connect)
    {
        connectionPool.add(connect);
        System.out.println("Release: " + connectionPool.size());
    }
}
