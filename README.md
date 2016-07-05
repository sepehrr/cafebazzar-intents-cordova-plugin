CafeBazaar Intents Plugin for Cordova/Phonegap
===================================

Requirements
-------------
Android 2.2 (API level 8) is required  
Compatible with Cordova 3.0 and above.

Usage
-------
CafeBazaar is biggest android applications marketplace in Iran. This plugin let you use CafeBazaar intents on your Cordova/Phonegap App.
Use this plugin only if you plan to release your Application on CafeBazaar.

if you want to show the page of an application on CafeBazaar:
<script type="text/javascript">
    CafeBazaar.viewApp(successHandler, errorHandler, appPackageName);
</script>

if you want to let user to rate an application and put comment for it on CafeBazaar:
<script type="text/javascript">
    CafeBazaar.rateApp(successHandler, errorHandler, appPackageName);
</script>

if you want to show all your applications on CafeBazaar:
<script type="text/javascript">
    CafeBazaar.viewDeveloperPage(successHandler, errorHandler, yourCafeBazaarDeveloperId);
</script>


Full example
----------------
```html
<!DOCTYPE html>
<html>
    <head>
        <title>CafeBazaar Intents for Cordova/Phonegap</title>
        <script type="text/javascript" src="cordova.js"></script>
    </head>
    <body>
        <button type="button" onclick="CafeBazaar.rateApp(null, null, 'com.google.android.apps.maps');">Rate and comment for Google Maps App</button><br>
        <button type="button" onclick="CafeBazaar.viewApp(null, null, 'com.google.android.apps.maps');">Show Google Maps App page on bBazaar</button><br>
        <button type="button" onclick="CafeBazaar.viewDeveloperPage(null, null, 'sepehrr');">My apps on Bazaar</button><br>
    </body>
</html>
```

License
----------------

The MIT License

Copyright (c) 2016
Sepehr Raftari

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
