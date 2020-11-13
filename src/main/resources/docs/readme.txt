JVM parameter
-Dlog4j.configurationFile=classpath:log4j2.xml


Urls
https://www.journaldev.com/7128/log4j2-example-tutorial-configuration-levels-appenders
https://logging.apache.org/log4j/2.x/maven-artifacts.html
https://mkyong.com/logging/log4j2-xml-example/

Cascade for Config file lookup
------------------------------
If no system property is set the configuration will be looked in the classpath in the following order
Property -> log4j2-test.properties
YAML -> log4j2-test.yaml or log4j2-test.yml
JSON -> log4j2-test.jsn or log4j2-test.json
XML -> log4j2-test.xml
Property -> log4j2.properties
YAML -> log4j2.yml or log4j2.yaml
JSON -> log4j2.jsn or log4j2.json
XML -> log4j2.xml
If no configuration file is found, the default configuration takes place with the following behavior
Root logger will be used.
Root logger level will be set to ERROR.
Root logger will propagate logging messages into console.
PatternLayout is set to be %d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n