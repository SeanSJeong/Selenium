//AutoIT
ControlFocus("Open","","Edit1")
Sleep(3000)
ControlSetText("Open","","Edit1","C:\Users\sjeong\Downloads\Note.txt")
Sleep(3000)
ControlClick("Open","","Button1")

//Selenium
wd.findElement(By.name("")).click();
Runtime.getRuntime().exec("C:\\Users\\sjeong\\Documents\\AutoIT\\FileUploadScript.exe");
WebDriverLogin.waitT(wd, 3000);