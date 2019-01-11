#Java docker file
FROM tomcat:8.5.37-jre8

# Move jar file to working directory
ADD first-web-app-0.0.1-SNAPSHOT.war /usr/local/tomcat/webapps/first-web-app.war

# Command to run docker image after build
# docker run -d -p 8888:8080 --name test-web-app test-docker-web-app
