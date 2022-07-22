package thread.ex01.without_thread;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class TheActionButton implements ActionListener {

	private JTextField first;
	private JTextField second;
	private JLabel result;

	public TheActionButton(JTextField first, JTextField second, JLabel result) {
		this.first = first;
		this.second = second;
		this.result = result;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		long value1 = Long.parseLong(first.getText());
		long value2 = Long.parseLong(second.getText());
		BigInteger calculation = new BigInteger("0");

		
		 // The application is purposely complex, to test the threads
		 
		for (int i = 0; i < value1; i++) {
			for (int j = 0; j < value2; j++) {
				calculation = calculation.add(new BigInteger("1"));
			}
		}

		result.setText(calculation.toString());
		
	}

}