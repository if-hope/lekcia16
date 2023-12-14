package utils;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertyReader {

    public static String getProperty(String path, String propertyName){

        Properties properties = new Properties();

        try {
            InputStream stream = Files.newInputStream(Paths.get(path));
            properties.load(stream);
        } catch (IOException e) {
            throw new RuntimeException("File not found by path" + path + e);
        }

        return properties.getProperty(propertyName);
    }

}
