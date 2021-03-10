package swingStudy;


import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import swingStudy_component.FrameComponentEx;
import swingStudy_component.Fruit;
import swingStudy_component.JButtonEx;
import swingStudy_component.JCheckBoxCustomEx;
import swingStudy_component.JCheckBoxEx;
import swingStudy_component.JComboBoxEx1;
import swingStudy_component.JComboBoxEx2;
import swingStudy_component.JComboBoxEx3;
import swingStudy_component.JLabelEx;
import swingStudy_component.JLabelEx1;
import swingStudy_component.JListEx;
import swingStudy_component.JListEx2;
import swingStudy_component.JListEx3;
import swingStudy_component.JRadioButtonEx;
import swingStudy_component.JSliderEx;
import swingStudy_component.JSpinnerEx;
import swingStudy_component.JTabbedPaneEx;
import swingStudy_component.JTableEx;
import swingStudy_component.JTextFieldAreaEx;
import swingStudy_frame.ContentPaneEx;
import swingStudy_layout.FrameLayout;
import swingStudy_layout.LayoutGubun;

public class SwingMain extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btn01;
	private JButton btn02;
	private JPanel pLayout;
	private JButton btnFlowLayout;
	private JButton btnBorderLayout;
	private JButton btnGridLayout;
	private JButton btnAbsoulteLayout;
	private JButton btn03;
	private JPanel pComponent;
	private JButton btn04;
	private JButton btn05;
	private JPanel pCheckRadio;
	private JButton btn06;
	private JButton btn07;
	private JPanel pText;
	private JButton btnTextField;
	private JPanel pJList;
	private JButton btn09;
	private JButton btn10;
	private JButton btn11;
	private JPanel pCombo;
	private JButton btn12;
	private JButton btn13;
	private JButton btn14;
	private JPanel pSliderSpinner;
	private JPanel pSlider;
	private JPanel pSpinner;
	private JButton btn16;
	private JButton btn15;
	private JPanel pJTabbedPane;
	private JButton btn17;
	private JButton btn0406;
	private JButton btn18;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SwingMain frame = new SwingMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public SwingMain() {
		initialize();
	}
	private void initialize() {
		setTitle("스윙스터디");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(10, 10, 724, 476);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 5, 10, 10));
		
		btn01 = new JButton("Jframe 예");
		btn01.addActionListener(this);
		contentPane.add(btn01);
		
		btn02 = new JButton("JPanel 예");
		btn02.addActionListener(this);
		contentPane.add(btn02);
		
		pLayout = new JPanel();
		pLayout.setBorder(new TitledBorder(null, "레이아웃", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pLayout);
		pLayout.setLayout(new GridLayout(0, 1, 0, 10));
		
		btnFlowLayout = new JButton("플로우레이아웃");
		btnFlowLayout.addActionListener(this);
//		btnFlowLayout.addActionListener(e -> new FrameLayout(LayoutGubun.FLOW));
		pLayout.add(btnFlowLayout);
		
		btnBorderLayout = new JButton("보더레이아웃");
		btnBorderLayout.addActionListener(this);
		pLayout.add(btnBorderLayout);
		
		btnGridLayout = new JButton("그리드레이아웃");
		btnGridLayout.addActionListener(this);
		pLayout.add(btnGridLayout);
		
		btnAbsoulteLayout = new JButton("절대레이아웃");
		btnAbsoulteLayout.addActionListener(this);
		pLayout.add(btnAbsoulteLayout);
		
		btn03 = new JButton("JComponent\uC758 \uACF5\uD1B5 \uAE30\uB2A5");
		btn03.addActionListener(this);
		contentPane.add(btn03);
		
		pComponent = new JPanel();
		pComponent.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JLabel & JButton & JToggle Button", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pComponent);
		pComponent.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn04 = new JButton("JLabel");
		btn04.addActionListener(this);
		pComponent.add(btn04);
		
		btn05 = new JButton("JButton && JToggle");
		btn05.addActionListener(this);
		
		btn0406 = new JButton("JLabelSize");
		btn0406.addActionListener(this);
		pComponent.add(btn0406);
		pComponent.add(btn05);
		
		pCheckRadio = new JPanel();
		pCheckRadio.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JCheckBox && JRadioButton", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pCheckRadio);
		pCheckRadio.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn06 = new JButton("CheckBox");
		btn06.addActionListener(this);
		pCheckRadio.add(btn06);
		
		btn07 = new JButton("JRadioButton");
		btn07.addActionListener(this);
		pCheckRadio.add(btn07);
		
		pText = new JPanel();
		pText.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "텍스트 필드", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pText);
		
		btnTextField = new JButton("J\uD14D\uC2A4\uD2B8 \uD544\uB4DC \uC608\uC81C");
		btnTextField.addActionListener(this);
		pText.add(btnTextField);
		
		pJList = new JPanel();
		pJList.setBorder(new TitledBorder(null, "JList", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pJList);
		pJList.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn09 = new JButton("JList\uC6081");
		btn09.addActionListener(this);
		pJList.add(btn09);
		
		btn10 = new JButton("JList\uC6082");
		btn10.addActionListener(this);
		pJList.add(btn10);
		
		btn11 = new JButton("JList\uC6083");
		btn11.addActionListener(this);
		pJList.add(btn11);
		
		pCombo = new JPanel();
		pCombo.setBorder(new TitledBorder(null, "JComboBox", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(pCombo);
		pCombo.setLayout(new GridLayout(0, 1, 0, 0));
		
		btn12 = new JButton("JComboBox\uC6081");
		btn12.addActionListener(this);
		pCombo.add(btn12);
		
		btn13 = new JButton("JComboBox\uC6082");
		btn13.addActionListener(this);
		pCombo.add(btn13);
		
		btn14 = new JButton("JComboBox\uC6083");
		btn14.addActionListener(this);
		pCombo.add(btn14);
		
		pSliderSpinner = new JPanel();
		contentPane.add(pSliderSpinner);
		pSliderSpinner.setLayout(new GridLayout(0, 1, 0, 0));
		
		pSlider = new JPanel();
		pSlider.setBorder(new TitledBorder(null, "JSlider", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pSliderSpinner.add(pSlider);
		pSlider.setLayout(new BorderLayout(0, 0));
		
		btn16 = new JButton("JSlider\uC608");
		btn16.addActionListener(this);
		pSlider.add(btn16, BorderLayout.CENTER);
		
		pSpinner = new JPanel();
		pSpinner.setBorder(new TitledBorder(null, "JSpinner", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		pSliderSpinner.add(pSpinner);
		pSpinner.setLayout(new BorderLayout(0, 0));
		
		btn15 = new JButton("JSpinner\uC608");
		btn15.addActionListener(this);
		pSpinner.add(btn15, BorderLayout.CENTER);
		
		pJTabbedPane = new JPanel();
		pJTabbedPane.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "JTabbedPane&JTable", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		contentPane.add(pJTabbedPane);
		
		btn17 = new JButton("JTabbedPane");
		btn17.addActionListener(this);
		pJTabbedPane.setLayout(new GridLayout(0, 1, 0, 0));
		pJTabbedPane.add(btn17);
		
		btn18 = new JButton("JTable");
		btn18.addActionListener(this);
		pJTabbedPane.add(btn18);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn18) {
			btn18ActionPerformed(e);
		}
		if (e.getSource() == btn0406) {
			btn0406ActionPerformed(e);
		}
		if (e.getSource() == btn17) {
			btn17ActionPerformed(e);
		}
		if (e.getSource() == btn15) {
			btn15ActionPerformed(e);
		}
		if (e.getSource() == btn16) {
			btn16ActionPerformed(e);
		}
		if (e.getSource() == btn14) {
			btn14ActionPerformed(e);
		}
		if (e.getSource() == btn13) {
			btn13ActionPerformed(e);
		}
		if (e.getSource() == btn12) {
			btn12ActionPerformed(e);
		}
		if (e.getSource() == btn11) {
			btn11ActionPerformed(e);
		}
		if (e.getSource() == btn10) {
			btn10ActionPerformed(e);
		}
		if (e.getSource() == btn09) {
			btn09ActionPerformed(e);
		}
		if (e.getSource() == btnTextField) {
			btnTextFieldActionPerformed(e);
		}
		if (e.getSource() == btn07) {
			btn07ActionPerformed(e);
		}
		if (e.getSource() == btn06) {
			btn06ActionPerformed(e);
		}
		if (e.getSource() == btn05) {
			btn05ActionPerformed(e);
		}
		if (e.getSource() == btn04) {
			btn04ActionPerformed(e);
		}
		if (e.getSource() == btn03) {
			btn03ActionPerformed(e);
		}
		if (e.getSource() == btnAbsoulteLayout) {
			btnAbsoulteLayoutActionPerformed(e);
		}
		if (e.getSource() == btnGridLayout) {
			btnGridLayoutActionPerformed(e);
		}
		if (e.getSource() == btnBorderLayout) {
			btnBorderLayoutActionPerformed(e);
		}
		if (e.getSource() == btnFlowLayout) {
			btnFlowLayoutActionPerformed(e);
		}
		if (e.getSource() == btn02) {
			btn02ActionPerformed(e);
		}
		if (e.getSource() == btn01) {
			btn01ActionPerformed(e);
		}
	}
	protected void btn01ActionPerformed(ActionEvent e) {
		ContentPaneEx frame = new ContentPaneEx();
		frame.setVisible(true);
	}
	protected void btn02ActionPerformed(ActionEvent e) {
		JPanelEx frame = new JPanelEx();
		frame.setVisible(true);
	}
	protected void btnFlowLayoutActionPerformed(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGubun.FLOW);
		frame.setVisible(true);
	}
	protected void btnBorderLayoutActionPerformed(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGubun.BORDER);
		frame.setVisible(true);
	}
	protected void btnGridLayoutActionPerformed(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGubun.GRID);
		frame.setVisible(true);
	}
	protected void btnAbsoulteLayoutActionPerformed(ActionEvent e) {
		FrameLayout frame = new FrameLayout(LayoutGubun.ABSOULTE);
		frame.setVisible(true);
	}
	protected void btn03ActionPerformed(ActionEvent e) {
		FrameComponentEx frame = new FrameComponentEx();
		frame.setVisible(true);
	}
	protected void btn04ActionPerformed(ActionEvent e) {
		JLabelEx frame = new JLabelEx();
		frame.setVisible(true);
	}
	protected void btn05ActionPerformed(ActionEvent e) {
		JButtonEx frame = new JButtonEx();
		frame.setVisible(true);
	}
	protected void btn06ActionPerformed(ActionEvent e) {		
		ArrayList<Fruit> list = new ArrayList<Fruit>();
		list.add(new Fruit("사과",100));
		list.add(new Fruit("배",500));
		list.add(new Fruit("체리",20000));
		list.add(new Fruit("바나나",10000));
		
		JCheckBoxEx frame = new JCheckBoxEx(list);
		frame.setVisible(true);
		
		JCheckBoxCustomEx frame2 = new JCheckBoxCustomEx(list);
		frame2.setVisible(true);
	}
	
	protected void btn07ActionPerformed(ActionEvent e) {
		JRadioButtonEx frame = new JRadioButtonEx();
		frame.setVisible(true);
	}
	protected void btnTextFieldActionPerformed(ActionEvent e) {
		JTextFieldAreaEx frame = new JTextFieldAreaEx();
		frame.setVisible(true);
	}
	protected void btn09ActionPerformed(ActionEvent e) {
		JListEx frame = new JListEx();
		frame.setVisible(true);
	}
	protected void btn10ActionPerformed(ActionEvent e) {
		JListEx2 frame = new JListEx2();
		frame.setVisible(true);
	}
	protected void btn11ActionPerformed(ActionEvent e) {
		JListEx3 frame = new JListEx3();
		frame.setVisible(true);
	}
	protected void btn12ActionPerformed(ActionEvent e) {
		JComboBoxEx1 frame = new JComboBoxEx1();
		frame.setVisible(true);
	}
	protected void btn13ActionPerformed(ActionEvent e) {
		JComboBoxEx2 frame = new JComboBoxEx2();
		frame.setVisible(true);
	}
	protected void btn14ActionPerformed(ActionEvent e) {
		JComboBoxEx3 frame = new JComboBoxEx3();
		frame.setVisible(true);
	}
	protected void btn16ActionPerformed(ActionEvent e) {
		JSliderEx frame = new JSliderEx();
		frame.setVisible(true);
	}
	protected void btn15ActionPerformed(ActionEvent e) {
		JSpinnerEx frame = new JSpinnerEx();
		frame.setVisible(true);
	}
	protected void btn17ActionPerformed(ActionEvent e) {
		JTabbedPaneEx frame = new JTabbedPaneEx();
		frame.setVisible(true);
	}
	protected void btn0406ActionPerformed(ActionEvent e) {
		JLabelEx1 frame = new JLabelEx1();
		frame.setVisible(true);
	}
	protected void btn18ActionPerformed(ActionEvent e) {
		JTableEx frame = new JTableEx();
		frame.setVisible(true);
	}
}
