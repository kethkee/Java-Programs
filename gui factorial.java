import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Gui1 extends JFrame implements ActionListener
{
	JLabel l1;
	JTextField t1;
	JLabel l2;
	JTextField t2;
	JButton b;
	public Gui1()
	{
		l1 = new JLabel("Number:");
		t1 = new JTextField(20);
		l2 = new JLabel("Factorial");
		t2 = new JTextField(20);
		b = new JButton("Factorial");
		
		
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		
		b.addActionListener(this);
		
		setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent ae)
	{
		int num = Integer.parseInt(t1.getText());
		
		int fact = 1;
		while(num>=1)
		{
			fact *= num;
			num--;
		}
		t2.setText(Integer.toString(fact));
	}
	public static void main(String[] args)
	{
		Gui1 g = new Gui1();
	}
}	
	
