package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    static {
        try {
            String filePath = "C:/Users/sdurmus/IdeaProjec/CucumberExamples/configuration.properties";
            FileInputStream inputStream = new FileInputStream(filePath);
            properties = new Properties();
            properties.load(inputStream);
            inputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration file not found at"+e.getMessage());
        }
    }

    public static String getProperty(String key){
        return properties.getProperty(key);

    }
}


