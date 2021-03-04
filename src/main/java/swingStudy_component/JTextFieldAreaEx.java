package swingStudy_component;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import com.toedter.calendar.JDateChooser;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JButton;

public class JTextFieldAreaEx extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JTextField tfName;
	private JPasswordField tfPass1;
	private JPasswordField tfPass2;
	private JTextArea ta;
	private JLabel lblConfirm;
	private JPanel pNorth;
	private JPanel pCenter;
	private JDateChooser dateChooser;
	private JButton btnAdd;
	private JButton btnCancle;
	
	
	public JTextFieldAreaEx() {
		initialize();
	}
	private void initialize() {
		setTitle("텍스트 필드");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 406, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		pCenter = new JPanel();
		contentPane.add(pCenter, BorderLayout.CENTER);
		pCenter.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		pCenter.add(scrollPane, BorderLayout.CENTER);
		
		ta = new JTextArea();
		ta.setEditable(false);
		scrollPane.setViewportView(ta);
		
		pNorth = new JPanel();
		pNorth.setPreferredSize(new Dimension(80, 200));
		pNorth.setBorder(new EmptyBorder(10, 20, 10, 20));
		contentPane.add(pNorth, BorderLayout.NORTH);
		pNorth.setLayout(new GridLayout(0, 2, 10, 10));
		
		JLabel lblName = new JLabel("성명");
		lblName.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblName);
		
		tfName = new JTextField();
		pNorth.add(tfName);
		tfName.setColumns(10);
		
		JLabel lblPass1 = new JLabel("비밀번호");
		lblPass1.setPreferredSize(new Dimension(250, 300));
		lblPass1.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblPass1);
		
		tfPass1 = new JPasswordField();
		tfPass1.getDocument().addDocumentListener(listener);
		pNorth.add(tfPass1);
		
		JLabel lblPass2 = new JLabel("비밀번호 확인");
		lblPass2.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblPass2);
		
		tfPass2 = new JPasswordField();
		tfPass2.getDocument().addDocumentListener(listener);
		pNorth.add(tfPass2);
		
		JPanel panel = new JPanel();
		pNorth.add(panel);
		
		lblConfirm = new JLabel("");
		lblConfirm.setFont(new Font("굴림", Font.BOLD, 12));
		lblConfirm.setHorizontalAlignment(SwingConstants.CENTER);
		lblConfirm.setForeground(Color.RED);
		pNorth.add(lblConfirm);
		
		JLabel lblBirth = new JLabel("생년월일");
		lblBirth.setHorizontalAlignment(SwingConstants.RIGHT);
		pNorth.add(lblBirth);
		
		dateChooser = new JDateChooser(new Date());
		pNorth.add(dateChooser);
		
		btnAdd = new JButton("추가");
		btnAdd.addActionListener(this);
		pNorth.add(btnAdd);
		
		btnCancle = new JButton("취소");
		btnCancle.addActionListener(this);
		pNorth.add(btnCancle);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnCancle) {
			btnCancleActionPerformed(e);
		}
		if (e.getSource() == btnAdd) {
			btnAddActionPerformed(e);
		}
		
	}

	protected void btnAddActionPerformed(ActionEvent e) {
		if(lblConfirm.getText().equals("일치")) {					
			Date d = dateChooser.getDate();
			String msg = String.format("%s ~ %tF%n", tfName.getText(),d);
			ta.append(msg);
			clearTf();
		}else {
			JOptionPane.showMessageDialog(null, "비밀번호가 일치하지 않습니다.");
			tfPass2.setText("");
			tfPass1.requestFocus();
			tfPass1.selectAll();
		}
					
	}
	public void clearTf() {
		tfName.setText("");
		tfPass1.setText("");
		tfPass2.setText("");
		dateChooser.setDate(new Date());
		lblConfirm.setText("");
		tfName.requestFocus();
	}
	protected void btnCancleActionPerformed(ActionEvent e) {
		clearTf();
	}
	
	DocumentListener listener = new DocumentListener() {
		
		@Override
		public void removeUpdate(DocumentEvent e) {
			getMessage();
		}
		
		@Override
		public void insertUpdate(DocumentEvent e) {
			getMessage();
		}
		
		@Override
		public void changedUpdate(DocumentEvent e) {
			getMessage();
		}

		private void getMessage() {
			String pw1 = new String(tfPass1.getPassword());     //생성자 이용
			String pw2 = String.valueOf(tfPass2.getPassword()); //메서드 이용
			if(pw1.equals(pw2)) {
				lblConfirm.setText("일치");
			}else {
				lblConfirm.setText("불일치");
			}
		}
	}; 
}
