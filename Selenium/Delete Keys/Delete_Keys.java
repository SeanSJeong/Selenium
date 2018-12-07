WebElement toClear = driver.findElement(By.id("txtComments"));
toClear.sendKeys(Keys.CONTROL + "a");
toClear.sendKeys(Keys.DELETE);