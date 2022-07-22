package thread.ex01.with_thread;

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
		
		MultiplicationTask multiplicationTaks = new MultiplicationTask(first, second, result);
		
		Thread threadCalculate = new Thread(multiplicationTaks);
		
		// runs the JVM in parallel. With this in large calculations the interface does not crash
		threadCalculate.start();
		
	}

}