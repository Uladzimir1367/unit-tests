package seminars.five;


import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeleniumTest {
    @Test
    void selenium() {
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://Google.com");
        WebElement webElement = webDriver.findElement(By.name("q"));
        webElement.sendKeys("selenium");
        webElement.submit();

        webElement = webDriver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/div/div/div/div/cite"));

        assertEquals("https://www.selenium.dev", webElement.getText());
        webDriver.quit();
    }

    /**
     * Нужно написать сквозной тест с использованием Selenium, который авторизует пользователя на
     * сайте ttps://hwww.saucedemo.com/.
     * Данные для входа - логин: "standard_user", пароль: "secret_sauce".
     * Проверить, что авторизация прошла успешно и отображаются товары.
     * Вам необходимо использовать WebDriver для открытия страницы и методы sendKeys() для ввода
     * данных в поля формы, и submit() для отправки формы. После этого, проверьте, что на странице
     * отображаются продукты (productsLabel.getText() = "Products").
     */

    @Test
    void testAvtorization() {
        WebDriver webDriver = new EdgeDriver();
        webDriver.get("https://www.saucedemo.com/");

        WebElement webElement = webDriver.findElement(By.name("user-name"));
        webElement.sendKeys("standard_user");
        webElement = webDriver.findElement(By.id("password"));
        webElement.sendKeys("secret_sauce");
        webElement = webDriver.findElement(By.name("login-button"));
        webElement.click();

        webElement = webDriver.findElement(By.className("title"));

        assertEquals("Products", webElement.getText());
        webDriver.quit();
    }
}


