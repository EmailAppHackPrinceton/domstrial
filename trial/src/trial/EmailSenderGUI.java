package trial;
import javax.swing.*;
import java.awt.BorderLayout;

public class EmailSenderGUI 
{
	/**
	 * @wbp.parser.entryPoint
	 */
	public void createAndShowSender() {
        //Create and set up the window.
        JFrame frame = new JFrame("Email Sender");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,100);
 
        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel("Hit the button to send an email(functionality not added yet)");
        frame.getContentPane().add(label);
        
        JButton btnNewButton = new JButton("New button");
        frame.getContentPane().add(btnNewButton, BorderLayout.SOUTH);
 
        //Display the window.
        //frame.pack();
        frame.setVisible(true);
    }

}
