package unit10;

import java.util.Arrays;
import java.util.List;

public class q1005 {
	public static void main (String... args) {
		
		List<String> Strings 
		= Arrays.asList("1","2","3","4","5");
		
		// 標準for文
		// 逆順、1つ飛ばしでも処理が可能
		for (int i=0; i < Strings.size(); i++) {
			System.out.println(Strings.get(i));	
		}
		
		// 拡張for文
		// Java SE5 で導入
		// 順方向、1つ筒しか処理できない
		for (String target: Strings) {
			System.out.println(target);
		}
	}
}
