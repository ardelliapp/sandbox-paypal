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

WebUI.openBrowser('https://sandbox.paypal.com/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Dashboard/Sign Up'))

WebUI.click(findTestObject('Sign Up/Sign Up/Rekening Pribadi'))

WebUI.click(findTestObject('Sign Up/Sign Up/Berikutnya'))

WebUI.setText(findTestObject('Sign Up/Rekening Pribadi/email'), 'testing+29@example.com')

WebUI.click(findTestObject('Sign Up/Sign Up/Berikutnya Daftar'))

WebUI.setText(findTestObject('Sign Up/Rekening Pribadi/no telepon'), '854645342211')

WebUI.click(findTestObject('Sign Up/Sign Up/Berikutnya Daftar'))

WebUI.setText(findTestObject('Sign Up/Rekening Pribadi/OTP'), '111111')

WebUI.delay(1)

WebUI.click(findTestObject('Sign Up/Sign Up/Berikutnya Daftar'))

WebUI.setText(findTestObject('Sign Up/Rekening Pribadi/password'), 'Admin123_')

WebUI.delay(1)

WebUI.click(findTestObject('Sign Up/Sign Up/Berikutnya Daftar'))

WebUI.setText(findTestObject('Sign Up/Rekening Pribadi/First Name'), 'Ardellia')

WebUI.setText(findTestObject('Sign Up/Rekening Pribadi/Last Name'), 'Testing')

WebUI.setText(findTestObject('Sign Up/Rekening Pribadi/Input ID'), '5556664568787')

WebUI.setText(findTestObject('Sign Up/Rekening Pribadi/DOB'), '11022000')

WebUI.click(findTestObject('Sign Up/Rekening Pribadi/Berikutnya 2'))

WebUI.setText(findTestObject('Sign Up/Rekening Pribadi/Address'), 'Bungur')

WebUI.setText(findTestObject('Sign Up/Rekening Pribadi/Kota'), 'Jakarta')

WebUI.setText(findTestObject('Sign Up/Rekening Pribadi/Kode Pos'), '22232')

WebUI.click(findTestObject('Sign Up/Rekening Pribadi/Provinsi'))

WebUI.click(findTestObject('Sign Up/Rekening Pribadi/Jakarta'))

WebUI.click(findTestObject('Sign Up/Rekening Pribadi/Agreement Check'))

WebUI.click(findTestObject('Sign Up/Rekening Pribadi/Agreement'))

WebUI.delay(1)

WebUI.click(findTestObject('Sign Up/Rekening Pribadi/Jangan sekarang'))

WebUI.click(findTestObject('Sign Up/Rekening Pribadi/Jangan sekarang'))

WebUI.delay(1)

WebUI.setText(findTestObject('Sign Up/Link to Card/Card No'), '5241253838108697')

WebUI.delay(1)

WebUI.setText(findTestObject('Sign Up/Link to Card/exp Date'), '102029')

WebUI.setText(findTestObject('Sign Up/Link to Card/Verification Code'), '123')

WebUI.delay(1)

WebUI.click(findTestObject('Sign Up/Link to Card/Hubungkan Kartu'))

WebUI.click(findTestObject('Sign Up/Link to Card/Hubungkan Kartu'))

WebUI.delay(10)

WebUI.click(findTestObject('Sign Up/Link to Card/Selesai'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Sign Up/Link to Card/Saldo PayPal'), 10)

WebUI.closeBrowser()

