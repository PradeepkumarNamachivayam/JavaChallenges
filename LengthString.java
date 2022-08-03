package special;

public class LengthString {
	public static void main(String[] args) {
		String s2 = "luffy is still joyboy";
		String[] split = s2.split(" ");
		for (int i = 0; i < split.length; i++) {
			if(split[i].startsWith("j")) {
				System.out.println("The last word of the given string is :"+split[i]);
				System.out.println("The length of the last word is :"+split[i].length());
			}
		}
	}
}