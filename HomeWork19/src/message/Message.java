package message;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Message {
	@FindBy(xpath = "//*[@id=\"mailbox:login\"]")
	WebElement loginField;

	@FindBy(xpath = "//*[@id=\"mailbox:password\"]")
	WebElement passwordField;

	@FindBy(xpath = "//*[@id=\"mailbox:submit\"]")
	WebElement enterButton;

	@FindBy(xpath = "(.//div[@class=\"js-item-checkbox b-datalist__item__cbx\"])[1]")
	WebElement message;
	@FindBy(xpath = "(.//div[@class=\"js-item-checkbox b-datalist__item__cbx\"])[2]")
	WebElement message2;
	@FindBy(xpath = "(.//div[@class=\"js-item-checkbox b-datalist__item__cbx\"])[3]")
	WebElement message3;

	@FindBy(xpath = "(.//span[@class=\"b-toolbar__btn__text b-toolbar__btn__text_pad\"])[6]")
	WebElement spam;
	@FindBy(xpath = "(.//button[@data-bem=\\\"btn\\\"])[3]")
	WebElement conff;

	@FindBy(xpath = ".//div[@data-id=\"950\"]")
	WebElement spamTab;

	@FindBy(xpath = "(.//div[@class=\\\"js-item-checkbox b-datalist__item__cbx\\\"])[1]")
	WebElement message11;
	@FindBy(xpath = "(.//div[@class=\\\"js-item-checkbox b-datalist__item__cbx\\\"])[2]")
	WebElement message22;
	@FindBy(xpath = "(.//div[@class=\\\"js-item-checkbox b-datalist__item__cbx\\\"])[3]")
	WebElement message33;

	@FindBy(xpath = "(.//div[@data-bem=\"b-toolbar__btn\"])[8]")
	WebElement neSpam;

	@FindBy(xpath = ".//div[@data-id=\"0\"]")
	WebElement input;
	@FindBy(xpath = "(.//div[@data-toolbar-group=\"left\"])[1]")
	WebElement message111;
	@FindBy(xpath = ".//textarea[@tabindex=\"4\"]")
	WebElement sendMess;

	@FindBy(xpath = "(.//span[@class=\\\"btn__text\\\"])[8]")
	WebElement sendEmpty;
	@FindBy(xpath = ".//div[@class=\\\"message-sent__title\\\"]")
	WebElement isOk;

	private WebDriver driver;

	private WebDriverWait wait;

	public Message(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver, 10);
		PageFactory.initElements(driver, this);
	}

	public void inputLoginPassword(String login, String password) {
		loginField.clear();
		loginField.sendKeys(login);
		passwordField.clear();
		passwordField.sendKeys(password);
	}

	public void enterFind() {
		enterButton.click();
		wait.until(ExpectedConditions.titleContains("¬ход€щие"));
	}

	public void checkBox() {
		message.click();
		message2.click();
		message3.click();
	}

	public void sendToSpam() {
		spam.click();
		conff.click();
		driver.navigate().refresh();
		spamTab.click();
		driver.navigate().refresh();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void checkToInput() {
		message11.click();
		message22.click();
		message33.click();
		neSpam.click();
	}

	public void sendMessage(String to) {
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		driver.navigate().refresh();
		input.click();
		message111.click();
		sendMess.sendKeys(to);
		sendMess.submit();
		sendEmpty.click();
	}

	public boolean isLetterSend() {
		return isOk.isDisplayed();
	}

}
