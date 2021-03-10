package swingStudy_component;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.SpinnerDateModel;
import java.util.Date;
import java.util.Calendar;
import javax.swing.BoxLayout;
import javax.swing.DefaultComboBoxModel;

import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class JSpinnerEx extends JFrame implements ItemListener {

	private JPanel contentPane;
	private JComboBox<String> comboBox;

	public JSpinnerEx() {
		initialize();
	}

	private void initialize() {
		setTitle("JSpinner 예제");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.Y_AXIS));

		JPanel pSpinner1 = new JPanel();
		contentPane.add(pSpinner1);

		JSpinner spinner1 = new JSpinner();
		spinner1.setModel(new SpinnerListModel(new String[] { "소설", "잡지", "전공서적", "취미" }));
		pSpinner1.add(spinner1);

		JPanel pSpinner2 = new JPanel();
		contentPane.add(pSpinner2);

		JSpinner spinner2 = new JSpinner();
		spinner2.setModel(new SpinnerNumberModel(1500000, 0, 4000000, 10));
		pSpinner2.add(spinner2);

		JPanel pSpiner3 = new JPanel();
		contentPane.add(pSpiner3);

		JSpinner spinner3 = new JSpinner();

		Calendar cal = Calendar.getInstance();

		Date value = cal.getTime();
		cal.add(Calendar.YEAR, -50);
		Date start = cal.getTime();

		cal.add(Calendar.YEAR, 50);
		Date end = cal.getTime();
		pSpiner3.setLayout(new GridLayout(0, 2, 0, 0));

		spinner3.setModel(new SpinnerDateModel(value, start, end, Calendar.MONTH));
		spinner3.setEditor(new JSpinner.DateEditor(spinner3, "MM"));
		pSpiner3.add(spinner3);

	}

	public void itemStateChanged(ItemEvent e) {
		if (e.getSource() == comboBox) {
			comboBoxItemStateChanged(e);
		}
	}

	protected void comboBoxItemStateChanged(ItemEvent e) {
		Object unit = comboBox.getSelectedItem();
		if (unit.equals("일")) {
			String[] strs = { "월" };
			comboBox = new JComboBox<>();
			comboBox.addItemListener(this);
			DefaultComboBoxModel<String> model = new DefaultComboBoxModel<String>();
			comboBox.setModel(model);
			comboBox.setMaximumRowCount(3);
//			pSpiner3.add(comboBox);

		}
	}
}
