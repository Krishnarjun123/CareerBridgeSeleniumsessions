import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowser {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver.exe");
        ChromeDriver obj=new ChromeDriver();
        obj.get("https://www.amazon.in");
    }
}
