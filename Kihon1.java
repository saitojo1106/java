// アプリケーション開発 
// 基本課題 1 
// 学年組    3 年 2組 
// 学生番号  2212228
// 氏名      齋藤　丈
package kadai;
public class Kihon1 { 
  public static void main(String[] args) { 
 
         int i;
         int n = 9878 ;
         int x;
         x =  0;
         for(i=1;i<=n;i++) {
        	 if(i%11 == 0) {
        		x = i + x;
        	 }
         }
         System.out.println("1から9878までの11の倍数の和は" + x + "です.");
 
    } 
} 
