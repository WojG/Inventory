/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controller.DeviceController;
import Controller.DeviceModelController;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author Woj G
 */
public class DeviceInterface
{
    private JPanel devicePanel;
    private JTable table;
    private JScrollPane scrollPane;
    
    public DeviceInterface()
    {
        devicePanel = new JPanel(new BorderLayout());
                
        table = new JTable(new DeviceModelController(new DeviceController().getDevice()));
        
        scrollPane = new JScrollPane(table);
    }
    
    public JPanel displayTable()
    {
        devicePanel.add(scrollPane);
        return devicePanel;
    }
    
    
}
