package utils;

public class EnvironmentProperties {

    private static final String PATH =  "src\\test\\resources\\test.properties";

    private static final String URL = "url";

    public static String getUrl(){
        String url = System.getProperty(URL);
        if (url == null) {
            url = PropertyReader.getProperty(PATH, URL);
        }
        return url;
    }
}
