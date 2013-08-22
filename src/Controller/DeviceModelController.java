/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Broker.DeviceBroker;
import Container.Device;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Woj G
 */
public class DeviceModelController extends AbstractTableModel
{
    private ArrayList<Device> data;
    
    public static final String[] columnNames = {};
        
    public DeviceModelController(ArrayList<Device> data)
    {
        this.data = data;
    }
    
    @Override
    public int getColumnCount()
    {
        return columnNames.length;
    }
    
    @Override
    public String getColumnName(int column)
    {
        return columnNames[column];
    }
    
    @Override
    public int getRowCount()
    {
        return data.size();
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Device dev = data.get(rowIndex);
        if (dev == null)
            return null;
        
        switch(columnIndex)
        {
            case 0:
                return dev.getBrand();
            case 1:
                return dev.getModel();
            case 2:
                return dev.getSerialNumber();
            case 3:
                return dev.getComputerName();
            case 4:
                return dev.getLocation();
            case 5:
                return dev.getAssetTag();
            case 6:
                return dev.getCost();
            case 7:
                return dev.getStartDate();
            case 8:
                return dev.getEndDate();
            case 9:
                return dev.getTerm();
            default:
                return null;
        }
    }
}