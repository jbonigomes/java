import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ChangingFace extends JFrame implements ActionListener
{
	private boolean isHappy = true;
	private JButton happyButton = new JButton("Smile");
	private JButton sadButton = new JButton("Frown");

	public ChangingFace()
	{
		setTitle("Changing Face");
		setLayout(new FlowLayout());

		add(happyButton);
		add(sadButton);
		
		getContentPane().setBackground(Color.yellow);
		
		happyButton.addActionListener(this);
		sadButton.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(250, 200);
		setLocation(300, 300);
		setVisible(true);
	}

	public void paint(Graphics g)
	{
		super.paint(g);

		g.setColor(Color.red);
		g.drawOval(85, 75, 75, 75);
		g.setColor(Color.blue);
		g.drawOval(100, 95, 10, 10);
		g.drawOval(135, 95, 10, 10);
		g.drawString("Changing Face", 80, 185);

		if(isHappy == true)
		{
			g.drawArc(102, 115, 40, 25, 0, -180);
		}
		else
		{
			g.drawArc(102, 115, 40, 25, 0, 180);
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == happyButton)
		{
			isHappy = true;
			repaint();
		}
		if(e.getSource() == sadButton)
		{
			isHappy = false;
			repaint();
		}
	}
}