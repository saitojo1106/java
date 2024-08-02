// アプリケーション開発 
// 基本課題 6
// 学年組    3 年 2 組 
// 学生番号  2212228
// 氏名      齋藤　丈
package kadai;

import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

public class Kihon6 {

	private JFrame jf = null;
	private JPanel cp = null, p1 = null;
	private JPanel jpBottom = null;
	private JLabel label1 = null;
	private JLabel label2 = null;
	private JButton button = null;
	private JLabel statusLabel = null;

	private JFrame getJFrame() {
		if (jf == null) {
			jf = new JFrame("基本課題 6");
			jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			jf.setSize(480, 360); // Set size to 480x360 pixels
			jf.setLocationRelativeTo(null); // Center the JFrame on screen
			jf.setContentPane(getJContentPane());
		}
		return jf;
	}

	private JPanel getJContentPane() {
		if (cp == null) {
			cp = new JPanel();
			cp.setLayout(new GridLayout(2,1));
			cp.add(getJContentPane1());
			cp.add(getJLabel3());
		}
		return cp;
	}

	private JPanel getJContentPane1() {
		if (p1 == null) {
			p1 = new JPanel();
			p1.setLayout(new GridLayout(1, 3));
			p1.add(getJButton());
			p1.add(getJLabel1());
			p1.add(getJLabel2());
		}
		return p1;
	}

	private JPanel getJLabel3() {
		if (jpBottom == null) {
			jpBottom = new JPanel();
			jpBottom.setLayout(new GridLayout());
			jpBottom.add(getStatusLabel());
		}
		return jpBottom;
	}

	private JLabel getJLabel1() {
		if (label1 == null) {
			label1 = new JLabel("ラベル1", SwingConstants.CENTER);
			label1.setHorizontalAlignment(SwingConstants.CENTER);
			label1.addMouseListener(new MouseAdapter() {
				@Override
				public void mousePressed(MouseEvent e) {
					statusLabel.setText("MOUSE_PRESSED");
				}

				@Override
				public void mouseReleased(MouseEvent e) {
					statusLabel.setText("MOUSE_RELEASED");
				}
			});
		}
		return label1;
	}

	private JLabel getJLabel2() {
		if (label2 == null) {
			label2 = new JLabel("ラベル2", SwingConstants.CENTER);
			label2.setHorizontalAlignment(SwingConstants.CENTER);
			label2.addMouseListener(new MyMouseAdapter(getStatusLabel()));
			label2.addMouseMotionListener(new MyMouseAdapter(getStatusLabel()));
		}
		return label2;
	}

	private JButton getJButton() {
		if (button == null) {
			button = new JButton("ボタン");
			button.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseEntered(MouseEvent e) {
					statusLabel.setText("MOUSE_ENTERED");
				}

				@Override
				public void mouseExited(MouseEvent e) {
					statusLabel.setText("MOUSE_EXITED");
				}
			});
		}
		return button;
	}

	private JLabel getStatusLabel() {
		if (statusLabel == null) {
			statusLabel = new JLabel("", SwingConstants.CENTER);
		}
		return statusLabel;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				Kihon6 application = new Kihon6();
				application.getJFrame().setVisible(true);
			}
		});
	}

}

class MyMouseAdapter extends MouseAdapter {
	private JLabel statusLabel;
	private int x0, y0;

	public MyMouseAdapter(JLabel statusLabel) {
		this.statusLabel = statusLabel;
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		 x0 = e.getX();
		 y0 = e.getY();
		statusLabel.setText("MOUSE_MOVED: (" + x0 + ", " + y0 + ")");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		statusLabel.setText("MOUSE_DRAGGED: (" + x0 + ", " + y0 + ")-(" + x + ", " + y + ")");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		x0 = e.getX();
		y0 = e.getY();
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getClickCount() == 2) {
			statusLabel.setText("MOUSE_DOUBLE_CLICKED");
		} else {
			statusLabel.setText("MOUSE_CLICKED");
		}
	}
}
