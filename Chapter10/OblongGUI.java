import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class OblongGUI extends JFrame implements ActionListener
{
	private Oblong myOblong = new Oblong(0, 0);
	private JLabel lengthLabel = new JLabel("Length");
	private JTextField lengthField = new JTextField(5);
	private JLabel heightLabel = new JLabel("Height");
	private JTextField heightField = new JTextField(5);
	private JButton calcButton = new JButton("Calculate");
	private JTextArea displayArea = new JTextArea(2, 30);

	public OblongGUI()
	{
		setTitle("Oblong GUI");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		add(lengthLabel);
		add(lengthField);
		add(heightLabel);
		add(heightField);
		add(calcButton);
		add(displayArea);
		setSize(240, 135);
		setLocation(300, 300);

		calcButton.addActionListener(this);

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		String lengthEntered = lengthField.getText();
		String heightEntered = heightField.getText();

		if(lengthEntered.length() == 0 || heightEntered.length() == 0)
		{
			displayArea.setText("Length and height must be entered");
		}
		else
		{
			myOblong.setLength(Double.parseDouble(lengthEntered));
			myOblong.setHeight(Double.parseDouble(heightEntered));
			displayArea.setText("The area of the oblong is " + myOblong.calculateArea() + "\nThe perimeter of the oblong is " + myOblong.calculatePerimeter());
		}
	}
}