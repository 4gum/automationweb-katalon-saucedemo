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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('SD100 - Login/SD102 - Verify user can login using correct username password'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Homepage/btnBurger'), 3)

WebUI.verifyElementPresent(findTestObject('Homepage/cardItem'), 3)

WebUI.verifyElementPresent(findTestObject('Homepage/cart'), 3)

WebUI.verifyElementPresent(findTestObject('Homepage/filterComponent'), 3)

WebUI.verifyElementPresent(findTestObject('Homepage/headerSwagLabs'), 3)

WebUI.verifyElementPresent(findTestObject('Homepage/itemDescription'), 3)

WebUI.verifyElementPresent(findTestObject('Homepage/itemPrice'), 3)

