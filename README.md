This application is sample application to generate a random string from a words list

As of today, random string is generated from static file."words.txt" from resources. Application can be
extended to read the string from DB/cache and can increase scaling accordingly.

Steps :
Command to build : ./gradlew clean build

Command to run application : java -jar build/libs/stringgenerator-0.0.1-SNAPSHOT.jar

Application can be accessed using : http://localhost:9090/v1/api/randomString

Application is also integrated with swagger ui to play around Api's.
Below is the url 

http://localhost:9090/swagger-ui.html#!/random45string45controller/getRandomStringUsingGET_1

Added integration / unit test samples
