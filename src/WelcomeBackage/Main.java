package WelcomeBackage;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Main {

	private JFrame frame;
	private static JTextField txtNo;
	private JTextField txtName;
	private JTextField txtAdress;

	String No = DB.arrFind[0].toString();
	String Name = DB.arrFind[1].toString();
	String Adress = DB.arrFind[2].toString();
	String Balance = DB.arrFind[3].toString();
	private JButton btnWithdraw;
	private JButton btnDeposit;
	private JButton btnCheck;
	private JButton btnLogout;
	private JLabel lblUpdateBalance;
	private JTextField txtUpdateBalance;
	private JButton btnUpdateBalance;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();

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
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 630, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblNo = new JLabel("\u0627\u0644\u0631\u0642\u0645 \u0627\u0644\u0634\u062E\u0635\u064A");
		lblNo.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNo.setBounds(462, 11, 142, 35);
		frame.getContentPane().add(lblNo);

		txtNo = new JTextField(No);
		txtNo.setToolTipText("\u0627\u0644\u0631\u0642\u0645 \u0627\u0644\u0634\u062E\u0635\u064A");
		txtNo.setHorizontalAlignment(SwingConstants.CENTER);
		txtNo.setColumns(10);
		txtNo.setBounds(263, 11, 173, 35);
		txtNo.setEditable(false);
		frame.getContentPane().add(txtNo);

		JLabel lblName = new JLabel("\u0627\u0633\u0645 \u0627\u0644\u0639\u0645\u064A\u0644");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblName.setBounds(462, 57, 142, 35);
		frame.getContentPane().add(lblName);

		txtName = new JTextField(Name);
		txtName.setToolTipText("\u0627\u0644\u0631\u0642\u0645 \u0627\u0644\u0634\u062E\u0635\u064A");
		txtName.setHorizontalAlignment(SwingConstants.CENTER);
		txtName.setColumns(10);
		txtName.setBounds(263, 57, 173, 35);
		txtName.setEditable(false);
		frame.getContentPane().add(txtName);

		JLabel lblAdress = new JLabel("\u0639\u0646\u0648\u0627\u0646 \u0627\u0644\u0639\u0645\u064A\u0644");
		lblAdress.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblAdress.setBounds(462, 103, 142, 35);
		frame.getContentPane().add(lblAdress);

		txtAdress = new JTextField(Adress);
		txtAdress.setToolTipText("\u0627\u0644\u0631\u0642\u0645 \u0627\u0644\u0634\u062E\u0635\u064A");
		txtAdress.setHorizontalAlignment(SwingConstants.CENTER);
		txtAdress.setColumns(10);
		txtAdress.setBounds(263, 103, 173, 35);
		txtAdress.setEditable(false);
		frame.getContentPane().add(txtAdress);

		lblUpdateBalance = new JLabel("");
		lblUpdateBalance.setBackground(Color.ORANGE);
		lblUpdateBalance.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblUpdateBalance.setVisible(false);
		lblUpdateBalance.setBounds(357, 153, 247, 35);
		frame.getContentPane().add(lblUpdateBalance);

		txtUpdateBalance = new JTextField("");
		txtUpdateBalance.setBackground(Color.ORANGE);
		txtUpdateBalance.setToolTipText("الرقم الشخصي");
		txtUpdateBalance.setHorizontalAlignment(SwingConstants.CENTER);
		txtUpdateBalance.setVisible(false);
		txtUpdateBalance.setColumns(10);
		txtUpdateBalance.setBounds(163, 153, 173, 35);
		frame.getContentPane().add(txtUpdateBalance);

		btnWithdraw = new JButton("\u0633\u062D\u0628");
		btnWithdraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblUpdateBalance.setVisible(true);
				txtUpdateBalance.setVisible(true);
				lblUpdateBalance.setText("أدخل الرصيد الذي تود سحبه");
				btnUpdateBalance.setVisible(true);
			}
		});
		btnWithdraw.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnWithdraw.setBounds(331, 243, 127, 40);
		frame.getContentPane().add(btnWithdraw);

		btnDeposit = new JButton("\u0627\u064A\u062F\u0627\u0639");
		btnDeposit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblUpdateBalance.setVisible(true);
				txtUpdateBalance.setVisible(true);
				lblUpdateBalance.setText("أدخل الرصيد الذي تود إيداعه");
				btnUpdateBalance.setVisible(true);
			}
		});
		btnDeposit.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnDeposit.setBounds(94, 243, 136, 40);
		frame.getContentPane().add(btnDeposit);

		btnCheck = new JButton("\u0643\u0634\u0641 \u062D\u0633\u0627\u0628");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "الزبون : " + Name + "\nرصيد حسابك المتوفر : " + Balance,
						"كشف حساب", JOptionPane.INFORMATION_MESSAGE);
			}
		});
		btnCheck.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnCheck.setBounds(183, 307, 198, 40);
		frame.getContentPane().add(btnCheck);

		btnLogout = new JButton("\u062A\u0633\u062C\u064A\u0644 \u062E\u0631\u0648\u062C");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DB.ResetInfo();
				frame.setVisible(false);
				Welcome.main(null);
			}
		});
		btnLogout.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnLogout.setBounds(94, 369, 364, 40);
		frame.getContentPane().add(btnLogout);

		btnUpdateBalance = new JButton("موافق");
		btnUpdateBalance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (!txtUpdateBalance.getText().equals("")) {
					if (lblUpdateBalance.getText() == "أدخل الرصيد الذي تود سحبه") {
						int Withdraw = Integer.parseInt(txtUpdateBalance.getText());
						if (Withdraw < Integer.parseInt(Balance)) {
							String OldBalance = Balance;
							int NewBalance = Integer.parseInt(OldBalance) - Withdraw;
							JOptionPane.showMessageDialog(null,
									"تم تحديث الرصيد\n" + "رصيدك السابق هو : " + OldBalance + "\nالرصيد المسحوب هو : "
											+ Withdraw + "\nرصيدك الحالي هو : " + NewBalance,
									"سحب رصيد", JOptionPane.INFORMATION_MESSAGE);

							int option = JOptionPane.showConfirmDialog(frame, "هل تود القيام بعملية أخرى ؟", "إشعار",
									JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
							if (option == JOptionPane.YES_OPTION) {
								new Main();
								Main.main(null);
								;
							}
							if (option == JOptionPane.NO_OPTION) {
								new Welcome();
								frame.setVisible(false);
								Welcome.main(null);
							}
						} else {
							txtUpdateBalance.addFocusListener(null);
							JOptionPane.showMessageDialog(null, "عذرا رصيدك غير كافي !!", "سحب رصيد",
									JOptionPane.ERROR_MESSAGE);
						}
					} else if (lblUpdateBalance.getText() == "أدخل الرصيد الذي تود إيداعه") {
						int Deposit = Integer.parseInt(txtUpdateBalance.getText());
						String OldBalance = Balance;
						int NewBalance = Integer.parseInt(OldBalance) + Deposit;
						JOptionPane.showMessageDialog(null,
								"تم تحديث الرصيد\n" + "رصيدك السابق هو : " + OldBalance + "\nالرصيد المودع هو : "
										+ Deposit + "\nرصيدك الحالي هو : " + NewBalance,
								"إيداع رصيد", JOptionPane.INFORMATION_MESSAGE);

						int option = JOptionPane.showConfirmDialog(frame, "هل تود القيام بعملية أخرى ؟", "إشعار",
								JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
						if (option == JOptionPane.YES_OPTION) {
							new Main();
							Main.main(null);
							;
						}
						if (option == JOptionPane.NO_OPTION) {
							new Welcome();
							frame.setVisible(false);
							Welcome.main(null);
						}
					}
				} else {
					JOptionPane.showMessageDialog(null, "يرجى إدخال قيمة الرصيد !!", "سحب رصيد",
							JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
		btnUpdateBalance.setForeground(Color.RED);
		btnUpdateBalance.setFont(new Font("Tahoma", Font.BOLD, 18));
		btnUpdateBalance.setVisible(false);
		btnUpdateBalance.setBounds(26, 153, 127, 35);
		frame.getContentPane().add(btnUpdateBalance);
	}

}
