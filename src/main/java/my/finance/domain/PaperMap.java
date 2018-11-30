package my.finance.domain;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

@Component
public class PaperMap {
    private HashMap<String, String> urlMap = new HashMap<>();

    public PaperMap() throws IOException {
        this.urlMap = getData();
    }

    public HashMap<String, String> getUrlMap() {
        return urlMap;
    }

    public HashMap<String, String> getData() throws IOException {
        HashMap<String, String> urlMap = new HashMap<>();
        Properties properties = new Properties();
        String propFileName = "application.properties";  // properties파일명

        InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
        properties.load(inputStream);
        for(String key : properties.stringPropertyNames()) {
            if (key.contains("newspapers")) {
                urlMap.put(key, properties.getProperty(key));
            }
        }
        return urlMap;
    }

}
