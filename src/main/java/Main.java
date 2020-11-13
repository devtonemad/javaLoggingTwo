import org.apache.logging.log4j.LogManager;

import org.apache.logging.log4j.Logger;
import org.example.content.Content;

import java.util.Properties;


public class Main {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        Properties properties = new Properties();
        properties.setProperty("log4j.configurationFile", "C:\\Users\\matthias\\IdeaProjects\\loggingTwo\\src\\main\\resources\\repo\\log4j2.xml");
        System.setProperties(properties);

        log.error("Configuration File Defined To Be :: "+System.getProperty("log4j.configurationFile"));
        System.out.println("Hello");
        log.error("This is an Error");
        Content content = new Content();
        content.print();

    }
}
