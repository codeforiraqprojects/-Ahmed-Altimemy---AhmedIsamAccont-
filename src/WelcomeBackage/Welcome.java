package WelcomeBackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Welcome {

	private JFrame frame;
	private JTextField txtNo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome window = new Welcome();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Welcome() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 567, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblTitle = new JLabel(
				"\u0623\u0647\u0644\u0627 \u0628\u0643 \u0641\u064A \u062E\u062F\u0645\u0629 \u0627\u0644\u0639\u0645\u0644\u0627\u0621 \u0627\u0644\u0627\u0644\u0643\u062A\u0631\u0648\u0646\u064A");
		lblTitle.setFont(new Font("Diwani Letter", Font.BOLD, 30));
		lblTitle.setBounds(147, 11, 296, 71);
		frame.getContentPane().add(lblTitle);

		JLabel label = new JLabel(
				"\u0623\u062F\u062E\u0644 \u0631\u0642\u0645\u0643 \u0627\u0644\u0634\u062E\u0635\u064A \u062B\u0645 \u0642\u0645 \u0628\u0627\u0644\u0636\u063A\u0637 \u0639\u0644\u0649 \u0645\u0641\u062A\u0627\u062D \u0645\u0648\u0627\u0641\u0642");
		label.setFont(new Font("Andalus", Font.BOLD, 24));
		label.setBounds(62, 93, 445, 71);
		frame.getContentPane().add(label);

		JLabel lblNo = new JLabel("\u0627\u0644\u0631\u0642\u0645 \u0627\u0644\u0634\u062E\u0635\u064A");
		lblNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNo.setBounds(358, 227, 142, 35);
		frame.getContentPane().add(lblNo);

		txtNo = new JTextField();
		txtNo.setToolTipText("\u0627\u0644\u0631\u0642\u0645 \u0627\u0644\u0634\u062E\u0635\u064A");
		txtNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtNo.setBounds(151, 230, 173, 35);
		frame.getContentPane().add(txtNo);
		txtNo.setColumns(10);

		JButton button = new JButton("\u0645\u0648\u0627\u0641\u0642");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					DB.getInfo(Integer.parseInt(txtNo.getText()));

					new Main();
					frame.setVisible(false);
					Main.main(null);
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,
							"الرقم الشخصي الذي قمت بإدخاله خاطئ !!" + "\nيرجى التأكد من رقمك الشخصي ..", "تسجيل الدخول",
							JOptionPane.INFORMATION_MESSAGE);
					txtNo.setFocusable(true);
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 18));
		button.setBounds(20, 229, 121, 35);
		frame.getContentPane().add(button);

		JButton btnExit = new JButton(
				"\u0625\u063A\u0644\u0627\u0642 \u0627\u0644\u0628\u0631\u0646\u0627\u0645\u062C");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int option = JOptionPane.showConfirmDialog(frame, "هل تريد بالفعل إغلاق البرنامج ؟", "إغلاق البرنامج",
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
				if (option == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnExit.setBounds(20, 350, 480, 40);
		frame.getContentPane().add(btnExit);
	}
}
