$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("PhpTravel.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "# Login feature review the behavior in thie feature"
    }
  ],
  "line": 2,
  "name": "Login",
  "description": "",
  "id": "login",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Home page is displayed once set credential in login page",
  "description": "",
  "id": "login;home-page-is-displayed-once-set-credential-in-login-page",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "\u0027PHP travel\u0027 page is loaded",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "set my credentials on \u0027Login\u0027 page",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.phpTravelPageIsLoaded()"
});
formatter.result({
  "duration": 14933528600,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.setMyCredentialsOnLoginPage()"
});
formatter.result({
  "duration": 1513188800,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 9,
      "value": "#Option Hotels"
    },
    {
      "line": 11,
      "value": "#Option Flights"
    },
    {
      "line": 13,
      "value": "#Option Tours"
    }
  ],
  "line": 16,
  "name": "Tours Page display",
  "description": "",
  "id": "login;tours-page-display",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 15,
      "name": "@CNT"
    }
  ]
});
formatter.step({
  "line": 17,
  "name": "click on tours menu",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "go to the tours page",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "click on add button on Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "select \"Enabled\" Status on Add Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "fill \"Bolivia\" Name field on Add Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "fill \"2\" Quantity Adults field on Add Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "fill \"260\" Price Adults field on Add Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "select \"3\" Stars on Add Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "fill \"3\" Total Days field on Add Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "fill \"2\" Total Nights field on Add Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 27,
  "name": "select \"Adventure\" Tour Type on Add Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "select \"Yes\" Feature on Add Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 29,
  "name": "select \"La Paz\" Location 1 on Add Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "click On Submit on Add Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "close Session on Dashboard page",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnToursMenu()"
});
formatter.result({
  "duration": 12132661500,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.goToTheToursPage()"
});
formatter.result({
  "duration": 22108711400,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnAddButton()"
});
formatter.result({
  "duration": 11377372100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Enabled",
      "offset": 8
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectState(String)"
});
formatter.result({
  "duration": 915624100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Bolivia",
      "offset": 6
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillNameField(String)"
});
formatter.result({
  "duration": 467215900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 6
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillQuantityAdultsFieldOnAddToursPage(String)"
});
formatter.result({
  "duration": 236610500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "260",
      "offset": 6
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillPriceAdultsFieldOnAddToursPage(String)"
});
formatter.result({
  "duration": 288619300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 8
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectStars(String)"
});
formatter.result({
  "duration": 246765400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 6
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillTotalDaysField(String)"
});
formatter.result({
  "duration": 258757400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 6
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillTotalNightsField(String)"
});
formatter.result({
  "duration": 270854800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Adventure",
      "offset": 8
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectTourType(String)"
});
formatter.result({
  "duration": 4659523400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes",
      "offset": 8
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectFeature(String)"
});
formatter.result({
  "duration": 252097500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "La Paz",
      "offset": 8
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectLocation1OnAddToursPage(String)"
});
formatter.result({
  "duration": 6603342900,
  "status": "passed"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnSubmitOnAddToursPage()"
});
formatter.result({
  "duration": 239543200,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003cbutton class\u003d\"btn btn-primary submitfrm\" id\u003d\"add\"\u003e...\u003c/button\u003e is not clickable at point (323, 596). Other element would receive the click: \u003cdiv id\u003d\"select2-drop-mask\" class\u003d\"select2-drop-mask\" style\u003d\"display: block;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d74.0.3729.131)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-K048LMK\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Pame\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 74.0.3729.131, webStorageEnabled: true}\nSession ID: 52d128beba63b72e3eb81a8fefaf395f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat org.umssdiplo.automationv01.core.utils.CommonEvents.clickButton(CommonEvents.java:36)\r\n\tat org.umssdiplo.automationv01.core.managepage.Dashboard.ToursPage.Tours.AddTours.AddToursPage.clickOnSubmit(AddToursPage.java:124)\r\n\tat org.umssdiplo.automationv01.stepdefinitionproject.StepsDefinitionPHPtravel.clickOnSubmitOnAddToursPage(StepsDefinitionPHPtravel.java:127)\r\n\tat ✽.And click On Submit on Add Tours page(PhpTravel.feature:30)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.cerrarSesionOnDashboardPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 34,
  "name": "Tours Page display and edit an element",
  "description": "",
  "id": "login;tours-page-display-and-edit-an-element",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 33,
      "name": "@ENT"
    }
  ]
});
formatter.step({
  "line": 35,
  "name": "click on tours menu",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "go to the tours page",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "click on SearchButton on Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "fill element to search \"Bolivia\" Search field On Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "select by field \"Name\" on Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "click on GO button on Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "choose the element to select on Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "click on icon edit element selected on Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 43,
  "name": "select \"Disabled\" Status on Edit Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 44,
  "name": "edit with \"Mexico\" Name field on Edit Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 45,
  "name": "edit with \"4\" Quantity Adults field on Edit Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 46,
  "name": "click On Submit on Edit Tours page",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnToursMenu()"
});
formatter.result({
  "duration": 206918700,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca href\u003d\"#Tours\" data-toggle\u003d\"collapse\" aria-expanded\u003d\"false\"\u003e...\u003c/a\u003e is not clickable at point (120, 434). Other element would receive the click: \u003cdiv id\u003d\"select2-drop-mask\" class\u003d\"select2-drop-mask\" style\u003d\"display: block;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d74.0.3729.131)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-K048LMK\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Pame\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 74.0.3729.131, webStorageEnabled: true}\nSession ID: 52d128beba63b72e3eb81a8fefaf395f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat org.umssdiplo.automationv01.core.utils.CommonEvents.clickButton(CommonEvents.java:36)\r\n\tat org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard.clickToursMenu(Dashboard.java:20)\r\n\tat org.umssdiplo.automationv01.stepdefinitionproject.StepsDefinitionPHPtravel.clickOnToursMenu(StepsDefinitionPHPtravel.java:62)\r\n\tat ✽.And click on tours menu(PhpTravel.feature:35)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.goToTheToursPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnSearchButtonOnToursPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Bolivia",
      "offset": 24
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillElementeToSearchSearchFieldOnToursPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Name",
      "offset": 17
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectByFieldOnToursPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnGOButtonOnToursPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.chooseTheElementToSelectOnRoutePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnIconEditElementSelectedOnRoutePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Disabled",
      "offset": 8
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectStatusOnEditToursPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Mexico",
      "offset": 11
    }
  ],
  "location": "StepsDefinitionPHPtravel.editWithNameFieldOnEditRoutePage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 11
    }
  ],
  "location": "StepsDefinitionPHPtravel.editWithQuantityAdultsFieldOnEditRoutePage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnSubmitOnEditRoutePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 49,
  "name": "Tours Page display and delete an element",
  "description": "",
  "id": "login;tours-page-display-and-delete-an-element",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@DNT"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "click on tours menu",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "go to the tours page",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "click on SearchButton on Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "fill element to search \"Bolivia\" Search field On Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "select by field \"Name\" on Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "click on GO button on Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "choose the element to select on Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "click on icon delete element selected on Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "press on the Enter key to delete the chosen element on Tours page",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "close Session on Dashboard page",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnToursMenu()"
});
formatter.result({
  "duration": 166207400,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca href\u003d\"#Tours\" data-toggle\u003d\"collapse\" aria-expanded\u003d\"false\"\u003e...\u003c/a\u003e is not clickable at point (120, 434). Other element would receive the click: \u003cdiv id\u003d\"select2-drop-mask\" class\u003d\"select2-drop-mask\" style\u003d\"display: block;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d74.0.3729.131)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-K048LMK\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Pame\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 74.0.3729.131, webStorageEnabled: true}\nSession ID: 52d128beba63b72e3eb81a8fefaf395f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat org.umssdiplo.automationv01.core.utils.CommonEvents.clickButton(CommonEvents.java:36)\r\n\tat org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard.clickToursMenu(Dashboard.java:20)\r\n\tat org.umssdiplo.automationv01.stepdefinitionproject.StepsDefinitionPHPtravel.clickOnToursMenu(StepsDefinitionPHPtravel.java:62)\r\n\tat ✽.And click on tours menu(PhpTravel.feature:50)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.goToTheToursPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnSearchButtonOnToursPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Bolivia",
      "offset": 24
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillElementeToSearchSearchFieldOnToursPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Name",
      "offset": 17
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectByFieldOnToursPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnGOButtonOnToursPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.chooseTheElementToSelectOnRoutePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnIconDeleteElementSelectedOnToursPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.pressOnTheEnterKeyToDeleteTheChosenElementOnToursPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.cerrarSesionOnDashboardPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 62,
  "name": "Tours Page display and create a new AddNew",
  "description": "",
  "id": "login;tours-page-display-and-create-a-new-addnew",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 61,
      "name": "@CNA"
    }
  ]
});
formatter.step({
  "line": 63,
  "name": "click on tours menu",
  "keyword": "And "
});
formatter.step({
  "line": 64,
  "name": "go to the Add New page",
  "keyword": "And "
});
formatter.step({
  "line": 65,
  "name": "select \"Enabled\" Status on Add New page",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "fill \"Bolivia\" Name field on Add New page",
  "keyword": "And "
});
formatter.step({
  "line": 67,
  "name": "fill \"2\" Quantity Adults field on Add New page",
  "keyword": "And "
});
formatter.step({
  "line": 68,
  "name": "fill \"260\" Price Adults field on Add New page",
  "keyword": "And "
});
formatter.step({
  "line": 69,
  "name": "select \"3\" Stars on Add New page",
  "keyword": "And "
});
formatter.step({
  "line": 70,
  "name": "fill \"3\" Total Days field on Add New page",
  "keyword": "And "
});
formatter.step({
  "line": 71,
  "name": "fill \"2\" Total Nights field on Add New page",
  "keyword": "And "
});
formatter.step({
  "line": 72,
  "name": "select \"Adventure\" Tour Type on Add New page",
  "keyword": "And "
});
formatter.step({
  "line": 73,
  "name": "select \"Yes\" Feature on Add New page",
  "keyword": "And "
});
formatter.step({
  "line": 74,
  "name": "select \"La Paz\" Location 1 on Add New page",
  "keyword": "And "
});
formatter.step({
  "line": 75,
  "name": "click On Submit on Add New page",
  "keyword": "And "
});
formatter.step({
  "line": 76,
  "name": "close Session on Dashboard page",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnToursMenu()"
});
formatter.result({
  "duration": 169366300,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca href\u003d\"#Tours\" data-toggle\u003d\"collapse\" aria-expanded\u003d\"false\"\u003e...\u003c/a\u003e is not clickable at point (120, 434). Other element would receive the click: \u003cdiv id\u003d\"select2-drop-mask\" class\u003d\"select2-drop-mask\" style\u003d\"display: block;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d74.0.3729.131)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-K048LMK\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Pame\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 74.0.3729.131, webStorageEnabled: true}\nSession ID: 52d128beba63b72e3eb81a8fefaf395f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat org.umssdiplo.automationv01.core.utils.CommonEvents.clickButton(CommonEvents.java:36)\r\n\tat org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard.clickToursMenu(Dashboard.java:20)\r\n\tat org.umssdiplo.automationv01.stepdefinitionproject.StepsDefinitionPHPtravel.clickOnToursMenu(StepsDefinitionPHPtravel.java:62)\r\n\tat ✽.And click on tours menu(PhpTravel.feature:63)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.goToTheAddNewPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Enabled",
      "offset": 8
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectStateFields(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Bolivia",
      "offset": 6
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillNamesFields(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 6
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillQuantityAdultsFieldsOnAddToursPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "260",
      "offset": 6
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillPriceAdultsFieldsOnAddToursPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 8
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectStar(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 6
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillTotalDaysFields(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 6
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillTotalNightsFields(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Adventure",
      "offset": 8
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectToursType(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes",
      "offset": 8
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectFeatures(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "La Paz",
      "offset": 8
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectLocation1OnAddNewPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnSubmitOnAddNewPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.cerrarSesionOnDashboardPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 79,
  "name": "create a new Extra",
  "description": "",
  "id": "login;create-a-new-extra",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 78,
      "name": "@CNE"
    }
  ]
});
formatter.step({
  "line": 80,
  "name": "click on tours menu",
  "keyword": "And "
});
formatter.step({
  "line": 81,
  "name": "go to the Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 82,
  "name": "click on add button on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 83,
  "name": "fill \"Cochabamba\" Name field on Add Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 84,
  "name": "fill \"Yes\" Status field on Add Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 85,
  "name": "fill \"250\" Price field on Add Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 86,
  "name": "wait upload image \"cochabamba.jpg\" on Add Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 87,
  "name": "click button Save and Return on Add Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 88,
  "name": "close Session on Dashboard page",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnToursMenu()"
});
formatter.result({
  "duration": 176027500,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca href\u003d\"#Tours\" data-toggle\u003d\"collapse\" aria-expanded\u003d\"false\"\u003e...\u003c/a\u003e is not clickable at point (120, 434). Other element would receive the click: \u003cdiv id\u003d\"select2-drop-mask\" class\u003d\"select2-drop-mask\" style\u003d\"display: block;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d74.0.3729.131)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-K048LMK\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Pame\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 74.0.3729.131, webStorageEnabled: true}\nSession ID: 52d128beba63b72e3eb81a8fefaf395f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat org.umssdiplo.automationv01.core.utils.CommonEvents.clickButton(CommonEvents.java:36)\r\n\tat org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard.clickToursMenu(Dashboard.java:20)\r\n\tat org.umssdiplo.automationv01.stepdefinitionproject.StepsDefinitionPHPtravel.clickOnToursMenu(StepsDefinitionPHPtravel.java:62)\r\n\tat ✽.And click on tours menu(PhpTravel.feature:80)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.goToTheAirlinePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnAddButtonOnExtrasPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cochabamba",
      "offset": 6
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillNameFieldOnAddExtrasPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Yes",
      "offset": 6
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillStatusFieldOnAddExtraPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "250",
      "offset": 6
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillPriceFieldOnAddExtraPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "cochabamba.jpg",
      "offset": 19
    }
  ],
  "location": "StepsDefinitionPHPtravel.waitUploadImageOnAddExtraPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickButtonSaveAndReturnOnAddExtraPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.cerrarSesionOnDashboardPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 91,
  "name": "View the new Extra",
  "description": "",
  "id": "login;view-the-new-extra",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 90,
      "name": "@VNE"
    }
  ]
});
formatter.step({
  "line": 92,
  "name": "click on tours menu",
  "keyword": "And "
});
formatter.step({
  "line": 93,
  "name": "go to the Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 94,
  "name": "click on Search button on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 95,
  "name": "fill element to search \"Cochabamba\" Search field on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 96,
  "name": "select by field \"Name\" on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 97,
  "name": "click on GO button on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 98,
  "name": "choose the element to select on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 99,
  "name": "click on icon inspect element selected on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 100,
  "name": "check with \"Cochabamba\" Name field on View page",
  "keyword": "And "
});
formatter.step({
  "line": 101,
  "name": "check with \"BOLIVIA\" Status field on View page",
  "keyword": "And "
});
formatter.step({
  "line": 102,
  "name": "check with \"350\" Price field on View page",
  "keyword": "And "
});
formatter.step({
  "line": 103,
  "name": "click button Return on Views page",
  "keyword": "And "
});
formatter.step({
  "line": 104,
  "name": "close Session on Dashboard page",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnToursMenu()"
});
formatter.result({
  "duration": 178738500,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca href\u003d\"#Tours\" data-toggle\u003d\"collapse\" aria-expanded\u003d\"false\"\u003e...\u003c/a\u003e is not clickable at point (120, 434). Other element would receive the click: \u003cdiv id\u003d\"select2-drop-mask\" class\u003d\"select2-drop-mask\" style\u003d\"display: block;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d74.0.3729.131)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-K048LMK\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Pame\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 74.0.3729.131, webStorageEnabled: true}\nSession ID: 52d128beba63b72e3eb81a8fefaf395f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat org.umssdiplo.automationv01.core.utils.CommonEvents.clickButton(CommonEvents.java:36)\r\n\tat org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard.clickToursMenu(Dashboard.java:20)\r\n\tat org.umssdiplo.automationv01.stepdefinitionproject.StepsDefinitionPHPtravel.clickOnToursMenu(StepsDefinitionPHPtravel.java:62)\r\n\tat ✽.And click on tours menu(PhpTravel.feature:92)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.goToTheAirlinePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnSearchButtonOnExtrasPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cochabamba",
      "offset": 24
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillElementToSearchSearchFieldOnExtrasPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Name",
      "offset": 17
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectByFieldOnExtrasPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnGOButtonOnExtrasPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.chooseTheElementToSelectOnAirlinePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnIconInspectElementSelectedOnExtrasPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cochabamba",
      "offset": 12
    }
  ],
  "location": "StepsDefinitionPHPtravel.checkWithNameFieldOnViewPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "BOLIVIA",
      "offset": 12
    }
  ],
  "location": "StepsDefinitionPHPtravel.checkWithCountryFieldOnInspectAirlinePage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "350",
      "offset": 12
    }
  ],
  "location": "StepsDefinitionPHPtravel.checkWithPriceFieldOnViewPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickButtonReturnOnInspectAirlinePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.cerrarSesionOnDashboardPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 107,
  "name": "edit the new Extra",
  "description": "",
  "id": "login;edit-the-new-extra",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 106,
      "name": "@ENE"
    }
  ]
});
formatter.step({
  "line": 108,
  "name": "click on tours menu",
  "keyword": "And "
});
formatter.step({
  "line": 109,
  "name": "go to the Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 110,
  "name": "click on Search button on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 111,
  "name": "fill element to search \"Cochabamba\" Search field on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 112,
  "name": "select by field \"Name\" on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 113,
  "name": "click on GO button on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 114,
  "name": "choose the element to select on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 115,
  "name": "click on icon edit element selected on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 116,
  "name": "edit with \"Cochabamba\" Name field on Edit Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 117,
  "name": "edit select \"No\" Status field on Edit Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 118,
  "name": "edit with \"320\" Price field on Edit Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 119,
  "name": "click button Save and Return on Edit Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 120,
  "name": "close Session on Dashboard page",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnToursMenu()"
});
formatter.result({
  "duration": 176862000,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca href\u003d\"#Tours\" data-toggle\u003d\"collapse\" aria-expanded\u003d\"false\"\u003e...\u003c/a\u003e is not clickable at point (120, 434). Other element would receive the click: \u003cdiv id\u003d\"select2-drop-mask\" class\u003d\"select2-drop-mask\" style\u003d\"display: block;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d74.0.3729.131)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-K048LMK\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Pame\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 74.0.3729.131, webStorageEnabled: true}\nSession ID: 52d128beba63b72e3eb81a8fefaf395f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat org.umssdiplo.automationv01.core.utils.CommonEvents.clickButton(CommonEvents.java:36)\r\n\tat org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard.clickToursMenu(Dashboard.java:20)\r\n\tat org.umssdiplo.automationv01.stepdefinitionproject.StepsDefinitionPHPtravel.clickOnToursMenu(StepsDefinitionPHPtravel.java:62)\r\n\tat ✽.And click on tours menu(PhpTravel.feature:108)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.goToTheAirlinePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnSearchButtonOnExtrasPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cochabamba",
      "offset": 24
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillElementToSearchSearchFieldOnExtrasPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Name",
      "offset": 17
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectByFieldOnExtrasPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnGOButtonOnExtrasPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.chooseTheElementToSelectOnAirlinePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnIconEditElementSelectedOnExtraPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cochabamba",
      "offset": 11
    }
  ],
  "location": "StepsDefinitionPHPtravel.editWithNameFieldOnEditExtrasPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "No",
      "offset": 13
    }
  ],
  "location": "StepsDefinitionPHPtravel.editWithStatusFieldOnEditExtrasPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "320",
      "offset": 11
    }
  ],
  "location": "StepsDefinitionPHPtravel.editWithPriceFieldOnEditExtrasPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickButtonSaveAndReturnOnEditExtrasPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.cerrarSesionOnDashboardPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 123,
  "name": "Delete the new Extra",
  "description": "",
  "id": "login;delete-the-new-extra",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 122,
      "name": "@DNE"
    }
  ]
});
formatter.step({
  "line": 124,
  "name": "click on tours menu",
  "keyword": "And "
});
formatter.step({
  "line": 125,
  "name": "go to the Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 126,
  "name": "click on Search button on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 127,
  "name": "fill element to search \"Cochabamba\" Search field on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 128,
  "name": "select by field \"Name\" on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 129,
  "name": "click on GO button on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 130,
  "name": "choose the element to select on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 131,
  "name": "click on icon delete element selected on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 132,
  "name": "press on the Enter key to delete the chosen element on Extras page",
  "keyword": "And "
});
formatter.step({
  "line": 133,
  "name": "close Session on Dashboard page",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnToursMenu()"
});
formatter.result({
  "duration": 186260700,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca href\u003d\"#Tours\" data-toggle\u003d\"collapse\" aria-expanded\u003d\"false\"\u003e...\u003c/a\u003e is not clickable at point (120, 434). Other element would receive the click: \u003cdiv id\u003d\"select2-drop-mask\" class\u003d\"select2-drop-mask\" style\u003d\"display: block;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d74.0.3729.131)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-K048LMK\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Pame\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 74.0.3729.131, webStorageEnabled: true}\nSession ID: 52d128beba63b72e3eb81a8fefaf395f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat org.umssdiplo.automationv01.core.utils.CommonEvents.clickButton(CommonEvents.java:36)\r\n\tat org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard.clickToursMenu(Dashboard.java:20)\r\n\tat org.umssdiplo.automationv01.stepdefinitionproject.StepsDefinitionPHPtravel.clickOnToursMenu(StepsDefinitionPHPtravel.java:62)\r\n\tat ✽.And click on tours menu(PhpTravel.feature:124)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.goToTheAirlinePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnSearchButtonOnExtrasPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Cochabamba",
      "offset": 24
    }
  ],
  "location": "StepsDefinitionPHPtravel.fillElementToSearchSearchFieldOnExtrasPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Name",
      "offset": 17
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectByFieldOnExtrasPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnGOButtonOnExtrasPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.chooseTheElementToSelectOnAirlinePage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnIconDeleteElementSelectedOnExtrasPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.pressOnTheEnterKeyToDeleteTheChosenElementOnExtrasPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.cerrarSesionOnDashboardPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 136,
  "name": "Change Target",
  "description": "",
  "id": "login;change-target",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 135,
      "name": "@ST"
    }
  ]
});
formatter.step({
  "line": 137,
  "name": "click on tours menu",
  "keyword": "And "
});
formatter.step({
  "line": 138,
  "name": "go to the Setting page",
  "keyword": "And "
});
formatter.step({
  "line": 139,
  "name": "select \"Self\" Target on Setting page",
  "keyword": "And "
});
formatter.step({
  "line": 140,
  "name": "click on Submit Button on Setting page",
  "keyword": "And "
});
formatter.step({
  "line": 141,
  "name": "close Session on Dashboard page",
  "keyword": "And "
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnToursMenu()"
});
formatter.result({
  "duration": 182702200,
  "error_message": "org.openqa.selenium.WebDriverException: unknown error: Element \u003ca href\u003d\"#Tours\" data-toggle\u003d\"collapse\" aria-expanded\u003d\"false\"\u003e...\u003c/a\u003e is not clickable at point (120, 434). Other element would receive the click: \u003cdiv id\u003d\"select2-drop-mask\" class\u003d\"select2-drop-mask\" style\u003d\"display: block;\"\u003e\u003c/div\u003e\n  (Session info: chrome\u003d74.0.3729.131)\n  (Driver info: chromedriver\u003d2.40.565498 (ea082db3280dd6843ebfb08a625e3eb905c4f5ab),platform\u003dWindows NT 10.0.17763 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nBuild info: version: \u00273.12.0\u0027, revision: \u00277c6e0b3\u0027, time: \u00272018-05-08T14:04:26.12Z\u0027\nSystem info: host: \u0027DESKTOP-K048LMK\u0027, ip: \u0027192.168.0.12\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 2.40.565498 (ea082db3280dd6..., userDataDir: C:\\Users\\Pame\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, rotatable: false, setWindowRect: true, takesHeapSnapshot: true, takesScreenshot: true, unexpectedAlertBehaviour: , unhandledPromptBehavior: , version: 74.0.3729.131, webStorageEnabled: true}\nSession ID: 52d128beba63b72e3eb81a8fefaf395f\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:543)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:276)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:83)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\r\n\tat org.umssdiplo.automationv01.core.utils.CommonEvents.clickButton(CommonEvents.java:36)\r\n\tat org.umssdiplo.automationv01.core.managepage.Dashboard.Dashboard.clickToursMenu(Dashboard.java:20)\r\n\tat org.umssdiplo.automationv01.stepdefinitionproject.StepsDefinitionPHPtravel.clickOnToursMenu(StepsDefinitionPHPtravel.java:62)\r\n\tat ✽.And click on tours menu(PhpTravel.feature:137)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.goToTheSettingPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "Self",
      "offset": 8
    }
  ],
  "location": "StepsDefinitionPHPtravel.selectTargetOnSettingPage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.clickOnSubmitButtonOnSettingPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "StepsDefinitionPHPtravel.cerrarSesionOnDashboardPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.uri("redirectFileStepDefintions.feature");
formatter.feature({
  "line": 1,
  "name": "RedirectNewFile",
  "description": "",
  "id": "redirectnewfile",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Testing new path",
  "description": "",
  "id": "redirectnewfile;testing-new-path",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "Tesitng path to generate filed",
  "keyword": "Given "
});
formatter.match({
  "location": "CommonStepdef.tesitngPathToGenerateFiled()"
});
formatter.result({
  "duration": 244200,
  "status": "passed"
});
formatter.uri("userFeatureFiles.feature");
formatter.feature({
  "line": 1,
  "name": "testing",
  "description": "",
  "id": "testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "first scenario",
  "description": "",
  "id": "testing;first-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@bvt"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "first introduction to cucumber with java",
  "keyword": "Given "
});
formatter.match({
  "location": "GeneralSteps.firstIntroductionToCucumberWithJava()"
});
formatter.result({
  "duration": 187900,
  "status": "passed"
});
});