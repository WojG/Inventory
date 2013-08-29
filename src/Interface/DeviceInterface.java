/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controller.DeviceModelController;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import net.miginfocom.swing.MigLayout;

/**
 *
 * @author Woj G
 */
public class DeviceInterface
{
    private JPanel devicePanel, tablePanel, buttonPanel;
    private JButton add, update, delete;
    private JTable table;
    private JScrollPane scrollPane;
    
    public DeviceInterface()
    {
        
    }
    
    public JPanel deviceButtons()
    {
        add = new JButton("Add");
        update = new JButton("Update");
        delete = new JButton("Delete");
        
        buttonPanel = new JPanel(new MigLayout("",
                                               "",
                                               "[]10[]10[]"));
        buttonPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        buttonPanel.add(add, "growx,wrap");
        buttonPanel.add(update, "growx,wrap");
        buttonPanel.add(delete, "growx");
        
        return buttonPanel;
    }
    
    public JPanel deviceTable()
    {        
        table = new JTable(new DeviceModelController());        
        scrollPane = new JScrollPane(table);
        
        tablePanel = new JPanel(new MigLayout());
        tablePanel.setBorder(BorderFactory.createLineBorder(Color.yellow));
        tablePanel.add(scrollPane);
        
        return tablePanel;
    }
    
    public JPanel createDevicePanel()
    {
        devicePanel = new JPanel(new MigLayout("", 
                                               "[]10[]",
                                               "[top]"));        
        devicePanel.add(deviceTable(), "growx,growy");
        devicePanel.add(deviceButtons());
        
        return devicePanel;
    }
    
}
