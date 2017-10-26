Spring Boot Demo
================

This demo is made with the intention of showing how to setup a Spring Boot app.
Some features are added here:

- Swagger (with Springfox Swagger)
- Static analysis tools (Checkstyle, PMD and Findbugs)
- Jenkins-readiness (with a Jenkinsfile)

This was made following the 2 rules from A. Martini, [preemptive commit comments](https://arialdomartini.wordpress.com/2012/09/03/pre-emptive-commit-comments/):

Rule #1: write commit comments before coding
Rule #2: write what the software should be supposed to do, not what you did

Requirements
------------

In order to use this demo, it is needed to have installed:

- Java 8
- An IDE (IntelliJ is recommended)
- Git

Launching the app
-----------------

Since this app is made with a Gradle wrapper, no Gradle client is required.
All you need to do is to run this command in a bash terminal:

  ./gradlew clean bootRun

After that, you can play with the running application in your favorite browser by checking the swagger-ui generated documentation in the following URL:
http://localhost:8081/swagger-ui.html

