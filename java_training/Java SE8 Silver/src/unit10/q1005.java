package unit10;

import java.util.Arrays;
import java.util.List;

public class q1005 {
	public static void main (String... args) {
		
		List<String> Strings 
		= Arrays.asList("1","2","3","4","5");
		
		// �W��for��
		// �t���A1��΂��ł��������\
		for (int i=0; i < Strings.size(); i++) {
			System.out.println(Strings.get(i));	
		}
		
		// �g��for��
		// Java SE5 �œ���
		// �������A1�����������ł��Ȃ�
		for (String target: Strings) {
			System.out.println(target);
		}
	}
}
