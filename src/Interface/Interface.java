/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import javax.swing.JFrame;

/**
 *
 * @author Woj G
 */
public class Interface
{

    public Interface()
    {
        
    }
    
    // gui panels 
    
    // put the GUI panels together in a layout manager
    public void createAndShowGUI()
    {
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("[=] JButton Scores! [=]");

        //Create and set up the content pane.
        DeviceInterface di = new DeviceInterface();
        frame.setContentPane(di.displayTable());

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 190);
        frame.setVisible(true);

    }
}
