/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Controller.DeviceModelController;
import Listeners.TableMouseListener;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
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
        
        buttonPanel = new JPanel(new MigLayout("", // layout constraints
                                               "", // column constriants
                                               "[]10[]10[]")); // row constraints
       // buttonPanel.setBorder(BorderFactory.createLineBorder(Color.RED));
        buttonPanel.add(add, "growx,wrap");
        buttonPanel.add(update, "growx,wrap");
        buttonPanel.add(delete, "growx");
        
        return buttonPanel;
    }
    
    public JPanel deviceTable()
    {        
        table = new JTable(new DeviceModelController());     
        table.addMouseListener(new TableMouseListener(table));
        scrollPane = new JScrollPane(table);
        
        tablePanel = new JPanel(new MigLayout("", // layout constraints
                                              "[grow]", // column constriants
                                              "[grow,top]")); // row constraints
        tablePanel.setBorder(BorderFactory.createRaisedSoftBevelBorder());
        tablePanel.add(scrollPane,"grow");
        
        return tablePanel;
    }
    
    public JPanel createDevicePanel()
    {
        devicePanel = new JPanel(new MigLayout("", // layout constraints
                                               "[grow]10[]", // column constriants
                                               "[grow,top]")); // row constraints
        devicePanel.add(deviceTable(), "grow");
        devicePanel.add(deviceButtons());
        
        return devicePanel;
    }    
}
