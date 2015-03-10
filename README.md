# Samsung's Android SNS Exploit

Proof of concept of vulnerabilities in Samsung's SNS application.

##How it works:

Install the APK in your Samsung phone. The application requests the custom SNS permissions to communicate with SNS Facebook and Twitter's protected services. Only when showing all the permissions, a user can see the extra permissions named Default and whose description are "string resource". The POC tries to connects to both SNS Facebook's exported services (the protected and the unprotected one) and the Twitter's permission protected service.

When clicking the first button, the application obtains the user Twitter access token from SNS's Twitter service if the application has been granted one. This works on devices running SNS's versions greater than 1.1.1. When clicking the second, it tries to obtain the Facebook access token. Lastly, the third button calls one of the method from unprotected SnsFbService to posts a new feed with the text "Hackers o dominados" in the user's Facebook timeline. This last button should no longer work because Samsung has disabled the Facebook app.
