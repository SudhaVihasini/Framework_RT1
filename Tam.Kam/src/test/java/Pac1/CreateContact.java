package Pac1;

import org.testng.annotations.Test;

public class CreateContact {

	//@Test(groups="smoke")
	//public void createcontactTest() {
		//System.out.println("execute createcontactTest");
		
	@Test
		public void createcontactTest() {
		String URL=System.getProperty("url");
		String BROWSER=System.getProperty("browser");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		System.out.println(URL);
		System.out.println(BROWSER);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
			System.out.println("execute createcontactTest");
			
	}
	@Test
	public void modifycontactTest() {
		System.out.println("execute modifycontactTest");
		
	}

}
