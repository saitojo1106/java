package kadai;

public class Hatten1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int i;
        int n = 1000 ;
        int x;
        x =  0;        
        for(i=1;i<=n;i++) {
       	 if(i%3 == 0||i/10==3||i/10%10==3||i/100==3||i%10==3) {
       		x = i + x;
       	 }
        }           
        System.out.println("1から1000までの3の倍数と3の付く数字の和は" + x + "です.");
	}

}
