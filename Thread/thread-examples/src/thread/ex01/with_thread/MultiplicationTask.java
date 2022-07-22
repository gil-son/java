package thread.ex01.with_thread;

import java.math.BigInteger;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class MultiplicationTask implements Runnable{

	private JTextField first;
	private JTextField second;
	private JLabel result;
	
	public MultiplicationTask(JTextField first, JTextField second, JLabel result) {
		super();
		this.first = first;
		this.second = second;
		this.result = result;
	}

	@Override
	public void run() {
		
		long value1 = Long.parseLong(this.first.getText());
		long value2 = Long.parseLong(this.second.getText());
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
