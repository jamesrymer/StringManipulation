
public class StringCode {
	
	public static String blowUp(String str){
		StringBuilder sb = new StringBuilder(str);
		for(int i = 0; i < sb.toString().length();i++) {
			if(Character.isDigit(sb.toString().charAt(i))) {
				
				if(Character.isDigit(sb.toString().charAt(i+1))) {
					
				} else {
					for( int j = 0; j < Integer.parseInt(sb.toString().charAt(i) + ""); j++) {
						sb.insert(i+1, sb.toString().charAt(i+1));
					}
					sb.deleteCharAt(i);
				}
			}
		}
		return sb.toString();
	}
	
	public static int maxRun(String str){
		char[] chars = str.toCharArray();
		int maxRun = 0;
		int currentRun = 1;
		for (int i = 0; i < chars.length; i++) {
			
				if(i < chars.length-1 && chars[i] == chars[i+1]) {
					currentRun++;
				} else {
					if (currentRun > maxRun) {
						maxRun = currentRun;
					}
					currentRun = 1;
				}
			}
		
		return maxRun;
	}
}
