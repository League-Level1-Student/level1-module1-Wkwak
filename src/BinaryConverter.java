import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JTextField answer = new JTextField(30);
	JLabel label = new JLabel();
	JFrame frame = new JFrame();

	public static void main(String[] args) {
		BinaryConverter bc = new BinaryConverter();
		bc.showButton();

	}

	public void showButton() {

		frame.setVisible(true);
		frame.setTitle("Convery 8 bits of binary to ASCII");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel panel = new JPanel();
		frame.add(panel);

		panel.add(answer);

		JButton button = new JButton("convert");
		panel.add(button);
		panel.add(label);
		frame.pack();

		button.addActionListener(this);

	}

	String convert(String input) {
		if (input.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+"; // must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter = (char) asciiValue;
			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String input = answer.getText();
		label.setText(convert(input));
		frame.pack();
	}
}
