package TestScript_KeywordDriven;

import ExcelConfig_keywordDriven.ReadExcelData;
import KeywordDrivenFramework.Actions;

public class DriverScript {

	public static void main(String[] args)throws Exception {
		
		
		String spath="C:\\Users\\Admin\\git\\repository\\selenium\\test\\example.xlsx";
		
		ReadExcelData.setExcelfile(spath,"Sheet1");

		for(int iRow=1;iRow<=7;iRow++) {
			
			String sActions=ReadExcelData.getCellData(iRow, 1);
			
			if(sActions.equals("openBrowser")) {
				
				Actions.OpenBrowser();
			}
			else if(sActions.equals("Navigate")) {
				
				Actions.Navigate();
			}
			
			else if(sActions.equals("input_Username")) {
				
				Actions.input_Username();
			}
			
			else if(sActions.equals("input_Password")) {
				
				Actions.input_Password();
			}
			
			else if(sActions.equals("click_Login")) {
				
				Actions.click_Login();
			}
			
			else if(sActions.equals("verify_Login")) {
				
				Actions.verify_Login();
			}
			
			else if(sActions.equals("closeBrowser")) {
				
				Actions.closeBrowser();
			}
			
			
		}
	}

}
