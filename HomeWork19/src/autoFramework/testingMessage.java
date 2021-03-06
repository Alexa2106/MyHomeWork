package autoFramework;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import message.Message;

class testingMessage {
	private WebDriver driver;
	private Message message;

	@Before
	public void before() {
		String exePath = "C:\\Program Files\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", exePath);

		driver = new ChromeDriver();

		message = new Message(driver);
	}

	@Test
	void test() {
		driver.get("https://mail.ru");
		message.inputLoginPassword("antonyourkevich09", "antonigorevichanton");
		message.enterFind();
		message.checkBox();
		message.sendToSpam();
		message.checkToInput();
		message.sendMessage("<welcome@corp.mail.ru>");
		message.isLetterSend();

	}

	@After
	public void tearDown() {

	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	

