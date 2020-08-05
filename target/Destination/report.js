$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/Resources/Features/login.feature");
formatter.feature({
  "line": 1,
  "name": "login feature",
  "description": "",
  "id": "login-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "user should Login successfully with valid credentials",
  "description": "",
  "id": "login-feature;user-should-login-successfully-with-valid-credentials",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@trial"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should login successfully",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "login-feature;user-should-login-successfully-with-valid-credentials;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10,
      "id": "login-feature;user-should-login-successfully-with-valid-credentials;;1"
    },
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 11,
      "id": "login-feature;user-should-login-successfully-with-valid-credentials;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 24821904100,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "user should Login successfully with valid credentials",
  "description": "",
  "id": "login-feature;user-should-login-successfully-with-valid-credentials;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@trial"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter \"Admin\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enter password \"admin123\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should login successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_login_page()"
});
formatter.result({
  "duration": 4157254000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Admin",
      "offset": 12
    }
  ],
  "location": "MyStepDefs.user_enter(String)"
});
formatter.result({
  "duration": 3865197600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "admin123",
      "offset": 21
    }
  ],
  "location": "MyStepDefs.user_enter_password(String)"
});
formatter.result({
  "duration": 3125163700,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.clickOnLoginButton()"
});
formatter.result({
  "duration": 5891718900,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_should_login_successfully()"
});
formatter.result({
  "duration": 2213682400,
  "status": "passed"
});
formatter.after({
  "duration": 2711699600,
  "status": "passed"
});
});