/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Listeners;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JTable;

/**
 *
 * @author Woj G
 */
public class TableMouseListener implements MouseListener
{
    private JTable table;
    
    public TableMouseListener(JTable t)
    {
        this.table = t;
    }

    @Override
    public void mouseClicked(MouseEvent me)
    {
    }

    @Override
    public void mousePressed(MouseEvent me)
    {
        System.out.println(table.getModel()
                                .getValueAt(table.getSelectedRow(),
                                            table.getSelectedColumn()));
    }

    @Override
    public void mouseReleased(MouseEvent me)
    {
    }

    @Override
    public void mouseEntered(MouseEvent me)
    {
    }

    @Override
    public void mouseExited(MouseEvent me)
    {
    }
}
