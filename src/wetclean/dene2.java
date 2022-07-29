package wetclean;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class dene2 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					dene2 frame = new dene2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void denee(String a) {
		textField.setText(a);
	}

	/**
	 * Create the frame.
	 */
	public dene2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(206, 5, 223, 99);
		contentPane.add(textArea);
		
		textField = new JTextField();
		textField.setBounds(66, 159, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
	}

}
