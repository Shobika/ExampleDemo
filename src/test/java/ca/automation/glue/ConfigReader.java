package ca.automation.glue;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * created by Shoby on 2019-12-02
 **/

public class ConfigReader {

    public static String getPropertyvalue(String property) throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/cucumber.properties"));
        String propertyFileValue = prop.getProperty(property);
        String systemValue = System.getProperty(property);

        if (systemValue != null) {
            propertyFileValue = systemValue;
        }
        return propertyFileValue;
    }
}
