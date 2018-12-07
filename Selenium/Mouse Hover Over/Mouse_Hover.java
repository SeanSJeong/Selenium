//First
WebElement element = wd.findElement(By.xpath("//*[@id=\"ctl00_uxCphMainContent_ucMessageList_uxGvVoiceMail_ctl02_uxImgType\"]"));
Actions action = new Actions(wd);
action.moveToElement(element).build().perform();
WebDriverLogin.waitT(wd, 3000);



//Second
WebElement element = wd.findElement(By.id("ctl00_uxCphContent_ucBoxes_uxLb_Box_Reset"));
Actions action = new Actions(wd);
action.moveToElement(element).build().perform();

WebDriverWait wait = new WebDriverWait(wd, 5);
wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("ctl00_uxCphContent_ucBoxes_uxLb_Box_Reset")));