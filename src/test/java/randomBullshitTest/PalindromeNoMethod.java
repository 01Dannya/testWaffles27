package randomBullshitTest;

public class PalindromeNoMethod {
	
	public static void main(String[] args) {
		
		String[] testList = {"notaPal","carrac","test","hannah","wow","deed","daniel"};
		
		int palCounter = 0;
		
		for(int i = 0; i < (testList.length); i++ ) {
			
	
			
			String palCheckStr = "";
			
			for(int j = (testList[i].length()-1); j>=0; j--) {
				
				palCheckStr += testList[i].charAt(j);
				
			}
			
			if (palCheckStr.equals(testList[i])) {
				
				System.out.println(testList[i]+ " is a palindrome! Palindrome count: " + ++palCounter);
			}else {
				
				System.out.println(testList[i]+ " is not a palindrome! Palindrome count: " + palCounter);
			}
			
			
			
		}
		
		
		
	}
	

}
