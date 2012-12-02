import javax.swing.*;
import java.awt.*;

public class SmileyFace extends JFrame
{
	public SmileyFace()
	{
		setTitle("Smiley Face");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 220);
		setLocation(300, 300);
		getContentPane().setBackground(Color.yellow);
		setVisible(true);
	}

	/* This method will be called automatically when the component becomes visible, JFrame extends Component */
	public void paint(Graphics g)
	{
		super.paint(g);							// call the method of the superclass, JFrame
		g.setColor(Color.red);
		g.drawOval(85, 75, 75, 75);				// the face
		g.setColor(Color.blue);
		g.drawOval(100, 95, 10, 10);			// the right eye
		g.drawOval(135, 95, 10, 10);			// the left eye
		g.drawArc(102, 115, 40, 25, 0, -180);	// the mouth
		g.drawString("Smiley Face", 90, 175);
	}
}