// アプリケーション開発 
// 基本課題 4
// 学年組    3 年 2 組 
// 学生番号  2212228
// 氏名      齋藤　丈
package kadai;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Kihon4 {

	private JFrame jf = null;
	private JPanel cp = null;
	private JPanel jpLabel = null;
	private JPanel jpButton = null;
	private JLabel jl = null;
	private JButton jb = null;
	private JButton jb1 = null;
	private JButton jb2 = null;
	private JButton jb3 = null;
	private int i = 1;

	private JFrame getJFrame() {
		if (jf == null) {
			jf = new JFrame();
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setSize(640, 240);
			jf.setLocationRelativeTo(null);
			jf.setContentPane(getJContentPane());
			jf.setTitle("カウンタサンプル");
		}
		return jf;
	}
	
	private JPanel getJContentPane() {
		if (cp == null) {
			cp = new JPanel();
			cp.setLayout(new GridLayout(2,1));
			cp.add(getPne1());
			cp.add(getPne2());
		}
		return cp;
	}
	private JPanel getPne1() {
		if (jpLabel == null) {
			jpLabel = new JPanel();
			jpLabel.setLayout(new GridLayout(1,1));
			jpLabel.add(getJLabel());
		}
		return jpLabel;
	}
	private JPanel getPne2() {
		if (jpButton == null) {
			jpButton = new JPanel();
			jpButton.setLayout(new GridLayout(1,4));
			jpButton.add(getJButton());
			jpButton.add(getJButton1());
			jpButton.add(getJButton2());
			jpButton.add(getJButton3());
		}
		return jpButton;
	}
	private JLabel getJLabel() {
		if (jl == null) {
			jl = new JLabel();
			jl.setText(Integer.toString(i));
		}
		return jl;
	}

	private JButton getJButton() {
		if (jb == null) {
			jb = new JButton();
			jb.setText("+1ボタン");
			jb.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					i++;
					jl.setText(Integer.toString(i));
				}
			});
		}
		return jb;
	}
	private JButton getJButton1() {
		if (jb1 == null) {
			jb1 = new JButton();
			jb1.setText("+10ボタン");
			jb1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					i=i+10;
					jl.setText(Integer.toString(i));
				}
			});
		}
		return jb1;
	}
	private JButton getJButton2() {
		if (jb2 == null) {
			jb2 = new JButton();
			jb2.setText("+100ボタン");
			jb2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					i=i+100;
					jl.setText(Integer.toString(i));
				}
			});
		}
		return jb2;
	}
	private JButton getJButton3() {
		if (jb3 == null) {
			jb3 = new JButton();
			jb3.setText("リセットボタン");
			jb3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					i=i*0;
					jl.setText(Integer.toString(i));
				}
			});
		}
		return jb3;
	}
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Kihon4 application = new Kihon4();
				application.getJFrame().setVisible(true);
			}
		});
	}
}