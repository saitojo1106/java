// アプリケーション開発 
// 基本課題 2 
// 学年組    3 年 2 組 
// 学生番号  2212228
// 氏名      齋藤　丈
package kadai;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Kihon2 {

	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		FileReader fr = new FileReader("kihon2in.txt");
		BufferedReader br = new BufferedReader(fr);
		FileWriter fw = new FileWriter("kihon2out.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		int x;
		x = 0;
		String s;
		while ((s = br.readLine()) != null) {
			System.out.println("”" + s + "”" + "の文字数は" + s.length() + "です．");
			bw.write("”" + s + "”" + "の文字数は" + s.length() + "です．");
			bw.newLine();
			x = x + 1;
		}
		System.out.println("全部で" + x + "行です");
		bw.write("全部で" + x + "行です.");
		bw.newLine();
		br.close();
		bw.close();
	}

}
