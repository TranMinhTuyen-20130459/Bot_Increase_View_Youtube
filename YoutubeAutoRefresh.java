import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class YoutubeAutoRefresh {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver1 = new EdgeDriver();
        WebDriver driver2 = new EdgeDriver();
        WebDriver driver3 = new EdgeDriver();
        WebDriver driver4 = new EdgeDriver();
        WebDriver driver5 = new EdgeDriver();

        driver1.get("https://www.youtube.com/watch?v=h67-kj_Psds");
        driver2.get("https://www.youtube.com/watch?v=h67-kj_Psds");
        driver3.get("https://www.youtube.com/watch?v=h67-kj_Psds");
        driver4.get("https://www.youtube.com/watch?v=h67-kj_Psds");
        driver5.get("https://www.youtube.com/watch?v=h67-kj_Psds");

        long startTime = System.currentTimeMillis();
        System.out.println(startTime);

        while (true) {

            // Kiểm tra nếu đã trôi qua 10 phút
            long currentTime = System.currentTimeMillis();
            if (currentTime - startTime > 600000) {
                System.out.println("Chương trình đã kết thúc !!!");
                break;
            }

            driver1.navigate().refresh();
            driver2.navigate().refresh();
            driver3.navigate().refresh();
            driver4.navigate().refresh();
            driver5.navigate().refresh();

            Thread.sleep(200000); // tạm dừng luồng trong 200 giây

        }

        driver1.quit(); // method này dùng để tắt trình duyệt được mở bởi Selenium WebDriver
        driver2.quit();
        driver3.quit();
        driver4.quit();
        driver5.quit();

    }
}
