package com.example.th02160_LeQuangPhuc.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bai3 {
    private WebDriver driver;

    @BeforeEach
    void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @Test
    void testDK() throws InterruptedException {
        driver.get("https://github.com/signup?source=login");

        driver.findElement(By.xpath("//*[@id=\"email\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("phuclqth02160@fpt.edu.vn");

        driver.findElement(By.xpath("//*[@id=\"password\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("Cauvang12345@");

        driver.findElement(By.xpath("//*[@id=\"login\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login\"]")).sendKeys("SKIBIDITOLET28");

        driver.findElement(By.xpath("/html/body/div[1]/div[4]/div/main/div/div[2]/div[2]/div/div[2]/div/form/div[3]/button/span")).click();
    }

    @Test
    void testDN() throws InterruptedException {
        driver.get("https://github.com/login");

        driver.findElement(By.xpath("//*[@id=\"login_field\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"login_field\"]")).sendKeys("lqphuc2872006");

        driver.findElement(By.xpath("//*[@id=\"password\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("cauvang12345@");

        driver.findElement(By.xpath("//*[@id=\"login\"]/div[4]/form/div/input[13]")).click();
    }



}
