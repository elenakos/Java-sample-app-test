This repository contains a simple Android application and tests written in Appium Java client and Espresso.

To add elements and actions to the application, open a project in Android Studio and make changes in these files:
```
> testing/android/sample/app/src/main/res/layout
> testing/android/sample/app/src/main/java/org/example/sample/MainActivity.java
```
![img.png](img.png)


**Espresso** tests can be updated and executed in Android Studio:
```
> testing/android/sample/app/src/androidTest/java/org/example/sample/MainActivityJTest.java
```

This **[post](https://elenakostrygina.wordpress.com/2025/03/17/how-to-run-tests-in-firebase-test-lab/)** outlines how to configure a project to run tests in Google Firebase Test Lab



**Appium** tests written with **Java client** are located in the below link. Use IntelliJ to update and execute them. 
```
 > testing/appium/appium_android_java/src/test/java/org/example/SampleTest.java
```





