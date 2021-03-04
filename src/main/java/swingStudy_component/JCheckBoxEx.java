package swingStudy_component;


import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;

import java.awt.Component;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.awt.event.ItemEvent;

public class JCheckBoxEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private int sum;
	private String resStr = "현재 0원 입니다.";
	private JLabel lbl;
	private JCheckBox checkPear;
	private JCheckBox checkApple;
	private JCheckBox checkCherry;
	private JLabel lblTitle;
	private ArrayList<Fruit> list;
	
	
	public JCheckBoxEx(ArrayList<Fruit> list) {
		this.list = list;
		initialize();

	}
	

	private void initialize() {
		setTitle("체크박스 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 433, 377);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		JPanel pNorth = new JPanel();
		contentPane.add(pNorth);
		pNorth.setLayout(new BoxLayout(pNorth, BoxLayout.Y_AXIS));

		lblTitle = new JLabel("체크박스 예제");
		lblTitle.setHorizontalAlignment(SwingConstants.LEFT);
		pNorth.add(lblTitle);

		JPanel panel = new JPanel();
		panel.setAlignmentX(Component.LEFT_ALIGNMENT);
		pNorth.add(panel);
		
//		checkApple = new JCheckBox("사과");
//		checkApple.addItemListener(this);
//		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
//		panel.add(checkApple);
//		
//		checkPear = new JCheckBox("배");
//		checkPear.addItemListener(this);
//		panel.add(checkPear);
//		
//		checkCherry = new JCheckBox("체리");
//		checkCherry.addItemListener(this);
//		panel.add(checkCherry);
		
		lbl = new JLabel();
		lbl.setVerticalAlignment(SwingConstants.BOTTOM);
		pNorth.add(lbl);
	
		JPanel pSouth = new JPanel();
		contentPane.add(pSouth);
		
		String title = "";
		for(Fruit f : list) {
			title += f.toString() + ""; // title 받아오기 위한 한줄
			JCheckBox ck = new JCheckBox(f.getName()); // JcheckBox생성 
			pNorth.add(ck);
			ck.addItemListener(this);
		}
		lblTitle.setText(title);
	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		JCheckBox cb = (JCheckBox) e.getSource();
		Fruit selectFruit = list.get(list.indexOf(new Fruit(cb.getText())));
		if(e.getStateChange() == ItemEvent.SELECTED) {
			sum += selectFruit.getPrice();
		}else {
			sum -= selectFruit.getPrice();
		}		
		lbl.setText(sum+ " ");
	}
}


	
//	public void itemStateChanged(ItemEvent e) {
//		if (e.getSource() == checkCherry) {
//			checkCherryItemStateChanged(e);
//		}
//		if (e.getSource() == checkPear) {
//			checkPearItemStateChanged(e);
//		}
//		if (e.getSource() == checkApple) {
//			checkAppleItemStateChanged(e);
//		}
//		resStr = String.format("현재  %d원 입니다.", sum);
//		lbl.setText(resStr);
//	}
//	protected void checkAppleItemStateChanged(ItemEvent e) {
//		if(e.getStateChange() == ItemEvent.SELECTED) {
//			sum += 100;
//		}else {
//			sum -= 100;
//		}
//	}
//	protected void checkPearItemStateChanged(ItemEvent e) {
//		if(e.getStateChange() == ItemEvent.SELECTED) {
//			sum += 500;
//		}else {
//			sum -= 500;
//		}
//	}
//	protected void checkCherryItemStateChanged(ItemEvent e) {
//		if(e.getStateChange() == ItemEvent.SELECTED) {
//			sum += 20000;
//		}else {
//			sum -= 20000;
//		}
//	}
//}
