// アプリケーション開発 
// 基本課題 3 
// 学年組    3 年 2 組 
// 学生番号  2212228
// 氏名      齋藤　丈
package kadai;

import java.awt.FlowLayout;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class kihon3 {
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		JFrame jf = new JFrame("基本課題3");
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(480, 360);
		JPanel cp = (JPanel) jf.getContentPane();
		cp.setLayout(new FlowLayout());
		FileReader fr = new FileReader("todoufuken.txt");
		BufferedReader br = new BufferedReader(fr);
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println(s);
			JButton jb = new JButton(s);
			cp.add(jb);
		}br.close();
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
	}

}
