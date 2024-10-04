$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Feature/01fb.feature");
formatter.feature({
  "name": "To validate Login functionality of Facebook application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature1"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbDefine.to_launch_the_chrome_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate invalide usename and valide password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "To enter the invalide username in emailfield",
  "rows": [
    {
      "cells": [
        "username",
        "priya"
      ]
    },
    {
      "cells": [
        "mobilenumber",
        "9876543210"
      ]
    },
    {
      "cells": [
        "password",
        "priya123"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "FbDefine.to_enter_the_invalide_username_in_emailfield(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To enter the valide password in password field",
  "rows": [
    {
      "cells": [
        "pass1",
        "pass2",
        "pass3"
      ]
    },
    {
      "cells": [
        "12345",
        "213tfgax",
        "ajhsxa87654"
      ]
    },
    {
      "cells": [
        "000000",
        "1111111111",
        "qiwusiqkaz"
      ]
    },
    {
      "cells": [
        "09876543",
        "amsxqjkhws1i",
        "kjws9827x"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "FbDefine.to_enter_the_valide_password_in_password_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbDefine.to_click_the_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To close chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbDefine.to_close_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate valide usename and invalide password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "enter the invalide username \"\u003cemailfield\u003e\" in emailfield",
  "keyword": "When "
});
formatter.step({
  "name": "enter the valide password \"\u003cpasswordfield\u003e\" in password field",
  "keyword": "And "
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.step({
  "name": "close chrome browser",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emailfield",
        "passwordfield"
      ]
    },
    {
      "cells": [
        "12345@gmail.com",
        "12345"
      ]
    },
    {
      "cells": [
        "cucumber@gmail.com",
        "cucumber"
      ]
    },
    {
      "cells": [
        "sql123@gmail.com",
        "sql"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbDefine.to_launch_the_chrome_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate valide usename and invalide password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "enter the invalide username \"12345@gmail.com\" in emailfield",
  "keyword": "When "
});
formatter.match({
  "location": "FbBulkOfDataDefine.enterTheInvalideUsernameInEmailfield(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the valide password \"12345\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkOfDataDefine.enterTheValidePasswordInPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkOfDataDefine.clickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbBulkOfDataDefine.closeChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbDefine.to_launch_the_chrome_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate valide usename and invalide password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "enter the invalide username \"cucumber@gmail.com\" in emailfield",
  "keyword": "When "
});
formatter.match({
  "location": "FbBulkOfDataDefine.enterTheInvalideUsernameInEmailfield(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the valide password \"cucumber\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkOfDataDefine.enterTheValidePasswordInPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkOfDataDefine.clickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbBulkOfDataDefine.closeChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch the chrome browser and hit the url",
  "keyword": "Given "
});
formatter.match({
  "location": "FbDefine.to_launch_the_chrome_browser_and_hit_the_url()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate valide usename and invalide password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@feature1"
    },
    {
      "name": "@regression"
    }
  ]
});
formatter.step({
  "name": "enter the invalide username \"sql123@gmail.com\" in emailfield",
  "keyword": "When "
});
formatter.match({
  "location": "FbBulkOfDataDefine.enterTheInvalideUsernameInEmailfield(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the valide password \"sql\" in password field",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkOfDataDefine.enterTheValidePasswordInPasswordField(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click the login button",
  "keyword": "And "
});
formatter.match({
  "location": "FbBulkOfDataDefine.clickTheLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close chrome browser",
  "keyword": "Then "
});
formatter.match({
  "location": "FbBulkOfDataDefine.closeChromeBrowser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("src/test/resources/Feature/02amazon.feature");
formatter.feature({
  "name": "To validate SignIn functionality of Amazon application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@feature2"
    }
  ]
});
formatter.scenario({
  "name": "To validate valide username and valies paessword",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@feature2"
    },
    {
      "name": "@smoke"
    },
    {
      "name": "@sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Launch the chrome browser and hit the amazon url",
  "keyword": "Given "
});
formatter.match({
  "location": "AmazonSignInDefine.launch_the_chrome_browser_and_hit_the_amazon_url()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To send the username or mobile number in enmaild field",
  "keyword": "When "
});
formatter.match({
  "location": "AmazonSignInDefine.to_send_the_username_or_mobile_number_in_enmaild_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click continue button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSignInDefine.to_click_continue_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To send the password in password field",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSignInDefine.to_send_the_password_in_password_field()"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[12345]\u003e but was:\u003c[sathya]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat org.stepdefinition.AmazonSignInDefine.to_send_the_password_in_password_field(AmazonSignInDefine.java:40)\r\n\tat ✽.To send the password in password field(src/test/resources/Feature/02amazon.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "To click the sign in button",
  "keyword": "And "
});
formatter.match({
  "location": "AmazonSignInDefine.to_click_the_sign_in_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "To close the amazon page browser",
  "keyword": "Then "
});
formatter.match({
  "location": "AmazonSignInDefine.to_close_the_amazon_page_browser()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});