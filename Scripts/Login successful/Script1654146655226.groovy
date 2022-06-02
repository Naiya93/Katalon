import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://devapp.tryspeed.com/login')

WebUI.openBrowser('')

WebUI.navigateToUrl('https://devapp.tryspeed.com/login')

WebUI.setText(findTestObject('Object Repository/Login/Page_Speed Sign in/input_Email Address_email'), 'naiya+21@tryspeed.com')

WebUI.sendKeys(findTestObject('Object Repository/Login/Page_Speed Sign in/input_Email Address_email'), Keys.chord(Keys.ENTER))

WebUI.setEncryptedText(findTestObject('Object Repository/Login/Page_Speed Sign in/input_Password_password'), 'cvW8qx4B2o3F4VwP/kNsqA==')

WebUI.click(findTestObject('Object Repository/Login/Page_Speed Sign in/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Login/Page_Dashboard - Account11 - Speed/img_Logging out_MuiAvatar-img css-1hy9t21'))

WebUI.click(findTestObject('Object Repository/Login/Page_Dashboard - Account11 - Speed/li_Logout'))

WebUI.closeBrowser()

