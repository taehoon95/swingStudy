package swingStudy;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import swingStudy_layout.FrameLayout;
import swingStudy_layout.LayoutGubun;

import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.border.TitledBorder;

import swingStudy_component.FrameComponentEx;
import swingStudy_component.Fruit;
import swingStudy_component.JButtonEx;
import swingStudy_component.JCheckBoxCustomEx;
import swingStudy_component.JCheckBoxEx;
import swingStudy_component.JLabelEx;
import swingStudy_frame.ContentPaneEx;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JCheckBox;

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
		setBounds(10, 10, 700, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 3, 10, 10));
		
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
	}

	public void actionPerformed(ActionEvent e) {
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
	
}
