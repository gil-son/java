package thread.ex01.without_thread;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculatorScreen {

	public static void main(String[] args) {

		JFrame window = new JFrame("Long Multiplication");

		JTextField first = new JTextField(10);
		JTextField second = new JTextField(10);
		JButton button = new JButton(" = ");
		JLabel result = new JLabel(" ? ");

		//when you click the button, the Multiplier class will be executed
		button.addActionListener(new TheActionButton(first, second, result));

		JPanel panel = new JPanel();
		panel.add(first);
		panel.add(new JLabel("x"));
		panel.add(second);
		panel.add(button);
		panel.add(result);

		window.add(panel);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.pack();
		window.setVisible(true);
	}
}