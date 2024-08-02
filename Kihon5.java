package kadai;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.SwingUtilities;

// アプリケーション開発
// 基本課題 5
// 学年組    3 年 2組
// 学生番号  2212228
// 氏名      齋藤　丈

public class Kihon5 {
	private JFrame jf = null;
	private JPanel cp = null, p1 = null, p2 = null;
	private JLabel jl = null;
	private JButton jb = null;
	private JCheckBox jc1 = null, jc2 = null, jc3 = null;
	private JRadioButton jr1 = null, jr2 = null, jr3 = null;
	private ButtonGroup bg = null;

	private JFrame getJFrame() {
		if (jf == null) {
			jf = new JFrame();
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setSize(480, 300);
			jf.setLocationRelativeTo(null);
			jf.setContentPane(getJContentPane());
			jf.setTitle("基本課題5");
		}
		return jf;
	}

	private JPanel getJContentPane() {
		if (cp == null) {
			cp = new JPanel();
			cp.setLayout(new GridLayout(3, 1));
			cp.add(getJLabel());
			cp.add(getJContentPane1());
			cp.add(getJContentPane2());
		}
		return cp;
	}

	private JPanel getJContentPane1() {
		if (p1 == null) {
			p1 = new JPanel();
			p1.setLayout(new GridLayout(3, 2));
			p1.add(getJRadioButton1());
			p1.add(getJCheckBox1());
			p1.add(getJRadioButton2());
			p1.add(getJCheckBox2());
			p1.add(getJRadioButton3());
			p1.add(getJCheckBox3());
			bg = new ButtonGroup();
			bg.add(jr1);
			bg.add(jr2);
			bg.add(jr3);
		}
		return p1;
	}

	private JPanel getJContentPane2() {
		if (p2 == null) {
			p2 = new JPanel();
			p2.setLayout(new GridLayout(1, 1));
			p2.add(getJButton());
		}
		return p2;
	}

	private JLabel getJLabel() {
		if (jl == null) {
			jl = new JLabel();
			// jl.setText();
		}
		return jl;
	}

	private JCheckBox getJCheckBox1() {
		if (jc1 == null) {
			jc1 = new JCheckBox("チェックボックス1");
		}
		return jc1;
	}

	private JCheckBox getJCheckBox2() {
		if (jc2 == null) {
			jc2 = new JCheckBox("チェックボックス2");
		}
		return jc2;
	}

	private JCheckBox getJCheckBox3() {
		if (jc3 == null) {
			jc3 = new JCheckBox("チェックボックス3");
		}
		return jc3;
	}

	private JRadioButton getJRadioButton1() {
		if (jr1 == null) {
			jr1 = new JRadioButton("ラジオボタン1");
		}
		return jr1;
	}

	private JRadioButton getJRadioButton2() {
		if (jr2 == null) {
			jr2 = new JRadioButton("ラジオボタン2");
		}
		return jr2;
	}

	private JRadioButton getJRadioButton3() {
		if (jr3 == null) {
			jr3 = new JRadioButton("ラジオボタン3");
		}
		return jr3;
	}

	private JButton getJButton() {
		if (jb == null) {
			jb = new JButton();
			jb.setText("状態取得");
			jb.addActionListener(new MyActionListener());
		}
		return jb;
	}

	class MyActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			StringBuilder moji = new StringBuilder();
			if (jr1.isSelected()) {
				if (moji.length() > 0)
					moji.append(",");
				moji.append("ラジオボタン1");
			}
			if (jr2.isSelected()) {
				if (moji.length() > 0)
					moji.append(",");
				moji.append("ラジオボタン2");
			}
			if (jr3.isSelected()) {
				if (moji.length() > 0)
					moji.append(",");
				moji.append("ラジオボタン3");
			}
			if (jc1.isSelected()) {
				if (moji.length() > 0)
					moji.append(",");
				moji.append("チェックボックス1");
			}
			if (jc2.isSelected()) {
				if (moji.length() > 0)
					moji.append(",");
				moji.append("チェックボックス2");
			}
			if (jc3.isSelected()) {
				if (moji.length() > 0)
					moji.append(",");
				moji.append("チェックボックス3");
			}
			jl.setText(moji.toString());
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Kihon5 application = new Kihon5();
				application.getJFrame().setVisible(true);
			}
		});
	}
}
