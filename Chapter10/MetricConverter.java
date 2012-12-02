import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;

public class MetricConverter extends JFrame implements ActionListener
{
	private JTextField cmText = new JTextField(6);
	private JLabel cmLabel = new JLabel("Cm");
	private JButton cmToInchButton = new JButton(" ===> ");
	private JButton inchToCmButton = new JButton(" <=== ");
	private JPanel inchCmButtons = new JPanel();
	private JTextField inchText = new JTextField(6);
	private JLabel inchLabel = new JLabel("Inches");
	private JPanel inchCmPanel = new JPanel();

	private JTextField kmText = new JTextField(6);
	private JLabel kmLabel = new JLabel("Km");
	private JButton kmToMileButton = new JButton(" ===> ");
	private JButton mileToKmButton = new JButton(" <=== ");
	private JPanel mileKmButtons = new JPanel();
	private JTextField mileText = new JTextField(6);
	private JLabel mileLabel = new JLabel("Miles");
	private JPanel mileKmPanel = new JPanel();

	private JTextField kgText = new JTextField(6);
	private JLabel kgLabel = new JLabel("Kg");
	private JButton kgToPoundButton = new JButton(" ===> ");
	private JButton poundToKgButton = new JButton(" <=== ");
	private JPanel poundKgButtons = new JPanel();
	private JTextField poundText = new JTextField(6);
	private JLabel poundLabel = new JLabel("Lb");
	private JPanel poundKgPanel = new JPanel();

	public MetricConverter()
	{
		inchCmButtons.setLayout(new BorderLayout());
		inchCmButtons.add("North", cmToInchButton);
		inchCmButtons.add("South", inchToCmButton);
		inchCmPanel.add(cmText);
		inchCmPanel.add(cmLabel);
		inchCmPanel.add(inchCmButtons);
		inchCmPanel.add(inchText);
		inchCmPanel.add(inchLabel);

		mileKmButtons.setLayout(new BorderLayout());
		mileKmButtons.add("North", kmToMileButton);
		mileKmButtons.add("South", mileToKmButton);
		mileKmPanel.add(kmText);
		mileKmPanel.add(kmLabel);
		mileKmPanel.add(mileKmButtons);
		mileKmPanel.add(mileText);
		mileKmPanel.add(mileLabel);

		poundKgButtons.setLayout(new BorderLayout());
		poundKgButtons.add("North", kgToPoundButton);
		poundKgButtons.add("South", poundToKgButton);
		poundKgPanel.add(kgText);
		poundKgPanel.add(kgLabel);
		poundKgPanel.add(poundKgButtons);
		poundKgPanel.add(poundText);
		poundKgPanel.add(poundLabel);

		add(inchCmPanel);
		add(mileKmPanel);
		add(poundKgPanel);

		cmToInchButton.setBorder(new BevelBorder(BevelBorder.RAISED));
		inchToCmButton.setBorder(new BevelBorder(BevelBorder.RAISED));
		kmToMileButton.setBorder(new BevelBorder(BevelBorder.RAISED));
		mileToKmButton.setBorder(new BevelBorder(BevelBorder.RAISED));
		kgToPoundButton.setBorder(new BevelBorder(BevelBorder.RAISED));
		poundToKgButton.setBorder(new BevelBorder(BevelBorder.RAISED));

		cmToInchButton.addActionListener(this);
		inchToCmButton.addActionListener(this);
		kmToMileButton.addActionListener(this);
		mileToKmButton.addActionListener(this);
		kgToPoundButton.addActionListener(this);
		poundToKgButton.addActionListener(this);

		setTitle("Metric Converter");
		setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(320, 220);
		setLocation(300, 300);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		DecimalFormat df = new DecimalFormat("#####0.0#");

		double d;
		String s;

		if(e.getSource() == cmToInchButton)
		{
			s = new String(cmText.getText());
			d = Double.parseDouble(s);
			d = d / 2.54;
			s = df.format(d);
			inchText.setText(s);
		}

		if(e.getSource() == inchToCmButton)
		{
			s = new String(inchText.getText());
			d = Double.parseDouble(s);
			d = d * 2.54;
			s = df.format(d);
			cmText.setText(s);
		}

		if(e.getSource() == kmToMileButton)
		{
			s = new String(kmText.getText());
			d = Double.parseDouble(s);
			d = d / 1.609;
			s = df.format(d);
			mileText.setText(s);
		}

		if(e.getSource() == mileToKmButton)
		{
			s = new String(mileText.getText());
			d = Double.parseDouble(s);
			d = d * 1.609;
			s = df.format(d);
			kmText.setText(s);
		}

		if(e.getSource() == kgToPoundButton)
		{
			s = new String(kgText.getText());
			d = Double.parseDouble(s);
			d = d * 2.2;
			s = df.format(d);
			poundText.setText(s);
		}

		if(e.getSource() == poundToKgButton)
		{
			s = new String(poundText.getText());
			d = Double.parseDouble(s);
			d = d / 2.2;
			s = df.format(d);
			kgText.setText(s);
		}
	}
}