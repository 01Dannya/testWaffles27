package utilities;

import pageObjects.commonPage;

public class PageInitializer {
	
	public static commonPage cP;
	
	public static void initialize() {
		
		cP = new commonPage();
	}

}
