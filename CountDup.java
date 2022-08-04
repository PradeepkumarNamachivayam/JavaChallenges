package special;

import org.bouncycastle.util.Arrays;

public class CountDup {

	public static void main(String[] args) {
		int num[] = {4,1,2,1,2};
		boolean[] flag = new boolean[num.length];
		Arrays.fill(flag, false);
		
		for (int i = 0; i < num.length; i++) {
			for (int j = i+1; j < num.length; j++) {
				if (num[i]==num[j]) {
					flag[i]= true;
					flag[j]=true;
				}
			}
			
			
		}
		for (int j= 0; j< num.length; j++) {
			if (!flag[j]) {
				System.out.println(num[j]);
			}
			
		}
	}
}