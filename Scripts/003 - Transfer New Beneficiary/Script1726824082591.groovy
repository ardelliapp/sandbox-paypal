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

WebUI.openBrowser('https://sandbox.paypal.com')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Dashboard/Log In'))

WebUI.setText(findTestObject('Log In/email'), 'sb-adeha32792838@personal.example.com')

WebUI.click(findTestObject('Log In/Berikutnya Sign in'))

WebUI.setText(findTestObject('Log In/password'), '$J#cZ8ud')

WebUI.click(findTestObject('Log In/Log In'))

WebUI.navigateToUrl('https://www.sandbox.paypal.com/myaccount/transfer/homepage')

WebUI.click(findTestObject('Signed In Dashboard/Send and Request/Header/Send'))

WebUI.setText(findTestObject('Signed In Dashboard/Send and Request/Send Money/Send payment to'), 'receiver-payment@personal.example.com')

WebUI.sendKeys(findTestObject('Signed In Dashboard/Send and Request/Send Money/Send payment to'), Keys.chord(Keys.ENTER))

WebUI.delay(5)

WebUI.setText(findTestObject('Signed In Dashboard/Send and Request/Send Money/input amount'), '10000')

WebUI.setText(findTestObject('Signed In Dashboard/Send and Request/Send Money/description payment'), 'testing')

WebUI.click(findTestObject('Signed In Dashboard/Send and Request/Send Money/button_Next'))

WebUI.click(findTestObject('Signed In Dashboard/Send and Request/Send Money/send to friends'))

WebUI.click(findTestObject('Signed In Dashboard/Send and Request/Send Money/pay with paypal'))

WebUI.click(findTestObject('Signed In Dashboard/Send and Request/Request Money/Next Send Money'))

WebUI.click(findTestObject('Signed In Dashboard/Send and Request/Send Money/Send'))

WebUI.verifyElementPresent(findTestObject('Signed In Dashboard/Send and Request/Send Money/Success'), 0)

WebUI.closeBrowser()

