package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
  public static void main(String[] args) {
    // declaramos la variable driver
    WebDriver driver;
    // esta linea sirve para que con ayuda de la libreria descargue el driver de chorme
    WebDriverManager.chromedriver().setup();
//inicializamos la variable driver
    driver = new ChromeDriver();
    //abrimos nuestra pagina
    driver.get("https://sahitest.com/demo/training/login.htm");
    //buscar elemento y escribir en el
    driver.findElement(By.name("user")).sendKeys("test");
    driver.findElement(By.name("password")).sendKeys("secre");


    // buscar elemento y hacer click
    driver.findElement(By.className("button")).click();
    //obtener texto de un elemento
    String errormsg=driver.findElement(By.id("errorMessage")).getText();
if (errormsg.equals("Invalid username or passwor")){
      System.out.println("caso exitoso");
}else{
      System.out.println("no exitoso");
}
    //cerramos el navegador
    driver.quit();
  }
}
