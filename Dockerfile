FROM tomcat:10.1-jdk21-temurin

# Remove default apps (optional)
RUN rm -rf /usr/local/tomcat/webapps/*

# Copy WAR to Tomcat's webapps directory
COPY target/one-*.war /usr/local/tomcat/webapps/one.war

# Expose port
EXPOSE 8080