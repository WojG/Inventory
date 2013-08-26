/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controller.DeviceModelController;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

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
        buttonPanel = new JPanel();
        buttonPanel.setLayout(new BoxLayout(buttonPanel,BoxLayout.Y_AXIS));
        
        buttonPanel.add(add);
        buttonPanel.add(update);
        buttonPanel.add(delete);
        
        return buttonPanel;
    }
    
    public JPanel deviceTable()
    {
        tablePanel = new JPanel(new BorderLayout());
        
        table = new JTable(new DeviceModelController());
        
        scrollPane = new JScrollPane(table);
        
        tablePanel.add(scrollPane);
        
        return tablePanel;
    }
    
    public JPanel createDevicePanel()
    {
        devicePanel = new JPanel(new BorderLayout());
        
        devicePanel.add(deviceTable(), BorderLayout.CENTER);
        devicePanel.add(deviceButtons(), BorderLayout.EAST);
        
        return devicePanel;
    }
    
}
