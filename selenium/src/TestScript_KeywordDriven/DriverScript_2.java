package TestScript_KeywordDriven;

import ExcelConfig_keywordDriven.ExcelUtils;
import KeywordDrivenFramework.ActionKeywords;
import KeywordDrivenFramework.Actions;

public class DriverScript_2 {

	public static void main(String[] args) throws Exception {
		
		String spath="C:\\Users\\Admin\\git\\repository\\selenium\\testdata2\\readData2.xlsx";
		
		ExcelUtils.setExcelFile(spath, "Sheet1");
		
		for(int iRow=1;iRow<=8;iRow++) {
			
			
			String sActionKeyword=ExcelUtils.getCellData(iRow, 3);
			
			
			if(sActionKeyword.equals("openBrowser")) {
				
				ActionKeywords.OpenBrowser();
			}
			else if(sActionKeyword.equals("navigate")) {
				
				ActionKeywords.navigate();
			}
			
			
			else if(sActionKeyword.equals("input_Username")) {
				
				ActionKeywords.input_Username();
			}
			else if(sActionKeyword.equals("input_Password")) {
				
				ActionKeywords.input_Password();
			}
			else if(sActionKeyword.equals("click_Login")) {
				
				ActionKeywords.click_Login();
			}
		//	else if(sActionKeyword.equals("waitFor")) {
				
		//	   ActionKeywords.waitFor();
			//}
			
			
			else if(sActionKeyword.equals("closeBrowser")) {
				
				ActionKeywords.closeBrowser();
			}
			
			
		}
		

	}

}
