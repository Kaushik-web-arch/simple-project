
package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebpageTest {
    @Test
    public void testWebsite() {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://kaushik-web-arch.github.io/simple-project/");
            Assert.assertEquals(driver.getTitle(), "My Simple Website");
        } finally {
            driver.quit();
        }
    }
}
