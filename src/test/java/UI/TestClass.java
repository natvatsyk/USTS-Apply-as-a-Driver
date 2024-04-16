package UI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestClass {
    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nvatsyk\\IdeaProjects\\Project2\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nvatsyk\\IdeaProjects\\Project2\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://beta.ustruckingservice.com/home-page-new/");
        String title = "Home Page NEW - US Trucking Service";
        Assert.assertEquals(driver.getTitle(), title);

        driver.findElement(By.xpath("/html/body/div/main/div[1]/div[2]/div/div[1]/a[1]")).click();
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);

        Timeouts.implicitlyWait(10, TimeUnit.MILLISECONDS);


        driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div/form/div[2]/div[4]/div[2]/div/div[1]/div[2]/span/span[1]/span/ul/li/input")).sendKeys("W2 Company driver");

        // By.xpath("/html/body/div[1]/main/div[1]/div/form/div[2]/div[4]/div[2]/div/div[1]/div[2]/span/span[1]/span/ul/li/input").click();
        driver.findElement(By.xpath("/html/body/div[1]/main/div[1]/div/form/div[2]/div[4]/div[2]/div/div[1]/div[2]/span/span[1]/span/ul/li/input")).sendKeys(Keys.ENTER);


        driver.findElement(By.xpath("//*[@id=\"acf-driver-form\"]/div[2]/div[4]/div[2]/div/div[2]/div[2]/span/span[1]/span/ul/li/input")).sendKeys("Dedicated");

        driver.findElement(By.xpath("//*[@id=\"acf-driver-form\"]/div[2]/div[4]/div[2]/div/div[2]/div[2]/span/span[1]/span/ul/li/input")).click();
        driver.findElement(By.xpath("//*[@id=\"acf-driver-form\"]/div[2]/div[4]/div[2]/div/div[2]/div[2]/span/span[1]/span/ul/li/input")).sendKeys(Keys.ENTER);


        driver.findElement(By.xpath("//*[@id=\"acf-driver-form\"]/div[2]/div[4]/div[2]/div/div[3]/div[2]/span/span[1]/span")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"acf-driver-form\"]/div[2]/div[4]/div[2]/div/div[3]/div[2]/span/span[1]/span")).sendKeys("Alabama");
        driver.findElement(By.xpath("//*[@id=\"acf-driver-form\"]/div[2]/div[4]/div[2]/div/div[3]/div[2]/span/span[1]/span")).sendKeys(Keys.ENTER);


        driver.findElement(By.xpath("//*[@id=\"acf-driver-form\"]/div[2]/div[4]/div[2]/div/div[4]/div[2]/span/span[1]/span")).sendKeys("Box");


        driver.findElement(By.xpath("//*[@id=\"acf-driver-form\"]/div[2]/div[4]/div[2]/div/div[4]/div[2]/span/span[1]/span")).sendKeys(Keys.ENTER);


        driver.findElement(By.xpath("//*[@id=\"acf-driver-form\"]/div[3]/div/div[1]/button[2]")).sendKeys("Next step");
        driver.findElement(By.xpath("//*[@id=\"acf-driver-form\"]/div[3]/div/div[1]/button[2]")).sendKeys(Keys.ENTER);
    }
        @Test
        public void test3() {


            System.setProperty("webdriver.chrome.driver", "C:\\Users\\nvatsyk\\IdeaProjects\\Project2\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://beta.ustruckingservice.com/home-page-new/");
            //WebElement InputField;
            // Вибірка елемента по xpath
            WebElement inputField = driver.findElement(By.xpath("//*[@id=\"acf-field_63efde56eb46d-field_63efde67eb46e\"]"));

            // Перевірка статусу поля на доступність
            if (inputField.isEnabled()) {
                // Введення тексту у поле
                inputField.sendKeys("1");

                // Натискання на кнопку Enter
                inputField.sendKeys(Keys.ENTER);
            } else {
                System.out.println("Поле недоступне для введення");
            }
            driver.findElement(By.xpath("//*[@id=\"acf-field_63efde56eb46d-field_63efde67eb46e\"]")).click();
            driver.findElement(By.xpath("//*[@id=\"acf-field_63efde56eb46d-field_63efde67eb46e\"]")).sendKeys("1");
            driver.findElement(By.xpath("//*[@id=\"acf-field_63efde56eb46d-field_63efde67eb46e\"]")).sendKeys(Keys.ENTER);

        }
                //WebElement InputField;

                        @Test
                        public void test4() {
                        class InputCalendar {
                            public void test4(String[] args) {
                                System.setProperty("webdriver.chrome.driver", "C:\\Users\\nvatsyk\\IdeaProjects\\Project2\\chromedriver-win64\\chromedriver.exe");
                                WebDriver driver = new ChromeDriver();
                                //driver.get("https://beta.ustruckingservice.com/home-page-new/");/WebElement InputField;
                                driver.findElement(By.xpath("//*[@id=\"dp1713259549364\"]")).isSelected();
                                WebElement inputField = driver.findElement(By.id("//*[@id=\"dp1713259549364\"]"));

                                inputField.sendKeys("04/01/2024");

                                // Натискання на кнопку за допомогою клавіші Enter
                                inputField.sendKeys(Keys.ENTER);

                                driver.findElement(By.xpath("//*[@id=\"acf-driver-form\"]/div[3]/div/div[1]/button[2]")).sendKeys("Next step");
                                driver.findElement(By.xpath("//*[@id=\"acf-driver-form\"]/div[3]/div/div[1]/button[2]")).sendKeys(Keys.ENTER);
                            }
                                @Test
                                public void test5() {
                                class InputFirst {
                                    public void test5(String[] args) {
                                        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nvatsyk\\IdeaProjects\\Project2\\chromedriver-win64\\chromedriver.exe");
                                        WebDriver driver = new ChromeDriver();
                                        //driver.get("https://beta.ustruckingservice.com/home-page-new/");/WebElement InputField;
                                        driver.findElement(By.xpath("//*[@id=\"acf-field_63efdba6eb460-field_63efdbb6eb461\"]")).isSelected();
                                        WebElement inputField = driver.findElement(By.id("//*[@id=\"acf-field_63efdba6eb460-field_63efdbb6eb461\"]"));

                                        inputField.sendKeys("NataliQA");

                                        // Натискання на кнопку за допомогою клавіші Enter
                                        inputField.sendKeys(Keys.ENTER);
                                    }
                                        @Test
                                        public void test6() {
                                        class InputLast {
                                            public void test6(String[] args) {
                                                System.setProperty("webdriver.chrome.driver", "C:\\Users\\nvatsyk\\IdeaProjects\\Project2\\chromedriver-win64\\chromedriver.exe");
                                                WebDriver driver = new ChromeDriver();
                                                //driver.get("https://beta.ustruckingservice.com/home-page-new/");/WebElement InputField;
                                                driver.findElement(By.xpath("//*[@id=\"acf-field_63efdba6eb460-field_63efdbc1eb462\"]")).isSelected();
                                                WebElement inputField = driver.findElement(By.id("//*[@id=\"acf-field_63efdba6eb460-field_63efdbc1eb462\"]"));

                                                inputField.sendKeys("Test");

                                                // Натискання на кнопку за допомогою клавіші Enter
                                                inputField.sendKeys(Keys.ENTER);

                                                @Test
                                                class Number {
                                                    public void test7(String[] args) {
                                                        System.setProperty("webdriver.chrome.driver", "C:\\Users\\nvatsyk\\IdeaProjects\\Project2\\chromedriver-win64\\chromedriver.exe");
                                                        WebDriver driver = new ChromeDriver();
                                                        //driver.get("https://beta.ustruckingservice.com/home-page-new/");/WebElement InputField;
                                                        driver.findElement(By.xpath("//*[@id=\"acf-field_63efdba6eb460-field_63efdbcceb463\"]")).isSelected();
                                                        WebElement inputField = driver.findElement(By.id("//*[@id=\"acf-field_63efdba6eb460-field_63efdbcceb463\"]"));

                                                        inputField.sendKeys("870-446-4540");

                                                        // Натискання на кнопку за допомогою клавіші Enter
                                                        inputField.sendKeys(Keys.ENTER);
                                                        @Test
                                                        class email {
                                                            public void test8(String[] args) {
                                                                System.setProperty("webdriver.chrome.driver", "C:\\Users\\nvatsyk\\IdeaProjects\\Project2\\chromedriver-win64\\chromedriver.exe");
                                                                WebDriver driver = new ChromeDriver();
                                                                //driver.get("https://beta.ustruckingservice.com/home-page-new/");/WebElement InputField;
                                                                driver.findElement(By.xpath("//*[@id=\"acf-field_63efdba6eb460-field_63efdbdaeb464\"]")).isSelected();
                                                                WebElement inputField = driver.findElement(By.id("//*[@id=\"acf-field_63efdba6eb460-field_63efdbdaeb464\"]"));

                                                                inputField.sendKeys("qtestdriver@gmail.com");

                                                                // Натискання на кнопку за допомогою клавіші Enter
                                                                inputField.sendKeys(Keys.ENTER);


                                                                driver.findElement(By.xpath("//*[@id=\"acf-driver-form\"]/div[3]/div/div[1]/button[2]")).sendKeys("Submit form");

                                                                // Завершення роботи драйвера
                                                                driver.quit();
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }




