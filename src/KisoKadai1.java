import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 
 */

/**
 * Java基礎課題１
 * 
 * @author TAKUMA INOUE
 *
 */
public class KisoKadai1 {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		System.out.println("\n九九表\n\n[the multiplication table]\n---\n");
		System.out.println("九九表の作成を開始します。\n縦軸の最大値はいくつにしますか？");
        int x = 0;
        int y = 0;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			y = Integer.parseInt(br.readLine());
			
			System.out.println("横軸の最大値はいくつにしますか？");
			br = new BufferedReader(new InputStreamReader(System.in));
			x = Integer.parseInt(br.readLine());
			System.out.println("\n縦軸の最大値："+y+" x 横軸の最大値："+x+" で九九表を作成します。\n");
		} catch (NumberFormatException | IOException e) {
			e.printStackTrace();
		}
		
		int maxLength = String.valueOf(x*y).length();
        System.out.println("最大桁数:"+maxLength);

		for (int i = 1; i <= x; i++) {
			for (int j = 1; j <= y; j++) {
				if (i * j <= 9)
					System.out.print(" ");
				System.out.print((i * j));
				 
				System.out.println(" ");
			}
			System.out.println();
		}
	}
} 
