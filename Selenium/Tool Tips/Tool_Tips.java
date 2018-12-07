// toolTipText
//https://www.youtube.com/watch?v=aK9qsXMN8is
String toolTipText = wd.findElement(By.id("ctl00_uxCphMainContent_ucNotificationPlans_ucTelephone_Pager_uxTxtDigitsDialedAfterConnection")).getAttribute("title");
System.out.println("Tooltip is (" + toolTipText + ")");