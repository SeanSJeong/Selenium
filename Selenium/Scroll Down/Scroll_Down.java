driver.findElement(By.id("search-inp1")).click();
Thread.sleep(3000);;
driver.findElement(By.id("search-button-bottom")).click);
jse = (JavascriptExecutor)driver;
jse.executeScript("scroll(0, 800)");
driver.findElement(By.xpath("//label[contains(text(), 'Weekend')]")).click();	