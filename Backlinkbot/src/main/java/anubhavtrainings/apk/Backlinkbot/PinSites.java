package anubhavtrainings.apk.Backlinkbot;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Enumeration;
import java.util.concurrent.TimeUnit;

import javax.swing.AbstractButton;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.border.TitledBorder;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.xml.internal.ws.api.server.Container;

import javafx.scene.layout.Border;


public class PinSites {
	public static String currentDirectory=System.getProperty("user.dir");
	static void mypin() throws IOException
	  {
		  String currentDirectory=System.getProperty("user.dir");
			System.out.println(currentDirectory);

			WebDriver driver = BrowserFactory.getBrowserInstance(currentDirectory ,"chrome");;
			JavascriptExecutor js = (JavascriptExecutor) driver;
			driver.manage().window().maximize();
			driver.get("https://www.scoop.it/login");
			driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			WebElement elet1,  elt31, elt41, elt51, elt61, elt71,  elt81, elt91 ;
			elet1= driver.findElement(By.xpath("//input[@name='email']"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elet1);
		    elet1.click();
		    elet1.sendKeys("rahulevosolutions@gmail.com");
		    elt31= driver.findElement(By.xpath("//input[@name='password']"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elt31);
		    elt31.click();
	        elt31.sendKeys("rahul@123");
		    elt41= driver.findElement(By.xpath("//button[@class='button button-blue']"));
		    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",    elt31);
		    elt41.click();
		    WebDriverWait wait = new WebDriverWait(driver, 10);
		    elt51 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='urlChooserField']")));
		    elt51.click();
		    elt51= driver.findElement(By.xpath("//input[@id='urlChooserField']"));
		    elt51.sendKeys("https://www.anubhavtrainings.com/");
		    elt61 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='urlChooserButton']")));
		    elt61.click();
		    WebDriverWait wait1 = new WebDriverWait(driver, 30);
		    elt71 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class=\"button button-small\"]")));
		    elt71.click();
		    elt91 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='tagsEditorInput tagsEditor-input ui-autocomplete-input']")));
		    elt91.click();
		    elt71.sendKeys("#abap #anubhavtrainings #sap #onlinetraining");
		    elt81 = wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='button button-green']")));
		    elt81.click();
		    
	  }
	static void myMethod6() throws IOException
	  {
		WebDriver driver = BrowserFactory.getBrowserInstance(currentDirectory ,"chrome");;
		JavascriptExecutor js = (JavascriptExecutor) driver;
		

		try {
			
			    driver.get("https://www.onlywire.com/");
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        WebElement ele31, ele, ele1, ele12, ele13, ele14, ele15,ele16;
		        ele31= driver.findElement(By.xpath("//div[@class='header-link login']"));
		        ele31.click();
		        ele= driver.findElement(By.xpath("//input[@placeholder='Enter Email or Username']"));
		        ele.click();
		        ele.sendKeys("sonia.bajaj22f@gmail.com");
		        ele1= driver.findElement(By.xpath("//input[@placeholder='Enter Password']"));
		        ele1.click();
		        ele1.sendKeys("Anubhav123");
		        ele12= driver.findElement(By.xpath("//a[@name='submit']"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele12);
		        ele12.click();
		        ele13= driver.findElement(By.xpath("//a[@id=\"hero-new-post\"]"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele13);
		        ele13.click();
		        ele14= driver.findElement(By.xpath("//input[@id='new-post-url']"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele14);
		        ele14.click();
		        ele14.sendKeys("https://anubhav4231.blogspot.com/2020/05/abap-on-hana-training.html");
		        ele15= driver.findElement(By.xpath("//div[@data-v-46af12ac]"));
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele15);
		        ele15.click();
		        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		        ele16= driver.findElement(By.xpath("//div[@data-v-46af12ac]"));
		        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", ele16);
		        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		        System.out.println("site23");
		        ele16.click();
		        
		  } catch(Exception e) {
			  System.out.println("site23");
		  }
		 
	  }
	
	static void myMethod7(String args[]) throws IOException
	  {
	   WebDriver driver = BrowserFactory.getBrowserInstance(currentDirectory ,"chrome");
		JavascriptExecutor js = (JavascriptExecutor) driver;
		
		try {
			JFrame frame = new JFrame("Radio Buttons");
		    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		    JPanel panel = new JPanel(new GridLayout(0, 1));
		    TitledBorder border = BorderFactory.createTitledBorder("Options");
		    panel.setBorder(border);
		    final ButtonGroup group = new ButtonGroup();
		    AbstractButton abstract1 = new JRadioButton("One");
		    panel.add(abstract1);
		    group.add(abstract1);
		    AbstractButton abstract2 = new JRadioButton("Two");
		    panel.add(abstract2);
		    group.add(abstract2);
		    AbstractButton abstract3 = new JRadioButton("Three");
		    panel.add(abstract3);
		    group.add(abstract3);
		    AbstractButton abstract4 = new JRadioButton("Four");
		    panel.add(abstract4);
		    group.add(abstract4);
		    AbstractButton abstract5 = new JRadioButton("Five");
		    panel.add(abstract5);
		    group.add(abstract5);
		    ActionListener aListener = new ActionListener() {
		      public void actionPerformed(ActionEvent event) {
		        Enumeration elements = group.getElements();
		        while (elements.hasMoreElements()) {
		          AbstractButton button = (AbstractButton) elements
		              .nextElement();
		          if (button.isSelected()) {
		            System.out.println("The winner is: " + button.getText());
		            break;
		          }
		        }
		        group.setSelected(null, true);
		      }
		    };
		    JToggleButton button = new JToggleButton("Show Selected");
		    button.addActionListener(aListener);
		    java.awt.Container container = frame.getContentPane();
		    container.add(panel, BorderLayout.CENTER);
		    container.add(button, BorderLayout.SOUTH);
		    frame.setSize(300, 200);
		    frame.setVisible(true); 
		  } catch(Exception e) {
			  System.out.println("site23");
		  }
		 
	  }
	

}